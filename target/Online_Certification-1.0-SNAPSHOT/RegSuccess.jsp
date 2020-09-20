<%-- 
    Document   : RegSuccess
    Created on : 20-Sep-2020, 19:17:11
    Author     : Sandun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        <jsp:useBean id="user" type="Beans.users" scope="request"></jsp:useBean>
        <h1>Registration Successful</h1>
        <h3>User: <jsp:getProperty name = "user" property="unames"/></h3><br><br>
        <a href="login.jsp">Go to Login</a><br>
        <a href="index.jsp">Go to Home</a>
    </body>
</html>
