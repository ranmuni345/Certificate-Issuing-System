<%-- 
    Document   : Marriage certificate
    Created on : Sep 19, 2020, 9:00:29 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 
<link rel="stylesheet" type="text/css" href="../CSS/forms/formcss.css">

</head>
<body>
<h1>
  <img src="Gov Logo.jpg" width=150 height=100>Original copy For Marriage certificate</h1>

<div align="right">Your Reference No. :<?php echo(rand(1000000,9999999) . "<br>");?></div>

<h4>Please read all instructions before completing all items.</h4><br>

<form name="marrige cert" method="post" action="Marriage Certificate Connection.php">

<table>

<tr>
        <td> Name of Applicant</td><td><input type="text" name="appliname" id="01" size=70 
placeholder="Enter Applicant Name" required></td>

        <td> Address of Applicant</td><td><textarea name="address" id="02" size=70 required></textarea></td>
</tr>
<tr>
	<td>Whether the application refers to a General or Kandyan Marrige</td><td>
<input type="text" name="generalkm" id="03" size=70 placeholder="Enter Applicant Name" required ></td>
<td>No.of Copies required</td><td><input type="number" name="numofcopy" id="04" required></td>
</tr>
<tr>

        <td>Full name of the male party </td><td><input type="text" name="malename" id="05" size=70 
placeholder="Enter name of the male " required ></td>
        <td>Full name of the female party</td><td><input type="text" name="femalename" id="06" size=70 
placeholder="Enter name of the female" required ></td>
</tr>
<tr>
	<td>If marrige was soiemnized by a clergyman name and situation of church</td><td><textarea name="church" id="07" size=70 required></textarea></td>
	<td>ID No </td><td><input type="text" name="idnum" id="08" required></td>
</tr>
<tr>
	<td>District in which marriage was soiemnized</td><td><input type="text" name="district" id="09" size=70 required></td>
</tr>
<tr>
	<td>Date of marriage(if exact date is known)</td><td><input type="date" name="dateofmarry" id="10" required></td>
</tr>
<tr>
	<td>If exact date of marriage is not known period of search desired (The maximum period of search is limited to Two years)</td>
<td><input type="date" name="period" id="11" required></td>
</tr>
<tr>
	
        <td>Email</td><td><input type="text" name="email" id="12" size=70 placeholder="Enter Your  email" required></td>
</tr>
</table>
<table>

   <p>I hereby certify that above information are accurate<input type="checkbox" name="certify" id="13"></p>

</table>
<hr size=6>


<input type="submit" class="button1" value="Submit">
<input type="button" class="button1" value="Next" onclick="disableTxt()">
<input type="button" class="button2" value="Back" onclick="undisableTxt()"><br>

<script>

function disableTxt() {
  document.getElementById("01").disabled = true;
  document.getElementById("02").disabled = true;
  document.getElementById("03").disabled = true;
  document.getElementById("04").disabled = true;
  document.getElementById("05").disabled = true;
  document.getElementById("06").disabled = true;
  document.getElementById("07").disabled = true;
  document.getElementById("08").disabled = true;
  document.getElementById("09").disabled = true;
  document.getElementById("10").disabled = true;
  document.getElementById("11").disabled = true;
  document.getElementById("12").disabled = true;
  document.getElementById("13").disabled = true;
  }

function undisableTxt() {
  document.getElementById("01").disabled = false;
  document.getElementById("02").disabled = false;
  document.getElementById("03").disabled = false;
  document.getElementById("04").disabled = false;
  document.getElementById("05").disabled = false;
  document.getElementById("06").disabled = false;
  document.getElementById("07").disabled = false;
  document.getElementById("08").disabled = false;
  document.getElementById("09").disabled = false;
  document.getElementById("10").disabled = false;
  document.getElementById("11").disabled = false;
  document.getElementById("12").disabled = false;
  document.getElementById("13").disabled = false;
  }

</script>

</form>

</body>
</html>
