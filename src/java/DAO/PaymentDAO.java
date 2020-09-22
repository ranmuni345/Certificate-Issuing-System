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
 * @author hansikas
 */
public class PaymentDAO {
    
    String url = "jdbc:mysql://localhost:3306/cert_system";
    String username = "root";
    String password = "";
    
    public void input(String Firstname, String Email, String Address, String City, String State, String Zip, String Cardname, String Cardnumber, String Expmonth, String Expyear, String Cvv) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement st = conn.createStatement();
            String quary  = "INSERT INTO users (firstname,email,address,city,state,zip,cardname,cardnumber,expmonth,expyear,cvv) VALUES ('" + Firstname + "','" + Email + "','" + Address + "','" + City + "','" + State + "','" + Zip + "','" + Cardname + "','" + Cardnumber + "','" + Expmonth + "','" + Expyear + "','" + Cvv + "')";
            st.executeUpdate(quary);
    }

    public void input(String Comment1, String Comment2, String Comment3, String Id, String Tel1, String Tel2, String Comment4, String Comment5, String Comment6, String Comment7, String Comment8, String Comment9, String Comment10, String T) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
