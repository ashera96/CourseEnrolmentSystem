/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.postgraduate;
import Model.student;
import java.sql.*;

/**
 *
 * @author Ashera
 */
public class postgraduateController {
    
    public static int addStudent(student stud) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO student VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, stud.getStudent_id());
        st.setString(2, stud.getName());
        st.setString(3, stud.getAddress());
        st.setString(4, stud.getNic());
        st.setString(5, stud.getContact_number());
        st.setString(6, stud.getGender());
        st.setString(7, stud.getEmail());
        st.setString(8, stud.getFaculty_id());
        st.setString(9, stud.getIntake_month());
        return st.executeUpdate();
    }
    
    public static int addPostgraduate(postgraduate postgrad) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO postgraduate VALUES(?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,postgrad.getStudent_id());
        st.setString(2,postgrad.getQualification_type());
        st.setString(3,postgrad.getInstitute());
        st.setInt(4,postgrad.getYear_of_completion());
        st.setString(5,postgrad.getCourse_id());
        return st.executeUpdate();
    }
    
    public static String getPostgradStudentFaculty(String id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT faculty_id FROM student WHERE student_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return (rs.getString("faculty_id"));
        else
            return null;
    }
    
    public static postgraduate searchPostgraduate(String id) throws SQLException {
        String sql = "SELECT * FROM postgraduate WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            postgraduate postgrad = new postgraduate(rs.getString("student_id"),rs.getString("qualification_type"),rs.getString("institute"),rs.getInt("year_of_completion"),rs.getString("course_id"));
            return postgrad;
        }else {
            return null;
        }
    }

    public static int updatePostgraduate(postgraduate postgrad) throws SQLException {
        String sql = "UPDATE postgraduate SET qualification_type=?,institute=?,year_of_completion=?,course_id=? WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(5, postgrad.getStudent_id());
        st.setString(1, postgrad.getQualification_type());
        st.setString(2, postgrad.getInstitute());
        st.setInt(3, postgrad.getYear_of_completion());
        st.setString(4, postgrad.getCourse_id());
        return st.executeUpdate();
    }
}