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
				<form action="">
					<h3>New Account?</h3>
					<div class="form-holder">
						<span class="lnr lnr-user"></span>
						<input type="text" class="form-control" placeholder="Username">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-phone-handset"></span>
						<input type="text" class="form-control" placeholder="Phone Number">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-envelope"></span>
						<input type="text" class="form-control" placeholder="Mail">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" placeholder="Password">
					</div>
					<div class="form-holder">
						<span class="lnr lnr-lock"></span>
						<input type="password" class="form-control" placeholder="Confirm Password">
					</div>
					<button>
						<span>Register</span>
					</button>
				</form>
				<img src="CSS/register/images/image-2.png" alt="" class="image-2">
			</div>
			
		</div>
		
		<script src="CSS/register/js/jquery-3.3.1.min.js"></script>
		<script src="CSS/register/js/main.js"></script>
	</body>
</html>
