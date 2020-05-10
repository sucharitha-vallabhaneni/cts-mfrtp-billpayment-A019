<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/style1.css"/>
</head>
<body>
<h1 >CUSTOMER  FEEDBACK</h1> 
<a href="customerportal.jsp" >BACK</a>
<%
String username =(String) session.getAttribute("username");

%>
<div class="header"/>

</div>

<div align="center">
<form:form onsubmit="return validate()" action="feedbackques" modelAttribute="feedbk" method="post">
<font size="4"><table border="2" style="width:70%">

 
<form:input path="username" id="username"></form:input>
<tr>
<td style="height:50px">Questions</td><td>Agree</td><td>Disagree</td><td>StronglyAgree</td><td>StronglyDisagree</td><td>NeitherNorAgree</td></tr><tr>
<td style="height:50px">Is Information on the website  clear and easy to understand ?</td>
<td><form:radiobutton path="ans1" value="agree" id="ans1" /></td>
<td>
<form:radiobutton path="ans1" value="disagree" id="ans1" /></td>
<td>
<form:radiobutton path="ans1" value="Stronglyagree" id="ans1" /></td>
<td>
<form:radiobutton path="ans1" value="Stronglydisagree" id="ans1" /></td>
<td>
<form:radiobutton path="ans1" value="Neithernoragree" id="ans1" /></td>
</tr>
<tr>
<td style="height:50px"> Can u easily find what you are looking for on the website ?</td>
<td><form:radiobutton path="ans2" value="agree" id="ans2" /></td>
<td>
<form:radiobutton path="ans2" value="disagree" id="ans2" /></td>
<td>
<form:radiobutton path="ans2" value="Stronglyagree" id="ans2" /></td>
<td>
<form:radiobutton path="ans2" value="Stronglydisagree" id="ans2" /></td>
<td>
<form:radiobutton path="ans2" value="Neithernoragree" id="ans2" /></td>
</tr>
<tr>
<td style="height:50px">Does the website includes all information u needed ?</td>
<td><form:radiobutton path="ans3" value="agree" id="ans3" /></td>
<td>
<form:radiobutton path="ans3" value="disagree" id="ans3" /></td>
<td>
<form:radiobutton path="ans3" value="Stronglyagree" id="ans3" /></td>
<td>
<form:radiobutton path="ans3" value="Stronglydisagree" id="ans3" /></td>
<td>
<form:radiobutton path="ans3" value="Neithernoragree" id="ans3" /></td>
</tr>
<tr>
<td style="height:50px">Does The website works well technically loading quicly and displaying appropriatley ?</td>
<td><form:radiobutton path="ans4" value="agree" id="ans4" /></td>
<td>
<form:radiobutton path="ans4" value="disagree" id="ans4" /></td>
<td>
<form:radiobutton path="ans4" value="Stronglyagree" id="ans4" /></td>
<td>
<form:radiobutton path="ans4" value="Stronglydisagree" id="ans4" /></td>
<td>
<form:radiobutton path="ans4" value="Neithernoragree" id="ans4" /></td>
</tr>
<tr>
<td style="height:50px">Does The website meets your's needs ?</td>
<td><form:radiobutton path="ans5" value="agree" id="ans5" /></td>
<td>
<form:radiobutton path="ans5" value="disagree" id="ans5" /></td>
<td>
<form:radiobutton path="ans5" value="Stronglyagree" id="ans5" /></td>
<td>
<form:radiobutton path="ans5" value="Stronglydisagree" id="ans5" /></td>
<td>
<form:radiobutton path="ans5" value="Neithernoragree" id="ans5" /></td>
</tr>
</table>
</font>
<br>

<input type="submit" value ="Submit"/>

</form:form>
</div>
<br><br>

<p1>${message }</p1>
</body>

</html>