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
 * @author user
 */
public class DeathServlet extends HttpServlet {

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
            out.println("<title>Servlet DeathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeathServlet at " + request.getContextPath() + "</h1>");
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
        
        String Comment1 = request.getParameter("appliname");
        String Comment2 = request.getParameter("respname");
        String Comment3 = request.getParameter("dateofdeath");
        String Comment4= request.getParameter("cause");
        String Comment5 = request.getParameter("fathername");
        String Comment6 = request.getParameter("mothername");
        String Comment7 = request.getParameter("division");
        String Comment8 = request.getParameter("period");
        String Comment9 = request.getParameter("address");
        String Comment10 = request.getParameter("idnum");
        String Comment11 = request.getParameter("numofcopy");
        String Comment12 = request.getParameter("numofcopya");
     
       
        
        
        if(Comment1.equals("")||Comment2.equals("")||Comment3.equals("")||Comment4.equals("")||Comment5.equals("")||Comment6.equals("")||Comment7.equals("")||Comment8.equals("")||Comment9.equals("")||Comment10.equals("")||Comment11.equals("")||Comment12.equals("")){
        
            RequestDispatcher dispatcher=request.getRequestDispatcher("paymentFailed.jsp");
            dispatcher.forward(request, response);
            
        }else{
            
            Beans.Death u5 = new Beans.Death();
            
            PrintWriter out = response.getWriter();
            DAO.DeathDAO rb5 = new DAO.DeathDAO();
        
                try {
                    rb5.input(Comment1,Comment2,Comment3,Comment4,Comment5,Comment6,Comment7,Comment8,Comment9,Comment10,Comment11,Comment12);
                    u5.setAppliname(Comment1);
                    u5.setRespname(Comment2);
                    u5.setDateofdeath(Comment3);
                    u5.setCause(Comment4);
                    u5.setFathername(Comment5);
                    u5.setMothername(Comment6);
                    u5.setDivision(Comment7);
                    u5.setPeriod(Comment8);
                    u5.setAddress(Comment9);
                    u5.setIdnum(Comment10);
                    u5.setNumofcopy(Comment11);
                    u5.setNumofcopya(Comment12);
                  
                    

                    request.setAttribute("Payment", u5);

                    RequestDispatcher dispatcher=request.getRequestDispatcher("paymentPage.jsp");
                    dispatcher.forward(request, response);
                }
                catch (IOException | ServletException e) {
                    out.println(e);
                } catch (Exception ex) {
                Logger.getLogger(DeathServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

