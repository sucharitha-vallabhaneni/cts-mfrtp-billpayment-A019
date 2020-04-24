<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Payment-Admin Login</title>
<link rel="stylesheet" type="text/css" href="/style.css"/>
<script type="text/javascript">
function validate(){
	var id=document.getElementById("userid").value;
	var pwd=document.getElementById("password").value;
	if(id==""){
		document.getElementById("userid").style.borderColor="red";
		alert("please enter valid userid");
		return false;
		}else if(pwd=="")
			{
			document.getElementById("password").style.borderColor="red";
			alert("please enter valid password");
			return false;
			}
}
</script>
</head>
<body>
<div class="header">
<h1>BILL PAYMENT</h1>
</div>
<h2>Admin Login</h2>
<div class="formdata">
<div align="center">
<form onsubmit="return validate()" action="loginverify" method="post" modelAttribute="adminlogin">
<tr>
<td>UserId:</td>
<td><input type="text" name="userid"></td></tr><br><br>
<tr>
<td>Password:<td>
<td><input type="text" name="password"></td><br><br>
<td><input type="submit" value="submit"></td>
</tr>
</form>
<ul>
<li class="l"><a href="#">Forgot Userid</a>
<li class="l"><a href="#">Forgot Password</a>
</ul>
<a href="/">Home</a>

</div>
</div>

</body>
</html>