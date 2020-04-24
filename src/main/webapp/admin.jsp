<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registration page</title>
<link rel="stylesheet" type="text/css" href="/style.css"/>
<script type="text/javascript">
function validate(){
	var fname=document.getElementById("firstname").value;
	var lname=document.getElementById("lastname").value;
	var age=document.getElementById("age").value;
	var gender=document.getElementById("gender").value;
	var phone=document.getElementById("contactNumber").value;
	var id=document.getElementById("adminId").value;
	var pwd=document.getElementById("password").value;
	var ans=document.getElementById("answer").value;	
	var pattern=/[A-Za-z0-9]{6,32}/;
	var pattern1=/^((\+[1-9]{1,4}[ \-]*)|(\([0-9]{2,3}\)[ \-]*)|([0-9]{2,4})[ \-]*)*?[0-9]{3,4}?[ \-]*[0-9]{3,4}?$/;
	var pattern2=/^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;
	if(fname==""){
		alert("Please update Mandatory fields");
		document.getElementById("firstname").style.borderColor="red";
		return false;
		}
	 if(lname==""){
		alert("Please update Mandatory fields");
		document.getElementById("lastname").style.borderColor="red";
		return false;
		}
	 if(age==""){
		document.getElementById("Age").style.borderColor="red";
		alert("Please update Mandatory fields");
		return false;
		}
	 if(gender==""){
		alert("Please update Mandatory fields");
			document.getElementById("Gender").style.borderColor="red";
			return false;
			}
	 if(phone==""){
		alert("Please update Mandatory fields");
		document.getElementById("contactNumber").style.borderColor="red";
		return false;
		}		
	 if(id==""){
		alert("Please update Mandatory fields");
		document.getElementById("adminId").style.borderColor="red";
		
		return false;
		}
	 if(pwd==""){
		alert("Please update Mandatory fields");
		document.getElementById("password").style.borderColor="red";		
		return false;
		}
	 if(ans==""){
		alert("Please update Mandatory fields");
		document.getElementById("answer").style.borderColor="red";
		return false;
		}
	 if(!pattern.test(id)){
		alert("Enter userid with minimum of 6 characters with atleast one numerical value");
		document.getElementById("adminId").style.borderColor="red";
		return false;		
		}
	 if(!pattern1.test(phone)){
		alert("Enter valid phone number");
		document.getElementById("contactNumber").style.borderColor="red";
		return false;
		}
	 if(!pattern2.test(pwd)){
		alert("Enter password with minimum of 7 characters with one special character and numerical value ");
		document.getElementById("password").style.borderColor="red";
		return false;
		
		}		
	
}
</script>
</head>
<body>
<div class="header"/>
<h1>BILL PAYMENT</h1>
</div>
<h2>Admin Registration</h2>
<div class="formdata">
<form:form onsubmit="return validate()" action="adminreg" modelAttribute="admin" method="post">
<!-- First Name, Last Name, Age, Gender, Contact Number, Admin Id, Password -->
<table>
<tr>
<td>FirstName:</td>
<td><form:input path="firstname" id="firstname" /></td>
</tr>
<tr>
<td>LastName:</td>
<td><form:input path="lastname" id="lastname" /></td>
</tr>
<tr>
<td>Age:</td>
<td><form:input path="age" id="age"/></td>
</tr>
<tr>
<td>Gender:</td>
<td><form:radiobutton path="gender" value="female" id="gender" />Female
<form:radiobutton path="gender" value="male" id="gender" />Male
</td>
</tr>
<tr>
<td>Contact Number:</td>
<td><form:input path="contactNumber" id="contactNumber" />
</td>
</tr>
<tr>
<td>AdminId:</td>
<td><form:input path="adminId" id="adminId" /></td>
</tr>
<tr>
<td>Password</td>
<td><form:input path="password" id="password" type="password"/>
</tr>
<tr>
<td>Secret Question:</td>
<td>
<form:select path="secretQuestion" id="secretQuestion" class="select-box" >
<option  selected="selected" value="What is your Birthdate?">What is your Birthdate?</option>
  <option value="In which school you have studied first?">In which school you have studied first?</option>
  <option value="What is your favourite movie?">What is your favourite movie?</option>
</form:select>
</td>
</tr>
<tr>
<td colspan="2" align="right">
<form:input path="answer" id="answer" placeholder="Answer" width="170px" />
</td>
</tr>
</table>
<input type="submit" value ="submit" class="formsubmitbutton"/>
</form:form>
Already having account?<a href="adminlogin">Login</a>
<br>
${message}
</body>
<a href="/">Home</a>
</div>
</html>