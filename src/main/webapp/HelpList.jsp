<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin home</title>
<link rel="stylesheet" type="text/css" href="/style1.css">
</head>
<body>
<h1>Welcome</h1>
<div class="header"></div>
<div align="center">

<table border="1">
<tr>
<th>ReportId</th>
<th>Issue</th>
<th>Description</th>
<th>Status</th>
</tr>

<c:forEach items="${helplist}" var="helplist_details">
   <tr>
   <td>${helplist_details.userId}</td>
   <td>${helplist_details.issue}</td>
   <td>${helplist_details.description}</td>
   <td>${helplist_details.status}</td>
   </tr>
</c:forEach>
</table>

</div>



</body>

</html>