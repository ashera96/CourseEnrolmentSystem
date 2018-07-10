/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.lab;
import java.sql.*;
/**
 *
 * @author Ashera
 */
public class labController {
    public static int addLabSession(lab labSession) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO lab VALUES (?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, labSession.getDay_of_week());
        st.setString(2, labSession.getTime_slot());
        st.setString(3, labSession.getLab_code());
        st.setString(4, labSession.getSubject_code());
        st.setString(5, labSession.getInstructor_id());
        st.setString(6, labSession.getStudent_list());
        return st.executeUpdate();
    }
    
    public static int updateLabSession(lab labSession) throws SQLException {
        String sql = "UPDATE lab SET subject_code=?,instructor_id=?,student_list=? WHERE day_of_week=? AND time_slot=? AND lab_code=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(4, labSession.getDay_of_week());
        st.setString(5, labSession.getTime_slot());
        st.setString(6, labSession.getLab_code());
        st.setString(1, labSession.getSubject_code());
        st.setString(2, labSession.getInstructor_id());
        st.setString(3, labSession.getStudent_list());
        return st.executeUpdate();
    }
    
    public static int deleteLabSession(String day_of_week, String time_slot, String lab_code) throws SQLException {
        String sql = "DELETE FROM lab WHERE day_of_week=? AND time_slot=? AND lab_code=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, day_of_week);
        st.setString(2, time_slot);
        st.setString(3, lab_code);
        return st.executeUpdate();
    }

    public static lab searchLabSession(String day_of_week,String time_slot,String lab_code) throws SQLException {
        String sql = "SELECT * FROM lab WHERE day_of_week=? AND time_slot=? AND lab_code=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, day_of_week);
        st.setString(2, time_slot);
        st.setString(3, lab_code);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            lab labSession  = new lab(rs.getString("day_of_week"),rs.getString("time_slot"),rs.getString("lab_code"),rs.getString("subject_code"),rs.getString("instructor_id"),rs.getString("student_list"));
            return labSession;
        }else{
            return null;
        }
    }
    
}
