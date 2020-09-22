<%-- 
    Document   : admin
    Created on : 22-Sep-2020, 22:13:09
    Author     : Sandun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Admin</title>
  <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:400,100,400italic,700italic,700'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'><link rel="stylesheet" href="CSS/admin/style.css">

</head>
<body>
<%
    if(session.getAttribute("admin_logged")==null)
            {
                response.sendRedirect("login.jsp");
            }        
%>
<div class='info'>
  <h1>Admin Panel</h1>
  <span>
      <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout">
      </form>
  </span>
</div>
<div class='nav'>
  <ul>
    <!--<li>
      <a class='logo' href='#'>
        <img src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/169963/logo_(1).svg'>
      </a>
    </li>-->
    <li>
      <a href='#'>Users</a>
    </li>
    <li>
      <a href='#'>
        Certificate
        <i class='fa fa-caret-down'></i>
      </a>
      <ul class='menu'>
        <li>
          <a href='#'>Payment</a>
        </li>
        <li>
          <a href='#'>Send</a>
        </li>
        <!--<li>
          <a href='#event_three'>Test</a>
        </li>-->
      </ul>
    </li>
    <li>
      <a href='#'>Feedback</a>
    </li>
    <!--<li>
      <a href='#blog'>Blog</a>
    </li>
    <li>
      <a href='#contact'>
        <div class='fa fa-envelope'></div>
      </a>
    </li>-->
  </ul>
</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://codepen.io/andytran/pen/vLmRVp.js'></script><script  src="CSS/admin/script.js"></script>

</body>
</html>

