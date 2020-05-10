<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
<link rel="stylesheet" type="text/css" href="cusstyle1.css"/>
</head>
<body>
<div class="header1" align="center">
<h1>Forgot password</h1>
</div>
<div align="center">
<div class="formdata">
<form action="getpwd" method="post">
<table>
<tr>
<td>Enter UserName:</td>
<td>
<input type="text" name="username" class="formcontrol">
</td>
</tr>
<tr>
<td>Select question:</td>
<td>
<select  style="width:10rem;padding: 5px;" name="secretquestion" >
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
<td><input type="text" name="answer" class="formcontrol">
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
<a href="/vendor">Login</a>
</div>
</div>
</body>
</html>
