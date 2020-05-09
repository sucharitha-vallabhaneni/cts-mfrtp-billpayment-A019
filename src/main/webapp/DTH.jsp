<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
             <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DTH</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">
</head>
<body>
<div class="header1">
<h1>BILLPAYMENT - DTH</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="dthsave" method="post" modelAttribute="dth" style="margin-top:50px;">


<table>
<tr>
<td> Servicenumber </td>
<td>

<form:input path="Servicenumber" class="form-control"/>
<br>
 <form:errors path="Servicenumber" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td> Registered MobileNumber</td>
<td>

<form:input path="rmn" class="form-control"/>
<br>
 <form:errors path="rmn" cssClass="errors"></form:errors> 
</td>
</tr>
<tr>
<td align="left" style="width:10rem;padding: 5px; margin-left: 0;">Service provider</td>
<td>
<div class="category_div" id="category_div">
        <select style="width: 200px;height: 30px;" id="dthname" name="dthname" onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
        <option value="" disabled selected>Select service provider</option>
        

<option value="Tatasky">Tatasky</option>
<option value="Airtel">Airtel</option>
<option value="Sun Direct">Sun Direct</option>

</select>
</div>
</td>
</tr>

<tr>
<td align="left" style="width:10rem;padding: 5px; margin-left: 0;">Amount</td>
<td>
<form:input path="amount"   class="form-control"/>
<br>
 <form:errors path="amount" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td align="left" style="width:10rem;padding: 5px; margin-left: 0;">Bill Date</td>
<td>

<form:input type="date" path="billpaydate" class="form-control" style="width:180px;"/>
<br>
 <form:errors path="billpaydate" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="Submit" class="formsubmitbutton" />

</tr>
</table>

</form:form>
</div>

<a href="billpayhome">BACK</a>
</div>
</body>
</html>
    