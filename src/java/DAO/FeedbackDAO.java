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
public class FeedbackDAO {
    String url = "jdbc:mysql://localhost:3306/cert_system";
    String username = "root";
    String password = "";
    
    public void input(String Name, String Mail, String Message) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            String quary  = "INSERT INTO feedbacks (name,email,message) VALUES ('" + Name + "','" + Mail + "','" + Message + "')";
            st.executeUpdate(quary);
    }
    
}
