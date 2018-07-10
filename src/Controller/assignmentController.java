/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.assignment;
import Model.mark;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Ashera
 */
public class assignmentController {
    public static int addAssignment(assignment Assignment) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO assignment(subject_code,assignment_type,weight) VALUES (?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, Assignment.getSubject_code());
        st.setString(2, Assignment.getAssignment_type());
        st.setInt(3, Assignment.getWeight());
        return st.executeUpdate();
    }
    
    public static ArrayList<Integer> getAssignmentList(String subject_code) throws SQLException {
        Connection conn =  db_connection.connection();
        ArrayList<Integer> assignmentList = new ArrayList<>();
        String sql = "SELECT * FROM assignment WHERE subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, subject_code);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            assignmentList.add(rs.getInt("assignment_id"));
        }
        return assignmentList;
    }
    
    public static String getAssignmentType(int assignment_id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT assignment_type FROM assignment WHERE assignment_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, assignment_id);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return rs.getString("assignment_type");
        else
            return null;
    }
    
    public static ResultSet checkStudentSubject(String student_id,String subject_code) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT * FROM student_subject_semester WHERE student_id='"+student_id+"' && subject_code='"+subject_code+"'";
        Statement st = conn.createStatement();
        return st.executeQuery(sql);
    }
    
    public static int addStudentAssignmentResults(String student_id,int assignment_id,int marks) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO student_subject_assignment VALUES(?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, assignment_id);
        st.setInt(3, marks);
        return st.executeUpdate();
    }
    
    public static int addStudentSubjectExamMarks(String student_id,String subject_code,int exam_mark) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO student_subject_exam_mark VALUES(?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setString(2, subject_code);
        st.setInt(3, exam_mark);
        return st.executeUpdate();
    }

    public static int getExamMark(String student_id, String subject_code) throws SQLException {
        Connection conn =  db_connection.connection();
        String sql = "SELECT * FROM student_subject_exam_mark WHERE student_id=? AND subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setString(2, subject_code);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return rs.getInt("exam_mark");
        else
            return -1;
    }
    
    public static ArrayList<mark> getMarkWeight(String student_id,String subject_code) throws SQLException {
        Connection conn = db_connection.connection();
        ArrayList<mark> markList = new ArrayList<>();
        String sql = "SELECT b.weight,a.mark FROM student_subject_assignment AS a INNER JOIN assignment AS b ON a.assignment_id = b.assignment_id AND a.student_id=? AND b.subject_code=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setString(2, subject_code);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            mark temp = new mark(Integer.parseInt(rs.getString("weight")),rs.getInt("mark"));
            markList.add(temp);
        }
        return markList;
    } 
}