<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
<link rel="stylesheet" type="text/css" href="/style5.css"/>
</head>
<body>
<%
String username =(String) session.getAttribute("userid");
%>
<div class="header1" align="center">
<h1>Reset Password</h1>
</div>
<div align="center">
<div class="formsdata">
<form action="resetpwd" method="post">
<table>
<tr>
<td>User Name </td>
<td><input type="text" name="username" value="${userid}" readonly="readonly"></td>
<tr>

<tr>
<td>New Password:</td>
<td>
<input type="password" name="password" class="formcontrol">
</td>
</tr>
<tr>
<td>Confirmation Password:</td>
<td>
<input type="password" name="confirmationpassword" class="formcontrol">
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="submit" class="formsubmitbutton">
<br>
<span>${message}</span>
</td>
</tr>
</table>
</form>
For Login?<a href="vendor">Login</a>
</div>
</div>
</body>
</html>
