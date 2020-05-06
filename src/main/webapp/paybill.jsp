<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit/Debit Card</title>
<link rel="stylesheet" type="text/css" href="cusstyle.css">


</head>
<body>
<div class="header1">
<h1 align="center">BILL PAYMENT-CREDIT/DEBIT CARD</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form  action="verify" method="post" modelAttribute="verifypay" style="margin-top:50px;">
<table>
<tr>
<td>Card Number :</td>
<td>
<form:input required="required" path="cardnumber" class="form-control"/>
<br>
 <form:errors path="cardnumber" cssClass="errors"></form:errors> 
</td>
</tr>
<tr>
<td>Name on card :</td>
<td><form:input required="required" path="name" class="form-control"/>
<br>
<form:errors path="name" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Expiry Date :</td>
<td>

<form:input path="expdate" class="form-control" placeholder="yyyy-MM-dd"/>
<br>
 <form:errors path="expdate" cssClass="errors"></form:errors> 
</td>
</tr>
<tr>
<td>CVV :</td>
<td><form:password required="required" path="cvv" class="form-control"/>
<br>
<form:errors path="cvv" cssClass="errors"></form:errors>
</td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="submit" class="formsubmitbutton" />
</tr>
</table>
</form:form>
</div>
<a href="/">Home</a>
</div>
</body>

</html>
    