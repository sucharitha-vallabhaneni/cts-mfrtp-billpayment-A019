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
<a href="adminportal.jsp">BACK</a>
<div class="header"></div>
<div align="center">

<table border="1">
<tr>
<th>ReporterId</th>
<th>Issue</th>
<th>Description</th>
<th>Status</th>
<!--  <th>resolve</th>-->
</tr>

<c:forEach items="${helplist}" var="help">
   <tr>
   <td>${help.userId}</td>
   <td>${help.issue}</td>
   <td>${help.description}</td>
   <td>${help.status}</td>
   <!--  <td><a href="resolve?id=${help.userId}"><button>Resolve</button></a></td>-->
   </tr>
</c:forEach>
</table>

</div>



</body>

</html>