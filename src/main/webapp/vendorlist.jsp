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

<c:forEach items="${userList}" var="vendor_details">
   <tr>
   
   <td>${vendor_details.username}</td>
   
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
      
   <td>${user.status}</td>
   <td><a href="activate?id=${vendor_details.username}"><button>Activate</button></a></td>
   <td><a href="deactivate?id=${vendor_details.username}"><button>Deactivate</button></a></td>
   </tr>
   </c:forEach>
<br>
</table>
</div>
<li><a href="/back" >BACK</a></li>

</body>

</html>