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
<body>
<div class="header1">
<h1>EDIT REGISTRED VENDORS</h1>

</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="update" method="post" modelAttribute="edit" style="margin-top:50px;margin-left:30px;">

<table>
<tr>
<td><form:hidden path="id"/>
<form:hidden path="answer"/>

<form:hidden path="secretquestion"/>

<form:hidden path="status"/>
<form:hidden path="password"/>


</td>

</tr>
<tr>
      <td>             
                        <form:hidden path="username"/>
                    </td>

</tr>

<tr>
<td>Company Name :</td>
<td>

<form:input path="companyname" class="form-control"/>
<br>
 <form:errors path="companyname" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Company reg.No:</td>
<td>

<form:input path="companyregno" class="form-control"/>
<br>
 <form:errors path="companyregno" cssClass="errors"></form:errors> 
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

<form:input path="establishedyear" class="form-control"/>
<br>
 <form:errors path="establishedyear" cssClass="errors"></form:errors> 
</td>
</tr>


<%-- <tr>
<td>Password :</td>
<td><form:password path="password" class="form-control" />
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr> --%>

<tr>
<td>Country :</td>
<td>
<select name="country" >
<option value="" disabled selected>Select</option>
 <option value="australia">Australia</option>
<option value="canada">Canada</option>
<option value="denmark">Denmark</option>
<option value="france">France</option>
<option value="germany">Germany</option>
<option value="india">India</option>
<option value="japan">Japan</option>
<option value="US">US</option>
</select>
</td>
</tr>

<tr>
<td>State:</td>
<td>
<select  name="state"  >
<option value="" disabled selected>Select</option>
<option value="australia">New SouthWales</option>
<option value="canada">Victoria</option>
<option value="denmark">QueensLand</option>
<option value="france">Western Australia</option>
<option value="germany">Alberta</option>
<option value="india">British Columbia</option>
<option value="japan">Manitoba</option>
<option value="US">Copenhagen</option>
<option value="australia">AndhraPradesh</option>
<option value="canada">ArunachalPradesh</option>
<option value="denmark">Assam</option>
<option value="france">Bihar</option>
<option value="germany">Chattisgarh</option>
<option value="india">Goa</option>
<option value="india">Gujarat</option>
<option value="US">Haryana</option>
<option value="US">HimachalPradesh</option>
<option value="US">Jharkand</option>
<option value="US">Karnataka</option>
<option value="US">Kerala</option>
<option value="US">MadhyaPradesh</option>
<option value="US">Maharasthra</option>
<option value="US">Orrisa</option>
<option value="US">Punjab</option>
<option value="US">Rajasthan</option>
<option value="US">TamilNadu</option>
<option value="US">Telangana</option>
</select>
</td>
</tr>
<tr>
<td>Address :</td>
<td>
<form:textarea path="address" name="address" rows="5" cols="20" placeholder="Enter your local address"   class="forms" required="true"></form:textarea>
</td>
</tr>

</table>
<tr>

<td colspan="2" align="center"><input type="submit" value="save" class="formsubmitbutton" />

</tr>


</form:form>

</div>

<a href="vendorportal.jsp">Home</a>
</div>

</body>
</html>