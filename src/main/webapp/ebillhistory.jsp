<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebill history</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">

</head>
<body>
<h1>ELECTRICITY -BILL HISTORY</h1>
<div class="header"></div>
</table>
<div align="center">

<table border="1">
<tr>

<th>billnumber</th>
<th> servicenumber</th>
<th>amount </th>
<th> billpaydate</th>
<th>board</th>
<th>transactionstatus</th>
</tr>

<c:forEach items="${ebill}" var="electric_bills">
   <tr>
   
   
   
   <td>${electric_bills.billnumber}</td>
   <td>${electric_bills.servicenumber}</td>
         
            <td>${electric_bills.amount}</td>
         <td>${electric_bills.billpaydate}</td>
         
            <td>${electric_bills.board}</td>
            <td>${electric_bills.transactionstatus}</td>
            
</tr>
</c:forEach>
</table>
</div>
<a href="billpayhome">BACK</a>
</body>
</html>