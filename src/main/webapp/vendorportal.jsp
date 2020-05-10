<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL PAYMENT -VENDOR PORTAL</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">
</head>
<body>
<div class="header">
<h1>Welcome </h1>
<ul class="a">
<div class="navbar">
<li><a href="/vendorupdate" class="a1">Vendorupdate</a></li>
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
    <a href="transactionE">Electricity</a>
    <a href="transactionD">DTH</a>
    </div></div>
     <div class="dropdown">
      <button class="dropbtn">Failed Transactions
       <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
    <a href="failE">Electricity</a>
    <a href="failD">DTH</a>
     </div>
      </div>
   </div>
   </div>
    
<li><a href="#" class="a1">Help</a></li>
<li><a href="/" class="a1">Logoff</a></li>
</ul>
</div>
</body>
</html>