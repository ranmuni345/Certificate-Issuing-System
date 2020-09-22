<%-- 
    Document   : formPermitTimberCut
    Created on : Sep 19, 2020, 10:10:51 AM
    Author     : hansikas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
 
<style>

body {
  background-color: #EFEFEF;
 
}



h1
{
background-image:url("Header.jpg");
background-repeat:repeat-x;
text-shadow:1px 1px 2px #0000000;
font-size:40px;
font-family:arial;
}

img 
{
border-radius:40%
}


 table {
    
  width: 44%;
}



textarea {
  width: 850px;
  height: 30px;
}



.button1
{
border-radius:10px;
 background-color: #3333cc;
 padding: 15px;
}

.button2
{
border-radius:10px;
 background-color: #3333cc;
 padding: 15px;
}

.button3
{
border-radius:10px;
 background-color: #3333cc;
 padding: 15px;
}



th, td {
  padding: 10px;
}
th {
  text-align: left;
}





</style>
   </head>

<body>
<h1>
<img src="hiclipart.com.png" width=150 height=100>Application For Timber Permit</h1> 

<div align="right">Official Only<br><input type="text" name="office"></div>          

<h4>Please read all instructions before completing all items.</h4><br>


<form name="timber permit" action="viewForm.jsp">  

<table style="width:100%">

<tr>
    <td  > 1.Applicant's Last Name</td>
        <td><textarea name="comment1" size=60  placeholder="Enter your last name"></textarea></td>
</tr>
<tr>
        <td> 2. Applicant's First Name</td>
        <td><textarea name="comment2" size=60  placeholder="Enter your first name"></textarea></td>

</tr>
<tr>
        <td> 3. Applicant's Adddress</td>
        <td><textarea name="comment3" size=60 placeholder="Enter your address"></textarea></td>   
</tr>
<tr>
	<td>4. ID</td>
        <td><input type="text" name="id"</td>
</tr>


<tr>
	<td rowspan="2">5. Telephone No</td>
	<td>i) Mobile No   <input type="tel1" name="telephone2"></td>
</tr>
<tr>
	
	<td>ii) Home No   <input type="tel2" name="telephone"></td>
</tr>

<tr>                                         

	<td><p>6. Name of the owner, if the applicant is not the owner</p></td><td> <textarea name="comment4" size=68></textarea></td>
</tr>
</table>
<table border="5" style="width:100%">
<tr>
	<td rowspan="5">7. Description of trees that need to be cut down</td>
	<td>i) Name of the land</td>
	<td><textarea name="comment5" size=55></textarea></td>
</tr>
<tr>
	<td>ii) Location of the land</td>
	<td><textarea name="comment6" size=55></textarea></td>
</tr>
<tr>
	<td>iii) type of tree</td>
	<td><textarea name="comment7" size=55></textarea></td>
</tr>
<tr>
	<td>iv) No of trees</td>
	<td><textarea name="comment8" size=55></textarea></td>
</tr>



</table>
<table style="width:100%">

<tr>
	<td>8) Does the land currently have a case?If so provide information.</td>
<td><textarea name="comment9" size=55></textarea></td>
</tr>


<tr>
	<p><td>9) Reason for cutting down trees</td></p>
            <td><textarea name="comment10" size=55></textarea></td>

</tr>	
</table>

<table>

   <p>Due to above reasons I ask for permission to cut down trees. I hereby certify that above information are accurate<input type="checkbox" name="t"></p>

</table>






</table>

<hr size=6>


<input type="submit" class="button1" value="Submit">
<input type="submit" class="button2" value="Cancel">
<input type="submit" class="button3" value="Reset"><br>

</form>
</body>
</html>
