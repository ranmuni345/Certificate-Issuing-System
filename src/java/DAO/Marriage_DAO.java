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
public class Marriage_DAO {
    String url = "jdbc:mysql://localhost:3306/cert_system";
    String username = "root";
    String password = "";
    
    public void input(String Certifer,String Date,String District,String Email,String Exact_date,String F_fullname,String ID_no,String M_fullname,String Marraige_type,String No_of_copies,String Address) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
     
            String quary;
     String Name = null;
     quary = "INSERT INTO Marriage_Cert (name,address,marraige_type,no_of_copies,m_fullname,f_fullname,certifier,id_no,district,date,exact_date,email) VALUES ('" + Name + "','" + Address + "','" + Marraige_type + "' ,'" + No_of_copies +"','" + M_fullname +"','" + F_fullname +"','" + Certifer +"','" + ID_no +"','" + District +"','" + Date +"','" + Exact_date +"','" + Email +"' )";
            st.executeUpdate(quary);
    }   

    public void input(String Name, String Address, String Marraige_type, String No_of_copies, String M_fullname, String F_fullname, String Certifier, String ID_no, String District, String Date, String Exact_date, String Email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
