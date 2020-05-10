<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vendor Help</title>
<link rel="stylesheet" type="text/css" href="/style1.css">
</head>
<body>
<div class="header">
<h1>Welcome <span><%=session.getAttribute("username")%></span></h1>
<ul class="a">
<li><a href="beforehelp1" class="a1">Help</a></li>
<li><a href="/" class="a1">Logout</a></li>
</ul>
</div>
 <div class="formdata1">
<div align="center">
<h2>Report an issue here</h2>
<form action="afterhelp1" method="post" modelAttribute="help">
<table>
<tr>
<td>UserId:</td>
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
${message}

</div>
</div> 
</body>
</html>
    