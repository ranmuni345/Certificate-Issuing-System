<%-- 
    Document   : logged_header
    Created on : 22-Sep-2020, 10:49:25
    Author     : Sandun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            if(session.getAttribute("user_logged")==null)
            {
                response.sendRedirect("login.jsp");
            }
            
        %>
    </body>
</html>
