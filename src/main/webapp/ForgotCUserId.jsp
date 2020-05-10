<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="/style6.css"/>
</head>
<body>
<div class="header1" align="center">
<h1>Forgot UserId</h1>
</div>
<div align="center">
<div class="formsdata">
<form action="/getCUserId" method="post">
<table>
<tr>
<td>Contact Number:</td>
<td>
<input type="text" name="mobile" class="formcontrol">
</td>
</tr>
<tr>
<td>Select Question:</td>
<td>
<select  name="secretquestion" >
<option value="" disabled selected>Select</option>
<option value="australia">What is the name of town where you were born?</option>
<option value="canada">What was your first car?</option>
<option value="denmark">What elementary school did you attend?</option>
<option value="france">What is the name of your pet?</option>
</select>
</td>
</tr>
<tr>
<td>Enter answer:</td>
<td><input type="text" name="answer" placeholder="Answer" class="formcontrol">
<br>
<span>${message}</span>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="submit" class="formsubmitbutton"> 
</td>
</tr>
</table>
</form>
For Login?<a href="customer">Login</a>
</div>
</div>
</body>
</html>
