<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin home</title>

<link rel="stylesheet" type="text/css" href="/style.css">


</head>
<body>
<%
String userid =(String) session.getAttribute("name");
if(userid==null)
{
	response.sendRedirect("/");
}
%>

<div class="header">
<h1>Welcome <span><%=session.getAttribute("name")%></span></h1>
<ul class="a">
<li><a href="/vendors" class="a1">List of newly registered vendors</a></li>
<li><a href="#" class="a1">Details of vendor</a></li>
<li><a href="#" class="a1">Reporting Technical issues</a></li>
<li><a href="#" class="a1">Contact Number issues</a></li>
</li>
<li><a href="adminlogout" class="a1">Logout</a></li>
</ul>
</div>
</body>
</html>