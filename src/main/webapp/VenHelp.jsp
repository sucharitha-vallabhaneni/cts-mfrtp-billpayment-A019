<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vendor Help</title>
<link rel="stylesheet" type="text/css" href="/style1.css">
<h1 >Report an issue here</h1>
<a href="vendorportal.jsp" class="a1">BACK</a>
</head>
<body>
<div class="header">

<ul class="a">


</ul>
</div>
 <div class="formdata1">
<div align="center">

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
    