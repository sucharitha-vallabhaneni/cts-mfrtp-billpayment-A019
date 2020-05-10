<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">

</head>
<body>
<h1>DTH-BILL PAYMENT</h1>
<br>
<form action="getdthPaymetMode" method="post">
<label>DTH-service Number :</label>
&nbsp;
<input type="text" name="bl" value="${billnumber }" readonly>
<br>
<br>
<br>
<br>
<label>Payment Method :</label>
&nbsp;
<select name="pmethod">

<option value="credit">Credit/Debit Card</option>
<option value="gpay">Google Pay</option>
</select>
&nbsp;
&nbsp;
<input type="submit" value="Pay">
</form>
</body>
</html>