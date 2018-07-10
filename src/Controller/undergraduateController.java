/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.student;
import Model.undergraduate;
import java.sql.*;

/**
 *
 * @author Ashera
 */
public class undergraduateController {
    
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
    
    public static int addUndergraduate(undergraduate undergrad) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "INSERT INTO undergraduate VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,undergrad.getStudent_id());
        st.setString(2,undergrad.getSubject_1());
        st.setString(3,undergrad.getSubject_2());
        st.setString(4,undergrad.getSubject_3());
        st.setString(5,undergrad.getSubject_result_1());
        st.setString(6,undergrad.getSubject_result_2());
        st.setString(7,undergrad.getSubject_result_3());
        st.setDouble(8, undergrad.getZ_score());
        st.setInt(9, undergrad.getIndex_number());
        st.setInt(10, undergrad.getRank());
        st.setString(11, undergrad.getCourse_id());
        return st.executeUpdate();
    }
    
    public static ResultSet checkStudentID(String id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT * FROM student WHERE student_id='"+id+"'";
        Statement st = conn.createStatement();
        return st.executeQuery(sql);
    }
    
    public static student searchStudent(String id) throws SQLException {
        String sql = "SELECT * FROM student WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            student stud = new student(rs.getString("student_id"),rs.getString("name"),rs.getString("address"),rs.getString("nic"),rs.getString("contact_number"),rs.getString("gender"),rs.getString("email"),rs.getString("faculty_id"),rs.getString("intake_month"));
            return stud;
        }else {
            return null;
        }
    }
    
    public static int updateStudent(student stud) throws SQLException {
        String sql = "UPDATE student SET name=?,address=?,nic=?,contact_number=?,gender=?,email=?,faculty_id=?,intake_month=? WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(9, stud.getStudent_id());
        st.setString(1, stud.getName());
        st.setString(2, stud.getAddress());
        st.setString(3, stud.getNic());
        st.setString(4, stud.getContact_number());
        st.setString(5, stud.getGender());
        st.setString(6, stud.getEmail());
        st.setString(7, stud.getFaculty_id());
        st.setString(8, stud.getIntake_month());
        return st.executeUpdate();
    }
    
    public static int deleteStudent(String id) throws SQLException {
        String sql = "DELETE FROM student WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, id);
        return st.executeUpdate();
    }
    
    public static String getUndergradStudentFaculty(String id) throws SQLException {
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
    
    public static undergraduate searchUndergraduate(String id) throws SQLException {
        String sql = "SELECT * FROM undergraduate WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1,id);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            undergraduate undergrad = new undergraduate(rs.getString("student_id"),rs.getString("subject_1"),rs.getString("subject_2"),rs.getString("subject_3"),rs.getString("subject_result_1"),rs.getString("subject_result_2"),rs.getString("subject_result_3"),rs.getDouble("z_score"),rs.getInt("index_number"),rs.getInt("rank"),rs.getString("course_id"));
            return undergrad;
        }else {
            return null;
        }
    }
    
    public static int updateUndergraduate(undergraduate undergrad) throws SQLException {
        String sql = "UPDATE undergraduate SET subject_1=?,subject_2=?,subject_3=?,subject_result_1=?,subject_result_2=?,subject_result_3=?,z_score=?,index_number=?,rank=?,course_id=? WHERE student_id=?";
        Connection conn = db_connection.connection();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(11, undergrad.getStudent_id());
        st.setString(1, undergrad.getSubject_1());
        st.setString(2, undergrad.getSubject_2());
        st.setString(3, undergrad.getSubject_3());
        st.setString(4, undergrad.getSubject_result_1());
        st.setString(5, undergrad.getSubject_result_2());
        st.setString(6, undergrad.getSubject_result_3());
        st.setDouble(7, undergrad.getZ_score());
        st.setInt(8, undergrad.getIndex_number());
        st.setInt(9, undergrad.getRank());
        st.setString(10, undergrad.getCourse_id());
        return st.executeUpdate();
    }
    
    public static String getStudentEmailAddress(String student_id) throws SQLException {
        Connection conn = db_connection.connection();
        String sql = "SELECT email FROM student WHERE student_id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, student_id);
        ResultSet rs = st.executeQuery();
        if (rs.next())
            return (rs.getString("email"));
        else
            return null;
    }
    
}