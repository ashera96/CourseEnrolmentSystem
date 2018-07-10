/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Ashera
 */
public class courseController {
        
    public static ArrayList<String> addUndergraduateCourses(String facID) throws SQLException {
        Connection conn = db_connection.connection();
        Statement st=  conn.createStatement();
        ArrayList<String> courseList = new ArrayList<>(); 
        String sql = "SELECT course.course_name FROM course INNER JOIN bachelor_course ON bachelor_course.course_id = course.course_id && course.faculty_id = '" + facID + "'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            courseList.add(rs.getString("course_name"));
        }
        return courseList;
    }
    
    public static String findCourseID(String courseName) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT course_id FROM course WHERE course_name =?" ;
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,courseName);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            return (rs.getString("course_id"));
        }
        else{
            return null;
        }
    }
    
    public static String findCourseName(String courseID) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT course_name FROM course WHERE course_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, courseID);
        ResultSet rs = st.executeQuery();
        if (rs.next()){
            return (rs.getString("course_name"));
        }
        else{
            return null;
        }
    }
    
    public static ArrayList<String> addPostgraduateCourses(String facID) throws SQLException {
        Connection conn = db_connection.connection();
        Statement st=  conn.createStatement();
        ArrayList<String> courseList = new ArrayList<>(); 
        String sql = "SELECT course.course_name FROM course INNER JOIN master_course ON master_course.course_id = course.course_id && course.faculty_id = '" + facID + "'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            courseList.add(rs.getString("course_name"));
        }
        return courseList;
    }
    
    public static String getUndergraduateCourseID(String student_id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT course_id FROM undergraduate WHERE student_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,student_id);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return (rs.getString("course_id"));
        else
            return null;
    }

    public static String getPostgraduateCourseID(String student_id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT course_id FROM postgraduate WHERE student_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,student_id);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return (rs.getString("course_id"));
        else
            return null;
    }
        
}