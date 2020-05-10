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
<h1>RECORDED BILLS</h1>
<div class="header"></div>
</table>
<div align="center">

<table border="1">
<tr>

<th>Bill name</th>
<th> Bill Number</th>
<th>Amount </th>
<th> Billpaiddate</th>


</tr>

<c:forEach items="${rbill}" var="records_bills">
   <tr>
   
   
   
   <td>${records_bills. billname}</td>
   <td>${records_bills.billnumber}</td>
         
            <td>${records_bills.billamount}</td>
         <td>${records_bills.billpaiddate}</td>
         
            
           
            
</tr>
</c:forEach>
</table>
</div>
<a href="billpayhome">BACK</a>
</body>
</html>