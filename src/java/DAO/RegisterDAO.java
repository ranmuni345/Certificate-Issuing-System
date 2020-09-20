/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Sandun
 */
public class RegisterDAO {
    String url = "jdbc:mysql://localhost:3306/cert_system";
    String username = "root";
    String password = "";
    
    public void input(String User, String Pnum, String Mail, String Pass, String Confirm) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            String quary  = "INSERT INTO users (Uname,Phone,Mail,Pword,Approval) VALUES ('" + User + "','" + Pnum + "','" + Mail + "','" + Pass + "','" + Confirm + "')";
            st.executeUpdate(quary);
    }
    
}
