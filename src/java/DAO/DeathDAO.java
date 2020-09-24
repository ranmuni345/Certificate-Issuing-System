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
public class DeathDAO {
    String url = "jdbc:mysql://localhost:3306/cert_system";
    String username = "root";
    String password = "";
    
    public void input(String Comment1, String Comment2, String Comment3, String Comment4, String Comment5, String Comment6, String Comment7, String Comment8, String Comment9, String Comment10, String Comment11, String Comment12) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st;
        st = conn.createStatement();
            String quary  = "INSERT INTO death (Comment1,Comment2,Comment3,Comment4,Comment5,Comment6,Comment7,Comment8,Comment9,Comment10,Comment11,Comment12) VALUES ('" + Comment1 + "','" + Comment2 + "','" + Comment3 + "','" + Comment4 + "','" + Comment5 + "','" + Comment6 + "','" + Comment7 + "','" + Comment8 + "','" + Comment9 + "','" + Comment10 + "','" + Comment11 + "','" + Comment12 + "')";
            st.executeUpdate(quary);
    }
}


    

