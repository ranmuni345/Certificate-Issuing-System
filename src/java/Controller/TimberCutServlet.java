/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author hansikas
 */
public class TimberCutServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TimberCutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TimberCutServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
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
        
        
        if(Comment1.equals("")||Comment2.equals("")||Comment3.equals("")||Id.equals("")||Tel1.equals("")||Tel2.equals("")||Comment4.equals("")||Comment5.equals("")||Comment6.equals("")||Comment7.equals("")||Comment8.equals("")||Comment9.equals("")||Comment10.equals("")||T.equals("")){
        
            RequestDispatcher dispatcher=request.getRequestDispatcher("paymentFailed.jsp");
            dispatcher.forward(request, response);
            
        }else{
            
            Beans.TimberPermit u3 = new Beans.TimberPermit();
            
            PrintWriter out = response.getWriter();
            DAO.timberCutDAO rb3 = new DAO.timberCutDAO();
        
                try {
                    rb3.input(Comment1,Comment2,Comment3,Id,Tel1,Tel2,Comment4,Comment5,Comment6,Comment7,Comment8,Comment9,Comment10,T);
                    u3.setComment1(Comment1);
                    u3.setComment2(Comment2);
                    u3.setComment3(Comment3);
                    u3.setId(Id);
                    u3.setTel1(Tel1);
                    u3.setTel2(Tel2);
                    u3.setComment4(Comment4);
                    u3.setComment5(Comment5);
                    u3.setComment6(Comment6);
                    u3.setComment7(Comment7);
                    u3.setComment8(Comment8);
                    u3.setComment9(Comment9);
                    u3.setComment10(Comment10);
                    u3.setT(T);
                    

                    request.setAttribute("Payment", u3);

                    RequestDispatcher dispatcher=request.getRequestDispatcher("paymentPage.jsp");
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
