<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL PAYMENT-CUSTOMER REMINDER</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">
</head>
<body>
<div class="header1">
<h1>BILL PAYMENT-CUSTOMER REMINDERS</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="setreminder" method="post" modelAttribute="reminder" style="margin-top:50px;">

<table>
<tr>
<td>Bill Type :</td>
<td>

<form:input path="billtype" class="form-control"/>
<br>
 <form:errors path="billtype" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Date :</td>
<td><form:password path="date" class="form-control" placeholder="yyyy-mm-dd"/>
<br>
<form:errors path="date" cssClass="errors"></form:errors>
</td>
</tr>

<tr>
<td>Time :</td>
<td><form:password path="time" class="form-control" placeholder="HH:mm:ss"/>
<br>
<form:errors path="time" cssClass="errors"></form:errors>
</td>
</tr>




<tr>

<td colspan="2" align="center"><input type="submit" value="Submit" class="formsubmitbutton" />

</tr>
</table>



</form:form>




</div>

<a href="backtohome">Home</a>
</div>
</body>
</html>