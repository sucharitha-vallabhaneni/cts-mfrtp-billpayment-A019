<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VENDOR LIST</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">

</head>
<body>
<h1>VENDOR LIST</h1>
<div class="header"></div>
</table>
<div align="center">

<table border="1">
<tr>

<th>companyname</th>
<th> companyregno</th>
<th>Address </th>
<th> country</th>
<th>state</th>
<th>email</th>
<th>mobile</th>
<th>website</th>
<th>Certificate Issued Date</th>
<th>Certificate Validity Date</th>
<th>establishedyear</th>
</tr>

<c:forEach items="${usersList}" var="vendor_details">
   <tr>
   
   
   
   <td>${vendor_details.companyname}</td>
   <td>${vendor_details.companyregno}</td>
         
            <td>${vendor_details.address}</td>
         <td>${vendor_details.country}</td>
         
            <td>${vendor_details.state}</td>
            <td>${vendor_details.email}</td>
            <td>${vendor_details.mobile}</td>
               <td>${vendor_details.website}</td>
                  <td>${vendor_details.cid}</td>
                     <td>${vendor_details.cvd}</td>
<td>${vendor_details.establishedyear}</td>
</tr>
</c:forEach>
</table>
</div>
<a href="backtohome">BACK</a>
</body>
</html>