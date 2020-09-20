<%-- 
    Document   : register
    Created on : 19-Sep-2020, 15:43:28
    Author     : Sandun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Registration Form</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="CSS/register/fonts/linearicons/style.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="CSS/register/css/style.css">
	</head>

	<body>

		<div class="wrapper">
			<div class="inner">
				<img src="CSS/register/images/image-1.png" alt="" class="image-1">
				<form action="RegisterServlet" method="post">
					<h3>New Account?</h3>
					<div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" placeholder="Username" name="Uname">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-phone-handset"></span>
						<input type="text" class="form-control" placeholder="Phone Number" name="Phno">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-envelope"></span>
						<input type="text" class="form-control" placeholder="Mail" name="Mail">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" placeholder="Password" name="pw">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" placeholder="Confirm Password">
                                                <input type="hidden" value="1" name="Approval">
					</div>
					<button>
						<span>Register</span>
					</button>
                                        <br><div class="text-center">
                                         <a href="index.jsp" class="txt1">
							Go to Home
                                    </a>
                                        
				</form>
                                
				<img src="CSS/register/images/image-2.png" alt="" class="image-2">
			</div>
			
		</div>
		
		<script src="CSS/register/js/jquery-3.3.1.min.js"></script>
		<script src="CSS/register/js/main.js"></script>
	</body>
</html>
