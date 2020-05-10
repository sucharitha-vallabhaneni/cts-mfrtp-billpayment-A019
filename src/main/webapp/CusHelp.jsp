<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Help</title>
<link rel="stylesheet" type="text/css" href="/style1.css">
</head>
<body>
<div class="header">
<h1>CUSTOMER -HELP SERVICE</h1>
<a href="customerportal.jsp" class="a1">BACK</a>
<ul class="a">


</ul>

</div>
 <div class="formdata1">
<div align="center">
<h2 style="font-size:30px ;color:chocolate">Report an issue here</h2>
<form action="afterhelp" method="post" modelAtribute="help">
<table>
<tr>
<td >UserId:</td>
<td><input type="text" name="userId" class="formcontrol"/>
</td></tr>
<tr>
<td>Issue:</td>
<td><input type="text" name="issue" class="formcontrol"/>
</td></tr>
<tr>
<td><label for="description">Description:</label>
<td>
<textarea id="description" rows="3" cols="23" name="description"></textarea></td>
</tr>
</table>
<input type="submit" value="submit" class="formsubmitbutton"/><br><br>

</form>
<br><br>
<p2>${message}</p2>

</div>
</div> 
</body>

</html>