/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.instructor;
import java.sql.*;

/**
 *
 * @author Ashera
 */
public class instructorController {
    
    public static int addInstructor(instructor Instructor) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO instructor VALUES (?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, Instructor.getInstructor_id());
        st.setString(2, Instructor.getName());
        st.setString(3, Instructor.getAddress());
        st.setString(4, Instructor.getGender());
        st.setString(5, Instructor.getEmail());
        st.setString(6, Instructor.getNic());
        st.setString(7, Instructor.getContact_number());
        return st.executeUpdate();
    }
    
    public static instructor searchInstructor(String id) throws SQLException {
        String sql = "SELECT * FROM instructor where instructor_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            instructor Instructor  = new instructor(rs.getString("instructor_id"),rs.getString("name"),rs.getString("address"),rs.getString("gender"),rs.getString("email"),rs.getString("nic"),rs.getString("contact_number"));
            return Instructor;
        }else{
            return null;
        }
    }
    
    public static int updateInstructor(instructor Instructor) throws SQLException {
        String sql = "UPDATE instructor SET name=?,address=?,gender=?,email=?,nic=?,contact_number=? WHERE instructor_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(7, Instructor.getInstructor_id());
        st.setString(1, Instructor.getName());
        st.setString(2, Instructor.getAddress());
        st.setString(3, Instructor.getGender());
        st.setString(4, Instructor.getEmail());
        st.setString(5, Instructor.getNic());
        st.setString(6, Instructor.getContact_number());
        return st.executeUpdate();
    }
    
    public static int deleteInstructor(String id) throws SQLException {
        String sql = "DELETE FROM instructor WHERE instructor_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        return st.executeUpdate();
    }    
  
}

