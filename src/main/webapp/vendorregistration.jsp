<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL PAYMENT-VENDOR REGISTRATION</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>





<div class="header1">
<h1>BILL PAYMENT-VENDOR REGISTRATION</h1>

</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="/vendor/venregistration" method="post" modelAttribute="venreg" style="margin-top:50px;margin-left:30px;">

<table>
<tr>
<td>User Name :</td>
<td>

<form:input path="username" class="form-control"/>
<br>
 <form:errors path="username" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Name :</td>
<td>

<form:input path="firstname" class="form-control"/>
<br>
 <form:errors path="firstname" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Company reg.No:</td>
<td>

<form:input path="compnay regno" class="form-control"/>
<br>
 <form:errors path="company regno" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Password :</td>
<td><form:password path="password" class="form-control"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>

<tr>
<td>Address :</td>
<td>

<form:input path="address" class="form-control"/>
<br>
 <form:errors path="address" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Country :</td>
<td>

<form:input path="country" class="form-control"/>
<br>
 <form:errors path="country" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>State:</td>
<td>

<form:input path="state" class="form-control"/>
<br>
 <form:errors path="state" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Email :</td>
<td>

<form:input path="email" class="form-control"/>
<br>
 <form:errors path="email" cssClass="errors"></form:errors> 
</td>
</tr>



<tr>
<td>Contact number :</td>
<td>

<form:input path="mobile" class="form-control"/>
<br>
 <form:errors path="mobile" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Website:</td>
<td>

<form:input path="website" class="form-control"/>
<br>
 <form:errors path="website" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Certificate Issued Date:</td>
<td>

<form:input path="cid" class="form-control"/>
<br>
 <form:errors path="cid" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Certificate Validity Date :</td>
<td>

<form:input path="cvd" class="form-control"/>
<br>
 <form:errors path="cvd" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Year of Establishment :</td>
<td>

<form:input path="yoe" class="form-control"/>
<br>
 <form:errors path="yoe" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>

<td colspan="2" align="center"><input type="submit" value="Register" class="formsubmitbutton" />

</tr>
</table>



</form:form>


Existing Vendor?<a href="/venlogin/" style="color:yellow;"> SignIn</a>
</div>

<a href="/">Home</a>
</div>
</body>
</html>
    