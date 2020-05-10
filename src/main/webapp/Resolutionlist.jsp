<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit/Debit Card</title>
<link rel="stylesheet" type="text/css" href="style1.css">


</head>
<body>
<div class="header1">
<h1 align="center">RESOLUTION PAGE</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form  action="solution" method="post" modelAttribute="solved" style="margin-top:50px;">
<table align="center">
<tr>
<td>UserID</td>
<td>

<form:input path="userid" class="form-control"/>
<br>
 <form:errors path="userid" cssClass="errors"></form:errors> 
</td>
</tr>
<tr>
<td>Solution</td>
&nbsp;
<td>
<textarea name="solution" rows="5" cols="20" placeholder="provide solution"   class="forms" required></textarea>
</td>
</tr>
</table>
</form:form>
<a href="viewissues">BACK</a>
</div>
</body>

</html>
    