<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin home</title>

<link rel="stylesheet" type="text/css" href="/style1.css">


</head>
<body>
<%
String username=(String)session.getAttribute("adminusername");
%>
<div class="header1">
<span class="welcome">Bill Payment</span>
<span class="headerlogo">Welcome, <%=username %></span>


</div>




<div class="navbar">
  <a href="/vendors">Registered vendors</a>
 
  <div class="dropdown">
    <button class="dropbtn">Generate Report
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <div class="dropdown">
      <button class="dropbtn">Successful Transactions
       <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="transaction">Electricity</a>
    <a href="transaction1">DTH</a>
    </div></div>
     <div class="dropdown">
      <button class="dropbtn">Failed Transactions
       <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="fail">Electricity</a>
    <a href="fail1">DTH</a>
     </div>
      </div>
  </div> 
  </div>
  <a href="#">Report issues</a>
  <a href="/">Logout</a>
</div>

</body>
</html>