<%-- 
    Document   : formdeath
    Created on : Sep 19, 2020, 8:32:15 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>
<img src="Gov Logo.jpg" width=150 height=100>Application for Death certificate</h1>



<h4>Please read all instructions before completing all items.</h4><br>

<form name="Deathcert" action="../DeathServlet" method="post">

<table>

<tr>
        <td> Name of Applicant</td><td><input type="text" name="appliname" id="01" size=70 ></td> 

</tr>
<tr>
	<td>Full name of person respecting whose death application is made?</td><td><input type="text" name="respname" id="03" size=70 required></td>
	
</tr>

<tr>
	<td>Date of Death</td><td><input type="date" name="dateofdeath" id="07" ></td>


</tr>
<tr>
	<td>Cause of Death</td><td>
<input type="text" name="cause" id="09" size=70 class="Large"  ></td>

</tr>

<tr>
	<td>Father's full name</td><td><input type="text" name="fathername" id="11"  size=70  ></td>                                   

</tr>
<tr>
	<td>Mother's full name</td><td><input type="text" name="mothername" id="12"  size=70  ></td>                                    

</tr>
<tr>
    <td>Registrar's Division</td><td><input type="text" name="division" id="13" size=70 >
</td>
</tr>
<tr>
	<td>Period of search desired,if any</td><td><input type="text" name="period" id="15" size=70  ></td>
</tr>
<tr>
      <td> Address of Applicant</td><td><input type="text" name="address" id="02" size=70 ></td>
</tr>
<tr>
    <td>ID No </td><td><input type="text" name="idnum" id="04" required></td>
</tr>

<tr>
    <td>No.of Copies required</td><td><input type="number" name="numofcopy" id="10" ></td>
</tr>
<tr>
    <td>Revenue District</td><td><input type="text" name="numofcopya" id="14" size=70  ></td>
</tr>

</table>

<hr size=6>


<input type="submit" class="button1" value="Submit">
<input type="button" class="button1" value="Next" onclick="disableTxt()">
<input type="button" class="button2" value="Back" onclick="undisableTxt()"><br>
</form>
        
        
    </body>
</html>
