<%-- 
    Document   : index
    Created on : 19-Sep-2020, 13:48:32
    Author     : Sandun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="CSS/ocis.css">
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>

  <div class="logo">
    <img src="img/logo.jpg">
  </div>

	<div class="list">
    <ul>
        <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="aboutus.jsp">About us</a></li>
        <li><a href="help.jsp">Help</a></li>
        <li><a href="login.jsp">Login</a></li>
        <li><a href="feedback.jsp">Feedback</a></li>
        
    </ul>
  </div>

  <div class="contain">

    <div class="header">
      <h1>Online Certification Issuing System</h1>
    </div>

    <div class="container-fluid bg-3 text-center">    
    <h3>Choose a category</h3><br>

    <div class="row">

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Birth_Certificate.jsp"><i class="fa fa-user" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Birth_Certificate.jsp">Application for Birth Certificate</a></h3>
      </div>

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Marraige_Certificate.jsp"><i class="fa fa-heart" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Marraige_Certificate.jsp">Application for copy of Marriage Certificate</a></h3>   		
    	</div>

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Death_Certificate.jsp"><i class="fa fa-user-times" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Death_Certificate.jsp">Application for Death Certificate</a></h3>   		
    	</div>

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Permit.jsp"><i class="fa fa-tree" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Permit.jsp">Application for Timber Cutting Permit</a></h3>   		
    	</div>

    </div>


    <div class="row">

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Transport_License.jsp"><i class="fa fa-truck" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Transport_License.jsp">Application for Timber Transport License</a></h3>  		
    	</div>

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Driving_License.jsp"><i class="fa fa-id-card" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Driving_License.jsp">Application for Driving License</a></h3>   		
    	</div>

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Passport.jsp"><i class="fa fa-plane" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Passport.jsp">Application for Passport</a></h3>   		
    	</div>

    	<div class="col-md-3 text-center">
    		<div class="icon">
    			<a href="Menu/Contact_Details.jsp"><i class="fa fa-phone" aria-hidden="true"></i></a>
    		</div>
    		<h3><a href="Menu/Contact_Details.jsp">Contact Details</a></h3>   		
    	</div>

    </div>

  </div><br><br>
  <footer>
    <div class="cont">Contact:</div>
    Phone: (+94)12345678<br>
    E-mail: info@kingpins.org<br>
    Address: SOC , NSBM Green University Town , Mahenwaththa , Pitipana , Homagama
  </footer>
</body>
</html>
