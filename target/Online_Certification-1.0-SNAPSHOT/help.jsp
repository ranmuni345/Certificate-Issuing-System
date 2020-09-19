<%-- 
    Document   : help
    Created on : 19-Sep-2020, 13:54:42
    Author     : Sandun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Help</title>
  <link rel="stylesheet" type="text/css" href="CSS/about-help.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.css">
</head>
<body>
  <div class="list">
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="aboutus.jsp">About us</a></li>
        <li class="active"><a href="help.jsp">Help</a></li>
        <li><a href="login.jsp">Login</a></li>
    </ul>
  </div>

    <h1>Need Help?</h1>
    <form>

    <h2>Follow the steps shown below.</h2>

    <ul>
        <li><b>step1</b> - Choose a category from the selection panel and click on it.
            <ul>
                <li>eg:- Application for Birth Certificate</li>
            </ul>
        </li>

        <li><b>step2 </b>- You will get information about the selected category.<br>
                           Read the information and login to get an application.</li>
            <ul>
                <li>eg:- Application for Birth Certificate --> Login</li>
            </ul>
        </li>
                    

        <li><b>step3 </b>- You will get a sample application of the selected category.</li>
                           Fill the application and submit(Please give your correct informaion).

        <li><b>step4 </b>- After submit your information, you will display a page with your information.
                           Please check whether your information is correct.
                           Nothing to change click "DONE".
                           If you have to change something click "BACK".
    </ul>

    <img src="img/help.jpg">
    
    </form>
         

</body>
</html>

