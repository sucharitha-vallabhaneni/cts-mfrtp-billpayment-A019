<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">
</head>
<body>
<div class="header1">
<h1>BILL PAYMENT-RECORD BILLS</h1>
<li><a href="backtohome">BACK</a></li>
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="savebills" method="post" modelAttribute="recbills" style="margin-top:50px;margin-left:30px;">

<table>
<tr>
<td>Bill Type:</td>
<td>

<form:input path="billname" class="form-control"/>
<br>
 <form:errors path="billname" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Bill Number:</td>
<td>

<form:input path="billnumber" class="form-control"/>
<br>
 <form:errors path="billnumber" cssClass="errors"></form:errors> 
</td>
</tr>


<tr>
<td>Bill PaidDate:</td>
<td>

<form:input path="billpaiddate" class="form-control" placeholder="yyyy-MM-dd"/>
<br>
 <form:errors path="billpaiddate" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Bill Amount:</td>
<td>

<form:input path="billamount" class="form-control"/>
<br>
 <form:errors path="billamount" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>

<td colspan="2" align="center"><input type="submit" value="submit" class="formsubmitbutton" />

</tr>
</table>
</form:form>
</body>

</html>