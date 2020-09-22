/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hansikas
 */
@WebServlet(urlPatterns = {"/paymentServlet"})
public class paymentServlet extends HttpServlet {

    
    

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        
        String Firstname = request.getParameter("firstname");
        String Email = request.getParameter("email");
        String Address = request.getParameter("address");
        String City = request.getParameter("city");
        String State = request.getParameter("state");
        String Zip = request.getParameter("zip");
        String Cardname = request.getParameter("cardname");
        String Cardnumber = request.getParameter("cardnumber");
        String Expmonth = request.getParameter("expmonth");
        String Expyear = request.getParameter("expyear");
        String Cvv = request.getParameter("cvv");
        
        
        if((Firstname.equals("")||Email.equals("")||Address.equals("")||City.equals("")||State.equals("")||Zip.equals("")||Cardname.equals("")||Cardnumber.equals("")||Expmonth.equals("")||Expyear.equals("")||Cvv.equals(""))){
        
            RequestDispatcher dispatcher=request.getRequestDispatcher("paymentFailed.jsp");
            dispatcher.forward(request, response);
            
        }else{
            
            Beans.Payment u1 = new Beans.Payment();
            
            PrintWriter out = response.getWriter();
            DAO.PaymentDAO rb = new DAO.PaymentDAO();
        
                try {
                    rb.input(Firstname,Email,Address,City,State,Zip,Cardname,Cardnumber,Expmonth,Expyear,Cvv);
                    u1.setFirstname(Firstname);
                    u1.setEmail(Email);
                    u1.setAddress(Address);
                    u1.setCity(City);
                    u1.setState(State);
                    u1.setZip(Zip);
                    u1.setCardname(Cardname);
                    u1.setCardnumber(Cardnumber);
                    u1.setExpmonth(Expmonth);
                    u1.setExpyear(Expyear);
                    u1.setCvv(Cvv);

                    request.setAttribute("Payment", u1);

                    RequestDispatcher dispatcher=request.getRequestDispatcher("paymentSuccess.jsp");
                    dispatcher.forward(request, response);
                }
                catch (Exception e) {
                    out.println(e);
                }

            
        }
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
