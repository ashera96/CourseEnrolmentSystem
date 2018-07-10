/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.subject;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Ashera
 */
public class subjectController {
    
    public static int addSubject(subject subj) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO subject VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, subj.getSubject_code());
        st.setString(2, subj.getSubject_name());
        st.setDouble(3, subj.getFee());
        st.setInt(4, subj.getCredits());
        st.setString(5, subj.getCourse_id());
        st.setInt(6, subj.getSemester_id());
        st.setString(7, subj.getLecturer_id());
        st.setString(8, subj.getDay_of_week());
        st.setString(9, subj.getTime_slot());
        st.setString(10, subj.getLecture_hall());
        st.setBoolean(11, subj.isIs_compulsory());
        return st.executeUpdate();
    }
    
    public static subject searchSubject(String subject_code) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT * FROM subject WHERE subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,subject_code);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            subject subj = new subject(rs.getString("subject_code"),rs.getString("subject_name"),rs.getDouble("fee"),rs.getInt("credits"),rs.getString("course_id"),rs.getInt("semester_id"),rs.getString("lecturer_id"),rs.getString("day_of_week"),rs.getString("time_slot"),rs.getString("lecture_hall"),rs.getBoolean("is_compulsory"));
            return subj;
        }else{
            return null;
        }
    }
    
    public static int updateSubject(subject subj) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "UPDATE subject SET subject_name=?,fee=?,credits=?,course_id=?,semester_id=?,lecturer_id=?,day_of_week=?,time_slot=?,lecture_hall=?,is_compulsory=? WHERE subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(11, subj.getSubject_code());
        st.setString(1, subj.getSubject_name());
        st.setDouble(2, subj.getFee());
        st.setInt(3, subj.getCredits());
        st.setString(4, subj.getCourse_id());
        st.setInt(5, subj.getSemester_id());
        st.setString(6, subj.getLecturer_id());
        st.setString(7, subj.getDay_of_week());
        st.setString(8, subj.getTime_slot());
        st.setString(9, subj.getLecture_hall());
        st.setBoolean(10, subj.isIs_compulsory());
        return st.executeUpdate();
    }
    
    public static int deleteSubject(String subject_code) throws SQLException {
        String sql = "DELETE FROM subject WHERE subject_code=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, subject_code);
        return st.executeUpdate();
    }
    
    public static ArrayList<String> getSubjects(String course_id,int semester_id,boolean is_compulsory) throws SQLException{
        Connection conn = db_connection.connection();
        ArrayList<String> subjectList = new ArrayList<>();
        String sql = "SELECT subject_name FROM subject WHERE course_id=? && semester_id=? && is_compulsory=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, course_id);
        st.setInt(2, semester_id);
        st.setBoolean(3, is_compulsory);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            subjectList.add(rs.getString("subject_name"));
        }
        return subjectList;
    }
    
    public static ArrayList<String> getCompulsorySubjects(String course_id,int semester_id,boolean is_compulsory) throws SQLException{
        Connection conn = db_connection.connection();
        ArrayList<String> subjectList = new ArrayList<>();
        String sql = "SELECT subject_code FROM subject WHERE course_id=? && semester_id=? && is_compulsory=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, course_id);
        st.setInt(2, semester_id);
        st.setBoolean(3, is_compulsory);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            subjectList.add(rs.getString("subject_code"));
        }
        return subjectList;
    }
    
    public static String getSubjectCode(String subject_name) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT subject_code FROM subject WHERE subject_name=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, subject_name);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return rs.getString("subject_code");
        else
            return null;
    }
    
    public static String getSubjectName(String subject_code) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT subject_name FROM subject WHERE subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, subject_code);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return rs.getString("subject_name");
        else
            return null;
    }
    
    public static int getCredits(String subject_code) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT credits FROM subject WHERE subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, subject_code);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return rs.getInt("credits");
        else
            return -1;
    }
}