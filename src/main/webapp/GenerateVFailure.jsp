<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report</title>
<h1>Failed Transactions Report</h1>
<a href="vendorportal.jsp"> BACK</a>	
<link rel="stylesheet" type="text/css" href="/cusstyle2.css"/>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
</head>
<body>
<div class="nav">
	
	
	
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
	<c:forEach items="${flist}" var="dth">
	
	
	<tr>
	<!-- <td><i class="fa fa-plus-square" aria-hidden="false"></i></td> -->
	<td>${dth.id}</td>
	<td>${dth.amount}</td>
	
	</tr>
	
	</c:forEach>
	</table>	
</div>
</body>
</html>