/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(urlPatterns = {"/timberCutServlet"})
public class timberCutServlet extends HttpServlet {

   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String Comment1 = request.getParameter("comment1");
        String Comment2 = request.getParameter("comment2");
        String Comment3 = request.getParameter("comment3");
        String Id = request.getParameter("id");
        String Tel1 = request.getParameter("tel1");
        String Tel2 = request.getParameter("tel2");
        String Comment4 = request.getParameter("comment4");
        String Comment5 = request.getParameter("comment5");
        String Comment6 = request.getParameter("comment6");
        String Comment7 = request.getParameter("comment7");
        String Comment8 = request.getParameter("comment8");
        String Comment9 = request.getParameter("comment9");
        String Comment10 = request.getParameter("comment10");
        String T = request.getParameter("t");
        
        
        if((Comment1.equals("")||Comment2.equals("")||Comment3.equals("")||Id.equals("")||Tel1.equals("")||Tel2.equals("")||Comment4.equals("")||Comment5.equals("")||Comment6.equals("")||Comment7.equals("")||Comment8.equals("")||Comment9.equals("")||Comment10.equals("")||T.equals(""))){
        
            RequestDispatcher dispatcher=request.getRequestDispatcher("paymentFailed.jsp");
            dispatcher.forward(request, response);
            
        }else{
            
            Beans.TimberPermit u1 = new Beans.TimberPermit();
            
            PrintWriter out = response.getWriter();
            DAO.timberCutDAO rb = new DAO.timberCutDAO();
        
                try {
                    rb.input(Comment1,Comment2,Comment3,Id,Tel1,Tel2,Comment4,Comment5,Comment6,Comment7,Comment8,Comment9,Comment10,T);
                    u1.setComment1(Comment1);
                    u1.setComment2(Comment2);
                    u1.setComment3(Comment3);
                    u1.setId(Id);
                    u1.setTel1(Tel1);
                    u1.setTel2(Tel2);
                    u1.setComment4(Comment4);
                    u1.setComment5(Comment5);
                    u1.setComment6(Comment6);
                    u1.setComment7(Comment7);
                    u1.setComment8(Comment8);
                    u1.setComment9(Comment9);
                    u1.setComment10(Comment10);
                    u1.setT(T);

                    request.setAttribute("Payment", u1);

                    RequestDispatcher dispatcher=request.getRequestDispatcher("paymentPage.jsp");
                    dispatcher.forward(request, response);
                }
                catch (IOException | ServletException e) {
                    out.println(e);
                } catch (Exception ex) {
                Logger.getLogger(timberCutServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        }
        
        
        
    }
        
    }

    
   


