<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DTHbill history</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">

</head>
<body>
<h1>DTH -BILL HISTORY</h1>
<div class="header"></div>
</table>
<div align="center">

<table border="1">
<tr>

<th>Service Provider</th>
<th> Servicenumber</th>
<th>Amount </th>
<th> Billpaiddate</th>

<th>Transactionstatus</th>
</tr>

<c:forEach items="${dbill}" var="dth_bills">
   <tr>
   
   
   
   <td>${dth_bills.dthname}</td>
   <td>${dth_bills.servicenumber}</td>
         
            <td>${dth_bills.amount}</td>
         <td>${dth_bills.billpaydate}</td>
         
            
            <td>${dth_bills.transactionstatus}</td>
            
</tr>
</c:forEach>
</table>
</div>
<a href="billpayhome">BACK</a>
</body>
</html>