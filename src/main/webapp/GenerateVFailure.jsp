<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StockReport</title>
<link rel="stylesheet" type="text/css" href="/style3.css"/>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
</head>
<body>
<div class="nav">
	<h1>Failure Transactions Report</h1>
	
	<a href="adminlogout"><i class="fa fa-power-off"></i> Logout</a>	
</div>
<h2>Failure Transactions</h2>
<div class="formdata">
<table>
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