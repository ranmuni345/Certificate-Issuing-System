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
public class Marriage_cert_servlet extends HttpServlet {

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
            out.println("<title>Servlet Marraige_cert_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Marraige_cert_servlet at " + request.getContextPath() + "</h1>");
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
        String Name = request.getParameter("appliname");
        String Address = request.getParameter("address");
        String Marraige_type = request.getParameter("generalkm");
        String No_of_copies = request.getParameter("numofcopy");
        String M_fullname = request.getParameter("malename");
        String F_fullname = request.getParameter("femalename");
        String Certifier = request.getParameter("church");
        String ID_no = request.getParameter("idnum");
        String District = request.getParameter("district");
        String Date = request.getParameter("dateofmarry");
        String Exact_date = request.getParameter("period");
        String Email = request.getParameter("email");
        
        
        
        
        
        if((Name.equals("")||Address.equals("")||Marraige_type.equals("")||No_of_copies.equals("")||M_fullname.equals("")||F_fullname.equals("")||Certifier.equals("")||ID_no.equals("")||District.equals("")||Date.equals("")||Exact_date.equals("")||Email.equals("")))
        {
        
            RequestDispatcher dispatcher=request.getRequestDispatcher("RegFailed.jsp");
            dispatcher.forward(request, response);
            
        }else{
            
            Beans.Marriage_bean u1 = new Beans.Marriage_bean();
            
            PrintWriter out = response.getWriter();
            DAO.Marriage_DAO rb = new DAO.Marriage_DAO();
        
                try {
                    rb.input(Name,Address,Marraige_type,No_of_copies,M_fullname,F_fullname,Certifier,ID_no,District,Date,Exact_date,Email);
                    u1.setappliname(Name);
                    u1.setaddress(Address);
                    u1.setgeneralkm(Marraige_type);
                    u1.setnumofcopy(No_of_copies);
                    u1.setmalename(M_fullname);
                    u1.setfemalename(F_fullname);
                    u1.setchurch(Certifier);
                    u1.setidnum(ID_no);
                    u1.setdistrict(District);
                    u1.setdateofmarry(Date);
                    u1.setperiod(Exact_date);
                    u1.setemail(Email);
                    
                    
                    
                    request.setAttribute("marriage", u1);

                    RequestDispatcher dispatcher=request.getRequestDispatcher("RegSuccess.jsp");
                    dispatcher.forward(request, response);
                }
                catch (IOException | ServletException e) {
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
