<%-- 
    Document   : FeedbackSucess
    Created on : 21-Sep-2020, 13:21:41
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
        <jsp:useBean id="name" type="Beans.feedbacks" scope="request"></jsp:useBean>
        <h1>Feedback Successful</h1>
        <h3>Thank you <jsp:getProperty name = "name" property="name"/></h3><br><br>
        <a href="index.jsp">Go to Home</a>
    </body>
</html>
