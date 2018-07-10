/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.student_subject_semester;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Ashera
 */
public class studentSubjectController {
 
    public static int addStudentSubject(student_subject_semester addstudsubj) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO student_subject_semester VALUES (?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, addstudsubj.getStudent_id());
        st.setString(2, addstudsubj.getSubject_code());
        st.setInt(3, addstudsubj.getSemester_id());
        return st.executeUpdate();
    } 
    
    public static ArrayList<String> getFollowingSubjectList(String student_id,int semester_id) throws SQLException {
        Connection conn = db_connection.connection();
        ArrayList<String> subjectList = new ArrayList<>();
        String sql = "SELECT a.subject_name FROM subject AS a INNER JOIN student_subject_semester AS b ON a.subject_code=b.subject_code AND b.student_id=? AND b.semester_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, semester_id);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            subjectList.add(rs.getString("subject_name"));
        }
        return subjectList;
    }
    
    public static ArrayList<String> getSelectedSubjectList(String student_id,int semester_id) throws SQLException {
        Connection conn = db_connection.connection();
        ArrayList<String> subjectList = new ArrayList<>();
        String sql = "SELECT a.subject_name FROM subject AS a INNER JOIN student_subject_semester AS b ON a.subject_code=b.subject_code AND a.is_compulsory=false AND b.student_id=? AND b.semester_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, semester_id);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            subjectList.add(rs.getString("subject_name"));
        }
        return subjectList;
    }
    
    public static int deleteSelection(String student_id,int semester_id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "DELETE FROM student_subject_semester WHERE student_id=? AND semester_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, semester_id);
        return st.executeUpdate();
    }

    public static ArrayList<String> getFollowingSubjectCodeList(String student_id,int semester_id) throws SQLException {
        Connection conn = db_connection.connection();
        ArrayList<String> subjectList = new ArrayList<>();
        String sql = "SELECT a.subject_code FROM subject AS a INNER JOIN student_subject_semester AS b ON a.subject_code=b.subject_code AND b.student_id=? AND b.semester_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, semester_id);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            subjectList.add(rs.getString("subject_code"));
        }
        return subjectList;
    }
}