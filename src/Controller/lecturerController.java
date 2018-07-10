/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.lecturer;
import java.sql.*;

/**
 *
 * @author Ashera
 */
public class lecturerController {
    
    public static int addLecturer(lecturer Lecturer) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO lecturer VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, Lecturer.getLecturer_id());
        st.setString(2, Lecturer.getName());
        st.setString(3, Lecturer.getAddress());
        st.setString(4, Lecturer.getGender());
        st.setString(5, Lecturer.getEmail());
        st.setString(6, Lecturer.getNic());
        st.setString(7, Lecturer.getContact_number());
        st.setInt(8, Lecturer.getRoom_number());
        return st.executeUpdate();
    }
    
    public static lecturer searchLecturer(String id) throws SQLException {
        String sql = "SELECT * FROM lecturer where lecturer_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            lecturer Lecturer  = new lecturer(rs.getString("lecturer_id"),rs.getString("name"),rs.getString("address"),rs.getString("gender"),rs.getString("email"),rs.getString("nic"),rs.getString("contact_number"),rs.getInt("room_number"));
            return Lecturer;
        }else{
            return null;
        }
    }
    
    public static int updateLecturer(lecturer Lecturer) throws SQLException {
        String sql = "UPDATE lecturer SET name=?,address=?,gender=?,email=?,nic=?,contact_number=?,room_number=? WHERE lecturer_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(8, Lecturer.getLecturer_id());
        st.setString(1, Lecturer.getName());
        st.setString(2, Lecturer.getAddress());
        st.setString(3, Lecturer.getGender());
        st.setString(4, Lecturer.getEmail());
        st.setString(5, Lecturer.getNic());
        st.setString(6, Lecturer.getContact_number());
        st.setInt(7, Lecturer.getRoom_number());
        return st.executeUpdate();
    }
    
    public static int deleteLecturer(String id) throws SQLException {
        String sql = "DELETE FROM lecturer WHERE lecturer_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        return st.executeUpdate();
    }
    
}  