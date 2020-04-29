<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL PAYMENT-CUSTOMER REGISTRATION</title>
<link rel="stylesheet" type="text/css" href="cusstyle.css">
</head>
<body>





<div class="header1">
<h1>BILL PAYMENT-CUSTOMER REGISTRATION</h1>

</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="cusregistration" method="post" modelAttribute="cusreg" style="margin-top:50px;margin-left:30px;">

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
<td>First Name :</td>
<td>

<form:input path="firstname" class="form-control"/>
<br>
 <form:errors path="firstname" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Last Name :</td>
<td>

<form:input path="lastname" class="form-control"/>
<br>
 <form:errors path="lastname" cssClass="errors"></form:errors> 
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
<td>Email :</td>
<td>

<form:input path="email" class="form-control"/>
<br>
 <form:errors path="email" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Mobile :</td>
<td>

<form:input path="mobile" class="form-control"/>
<br>
 <form:errors path="mobile" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Gender:</td>

<td>


<input type="radio" name="gender" value="male" >Male
<input type="radio" name="gender" value="female">Female
<input type="radio" name="gender" value="male">Others
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
<br>
<br>

<tr>
<td>State :</td>


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
<br>
<br>
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
 <option value="australia">What is the name of town where you were born?</option>
<option value="canada">What was your first car?</option>
<option value="denmark">What elementary school did you attend?</option>
<option value="france">What is the name of your pet?</option>
</select>
</td>
</tr>
<br>
<br>
<tr>
<td>Answer: </td>

</tr>
<td>
<form:input path="answer" class="form-control" placeholder="Your answer" />
<br>
 <form:errors path="answer" cssClass="errors"></form:errors> 

</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Register" class="formsubmitbutton" />

</tr>

</table>



</form:form>


Existing Customer?<a href="/customer" style="color:yellow;"> SignIn</a>
</div>

<a href="/">Home</a>
</div>
</body>
</html>
    