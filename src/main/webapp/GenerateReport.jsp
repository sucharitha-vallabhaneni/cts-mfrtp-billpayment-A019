<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report</title>

<link rel="stylesheet" type="text/css" href="/style1.css">

<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
</head>
<body>
<%
String userid =(String) session.getAttribute("adminusername");
if(userid==null)
{
	response.sendRedirect("/");
}
%>
<div class="nav">
	<h1> Successful Transactions Report</h1>
	
	<a href="adminlogout"> BACK</a>	
</div>

<div class="formdata">
<table border="2" align="center">
	<tr>
	<th>
	Bill Id
	</th>
	<th>
	Amount
	</th>
	
	</tr>
	<c:forEach items="${list}" var="electric">
	
	
	<tr>
	<!-- <td><i class="fa fa-plus-square" aria-hidden="false"></i></td> -->
	<td>${electric.id}</td>
	<td>${electric.amount}</td>
	
	</tr>
	
	</c:forEach>
	</table>	
</div>
</body>
</html>