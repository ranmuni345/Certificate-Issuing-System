/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dulan
 */
public class MarriageServlet extends HttpServlet {

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
            out.println("<title>Servlet MarriageServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MarriageServlet at " + request.getContextPath() + "</h1>");
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
        
        String Name = request.getParameter("appliname");
        String Address = request.getParameter("address");
        String Marriage_type = request.getParameter("generalkm");
        String No_of_copies = request.getParameter("numofcopy");
        String M_fullname = request.getParameter("malename");
        String F_fullname = request.getParameter("femalename");
        String Certifier = request.getParameter("church");
        String Id_no = request.getParameter("idnum");
        String District = request.getParameter("district");
        String Date = request.getParameter("dateofmarry");
        String Exact_date = request.getParameter("period");
        String Email = request.getParameter("email");
        
        if(Name.equals("")||Address.equals("")||Marriage_type.equals("")||No_of_copies.equals("")||M_fullname.equals("")||F_fullname.equals("")||Certifier.equals("")||Id_no.equals("")||District.equals("")||Date.equals("")||Exact_date.equals("")||Email.equals("")){
        
            RequestDispatcher dispatcher=request.getRequestDispatcher("paymentFailed.jsp");
            dispatcher.forward(request, response);
            
        }else{
            
           
            Beans.Marriage u4 = new Beans.Marriage();
            
            PrintWriter out = response.getWriter();
            DAO.MarriageDAO rb4 = new DAO.MarriageDAO();
        
                try {
                    rb4.input(Name,Address,Marriage_type,No_of_copies,M_fullname,F_fullname,Certifier,Id_no,District,Date,Exact_date,Email);
                    u4.setName(Name);
                    u4.setAddress(Address);
                    u4.setMarriage_type(Marriage_type);
                    u4.setNo_of_copies(No_of_copies);
                    u4.setM_fullname(M_fullname);
                    u4.setF_fullname(F_fullname);
                    u4.setCertifier(Certifier);
                    u4.setId_no(Id_no);
                    u4.setDistrict(District);
                    u4.setDate(Date);
                    u4.setExact_date(Exact_date);
                    u4.setEmail(Email);
                    
                    

                    request.setAttribute("Payment", u4);

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