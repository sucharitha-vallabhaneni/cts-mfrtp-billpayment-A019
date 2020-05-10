<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="cusstyle.css">
</head>
<body>

<div class="header1">
<h1 align="center">BILL PAYMENT-GOOGLE PAY</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form  action="gverify" method="post" modelAttribute="vergpay" style="margin-top:50px;">
<table>


<tr>
<td align="left" style="width:10rem;padding: 5px; margin-left: 0;">Bill Number</td>
<td><input type="text" name="bil" value="${billno}"></td>


</tr>
<tr>
<td>Contact Number :</td>
<td>
<form:input required="required" path="contactNumber" class="form-control"/>
<br>
 <form:errors path="contactNumber" cssClass="errors"></form:errors> 
</td>
</tr>
<tr>
<td>UPI :</td>
<td><form:input required="required" path="upi" class="form-control"/>
<br>
<form:errors path="upi" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Password :</td>
<td><form:password required="required" path="password" class="form-control"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
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