<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VENDORLIST</title>

<link rel="stylesheet" type="text/css" href="/style1.css">

</head>
<body>
<div class="header"></div>
<h1>VENDOR LIST</h1>
<div align="center">


</table>
<div align="center">

<table border="1">
<tr>
<th>Username</th>
<th>companyname</th>

<th> companyregno</th>
<th>Address </th>
<th> country</th>
<th>state</th>
<th>email</th>
<th>mobile</th>
<th>website</th>
<th>Cid</th>
<th>cvd</th>
<th>establishedyear</th>
</tr>

<c:forEach items="${userList}" var="vendors_details">
   <tr>
   
   <td>${vendors_details.username}</td>
   
   <td>${vendors_details.companyname}</td>
   
   <td>${vendors_details.companyregno}</td>
         
         
            <td>${vendors_details.address}</td>
            <td>${vendors_details.country}</td>
         
            <td>${vendors_details.state}</td>
            <td>${vendors_details.email}</td>
            <td>${vendors_details.mobile}</td>
               <td>${vendors_details.website}</td>
                  <td>${vendors_details.cid}</td>
                     <td>${vendors_details.cvd}</td>
<td>${vendors_details.establishedyear}</td>
      
   <li><a href="/edit">Edit</a></li>
   </tr>
   </c:forEach>
<br>
</table>
</div>
<li><a href="/back" >BACK</a></li>

</body>


</html>