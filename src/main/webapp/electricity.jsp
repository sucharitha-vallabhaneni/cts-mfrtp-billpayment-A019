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
<h1>Electricity Home Page</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="ebillsave" method="post" modelAttribute="electricity" style="margin-top:50px;margin-left:30px;">
<table>

<tr>
<td>Bill Number:</td>
<td>
<form:input path="billnumber"  class="form-control" />
<br>
 <form:errors path="billnumber" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Service Number:</td>
<td>
<form:input path="servicenumber"  class="form-control" placeholder="Enter 13 digit number"/>
<br>
 <form:errors path="servicenumber" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Amount:</td>
<td>
<form:input path="amount"   class="form-control"/>
<br>
 <form:errors path="amount" cssClass="errors"></form:errors> 
</td>
</tr>


<tr>
<td>State:</td>
<td>
<select id="state" name="state">
<option value="" disabled selected>Select</option>
<option value="AP">AndhraPradesh</option>
<option value="Arunachalpradesh">ArunachalPradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="chattisgarh">Chattisgarh</option>
<option value="goa">Goa</option>
<option value="gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachalpradesh">HimachalPradesh</option>
<option value="jharkand">Jharkand</option>
<option value="karnataka">Karnataka</option>
<option value="kerala">Kerala</option>
<option value="Madhyapradesh">MadhyaPradesh</option>
<option value="Maharasthra">Maharasthra</option>
<option value="odisha">Odisha</option>
<option value="punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="tamilnadu">TamilNadu</option>
<option value="telangana">Telangana</option>

</select>
</td>
</tr>

<tr>
<td>Board:</td>
<td>
<select id="board" name="board">
<option value="" disabled selected>Select</option>
<option value="SPDCL">South Power Distribution company</option>
<option value="EPDCL">East Power Distribution company</option>
<option value="NPDCL">North POWER DISTRIBUTION COMPANY</option>
<option value="WPDCL">West Power Distribution company</option>

</select>
</td>
</tr>



<td colspan="2" align="center"><input type="submit" value="Confirm" class="formsubmitbutton" />

</tr>
</table>

<tr>

</form:form>
</div>


</div>
<a href="billpayhome">BACK</a>

</body>
</html>