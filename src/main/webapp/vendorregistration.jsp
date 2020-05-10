<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL PAYMENT-VENDOR REGISTRATION</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">
</head>
<body>
<div class="header1">
<h1>BILL PAYMENT-VENDOR REGISTRATION</h1>

</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="venregistration" method="post" modelAttribute="venreg" style="margin-top:50px;margin-left:30px;">

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
<td>Contact number:</td>
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

<form:input type="date" path="cid" class="form-control"/>
<br>
 <form:errors path="cid" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Certificate Validity Date :</td>
<td>

<form:input type="date" path="cvd" class="form-control"/>
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


<tr>
<td>Password :</td>
<td><form:password path="password" class="form-control" placeholder="xxxxxxxx"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td> Confirm Password :</td>
<td><form:password path="confirmationpassword" class="form-control" placeholder="xxxxxxxx"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>

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
<option value="New SouthWales">New SouthWales</option>
<option value="Victoria">Victoria</option>
<option value="QueensLand">QueensLand</option>
<option value="Western Australia">Western Australia</option>
<option value="AndhraPradesh">AndhraPradesh</option>
<option value="ArunachalPradesh">ArunachalPradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chattisgarh">Chattisgarh</option>
<option value="MadhyaPradesh">MadhyaPradesh</option>
<option value="Maharasthra">Maharasthra</option>
<option value="Orrisa">Orrisa</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="TamilNadu">TamilNadu</option>
<option value="Telangana">Telangana</option>
</select>
</td>
</tr>
<tr>
<td>Address :</td>
<td>
<textarea name="address" rows="5" cols="20" placeholder="Enter your local address"   class="forms" required></textarea>
</td>
</tr>
<tr>
<td>Secret Question :</td>
<td>
<select  name="secretquestion" >
<option value="" disabled selected>Select</option>
 <option value="What is the name of town where you were born?">What is the name of town where you were born?</option>
<option value="What was your first car?">What was your first car?</option>
<option value="What elementary school did you attend?">What elementary school did you attend?</option>
<option value="What is the name of your pet?s">What is the name of your pet?</option>
</select>
</td>
</tr>
<br>
<br>
<tr>
<td>Answer: </td>


<td>
<form:input path="answer" class="form-control" placeholder="Your answer" />
<br>
 <form:errors path="answer" cssClass="errors"></form:errors> 

</td>
</tr>

</table>
<tr>

<td colspan="2" align="center"><input type="submit" value="Register" class="formsubmitbutton" />

</tr>


</form:form>


Existing Vendor?<a href="/vendor" style="color:yellow;"> SignIn</a>
</div>

<a href="/">Home</a>
</div>
</body>
</html>
    