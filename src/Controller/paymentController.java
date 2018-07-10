/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.payment;
import java.sql.*;

/**
 *
 * @author Ashera
 */
public class paymentController {
    
    public static int checkStudentEnrolment(String student_id, int semester_id) throws SQLException {
        String sql = "SELECT * FROM student_subject_semester WHERE student_id=? and semester_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, semester_id);
        ResultSet rs = st.executeQuery();
        if (rs.next()){
            return 1;
        }
        else{
            return 0;
        }
    }
        
    public static double findTotalPayment(String student_id,int semester_id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT a.fee FROM subject AS a INNER JOIN student_subject_semester AS b ON a.subject_code=b.subject_code AND b.student_id=? and b.semester_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        st.setInt(2, semester_id);
        ResultSet rs = st.executeQuery();
        double total=0;
        while(rs.next()) {
            total+=rs.getDouble("fee");
        }
        return total;
    }      
    
    public static int addPaymentStudentDetails(payment Payment) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO payment(is_paid,student_id,semester_id) VALUES (?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setBoolean(1, Payment.isIs_paid());
        st.setString(2, Payment.getStudent_id());
        st.setInt(3, Payment.getSemester_id());
        return st.executeUpdate();
    }
}