/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatabaseConnection.db_connection;
import Model.admin;
import java.sql.*;


/**
 *
 * @author Ashera
 */
public class adminController {
    public static ResultSet checkLogin(admin administrator) throws SQLException {
        Connection conn = db_connection.connection();
        Statement st = conn.createStatement();
        
        String sql = "SELECT * FROM admin WHERE username = '" + administrator.getUsername() +"' && password = '" + administrator.getPassword() + "'";
        
        return st.executeQuery(sql);
    }
    
}