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
 * @author dulan
 */
public class MarriageDAO 
    {
    String url = "jdbc:mysql://localhost:3306/cert_system";
    String username = "root";
    String password = "";
    
    public void input(String Name, String Address, String Marriage_type, String No_of_copies, String M_fullname, String F_fullname, String Certifier, String Id_no, String District, String Date, String Exact_date, String Email) throws Exception{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            String quary  = "INSERT INTO marriage_cert (name,address,marriage_type,no_of_copies,m_fullname,f_fullname,certifier,Id_no,district,date,exact_date,email) VALUES ('" + Name + "','" + Address + "','" + Marriage_type + "','" + No_of_copies +"','" + M_fullname + "','" + F_fullname + "','" + Certifier + "','" + Id_no + "','" + District + "','" + Date + "','" + Exact_date + "','" + Email + "')";
            st.executeUpdate(quary);
    }

   
    
    
}

    

