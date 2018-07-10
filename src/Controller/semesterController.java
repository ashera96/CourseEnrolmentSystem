/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.semester;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Ashera
 */
public class semesterController {
    
    public static int findSemesterID(semester sem) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT * FROM semester WHERE year=? && semester_number=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, sem.getYear());
        st.setInt(2, sem.getSemester_number());
        ResultSet rs = st.executeQuery();
        if (rs.next()){
            return (rs.getInt("semester_id"));
        }else {
            return -1;
        }
    }
    
    public static String getSemesterStartDate(String course_id, int semester_id) throws SQLException {
       Connection conn = db_connection.connection();
       String sql = "SELECT sem_start_date FROM course_semester WHERE course_id=? && semester_id=?";
       PreparedStatement st = conn.prepareStatement(sql);
       st.setString(1, course_id);
       st.setInt(2, semester_id);
       ResultSet rs = st.executeQuery();
       if (rs.next())
           return rs.getString("sem_start_date");
       else
           return null;
    }
}