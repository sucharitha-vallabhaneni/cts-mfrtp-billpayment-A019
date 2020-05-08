<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/cusstyle.css">
<script language="javascript" type="text/javascript">
    function dynamicdropdown(listindex)
    {
        switch (listindex)
        {
        case "AP" :
            document.getElementById("board").options[0]=new Option("Select Board","");
            document.getElementById("board").options[1]=new Option("Southern Power Distribution company","SPDCL");
            document.getElementById("board").options[2]=new Option("Eastern Power Distribution company","EPDCL");
            break;
        case "Assam" :
            document.getElementById("board").options[0]=new Option("Select Board","");
            document.getElementById("board").options[1]=new Option("Assam Power Distribition Company","APDCL");
            break;
        case "Bihar" :
            document.getElementById("board").options[0]=new Option("Select Board","");
            document.getElementById("board").options[1]=new Option("South Bihar Power Distribution","SBPD");
            document.getElementById("board").options[2]=new Option("North Bihar Power Distribution","NBPD");
            break;
       case "chattisgarh" :
        document.getElementById("board").options[0]=new Option("Select Board","");
        document.getElementById("board").options[1]=new Option("Chattisgarh Power Distribution company","CPDCL");
        break;
       case "goa" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Goa Electricity Department","GEDept");
           break;
       case "gujarat" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Dakshin Gujarat Vij Company","DGVC");
           document.getElementById("board").options[2]=new Option("Madhya Gujarat Vij Company","MGVC");
           document.getElementById("board").options[3]=new Option("Paschim Gujarat Vij Company","PGVC");
           document.getElementById("board").options[4]=new Option("Torrent power","TPLtd");
           document.getElementById("board").options[5]=new Option("Uttar Gujarat Vij Company","EPDCL");
            break;
       case "Haryana" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Dakshin Haryana Bijli Vitran Nigam","DHBVN");
           document.getElementById("board").options[2]=new Option("Uttar Haryana Bijli Vitran Nigam","UHBVN");
           break;
       case "Himachalpradesh" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("HimachalPradesh State Electricity Board","HPSEB");
           break;
       case "jharkand" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Jamshedpur Utilities & Services","JUSCO");
           document.getElementById("board").options[2]=new Option("Jharkand Bijli Vitran Nigam","JBVNL");
           break;
       case "karnataka" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Bangalore Electricity Supply Company","BESCOM");
           document.getElementById("board").options[2]=new Option("Chamundeswari Electricity Supply Corporation","Cesc Mysore");
           document.getElementById("board").options[3]=new Option("Gulbarga Electricity Supply Company","GESCOM");
           document.getElementById("board").options[4]=new Option("Hubli Electricity Supply Company","HESCOM");
           document.getElementById("board").options[5]=new Option("Mangalore Electricity Supply Company","MESCOM");
           break;
       case "kerala" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Kerala State Electricity Board","KSEB");
           break;
       case "Madhyapradesh" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("MP Madhya Kshetra Vidyut Vitran","Bhopal");
           document.getElementById("board").options[2]=new Option("MP Poorva Kshetra Vidyut Vitran","Jabalpur");
           document.getElementById("board").options[3]=new Option("MP Paschim Kshetra Vidyut Vitran","MPPKVVCL");
           break;
       case "Maharasthra" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Adani Electricity","AE");
           document.getElementById("board").options[2]=new Option("BEST","BEST");
           document.getElementById("board").options[3]=new Option("MahaVitran-Electricity Distribution company","MSEDCL");
           document.getElementById("board").options[4]=new Option("Torrent power","TPLtd");
           document.getElementById("board").options[5]=new Option("Tata power-Mumbai","Tata");
           break;
       case "newdelhi" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("BSES Rajdhani-Delhi","BSES");
           document.getElementById("board").options[2]=new Option("BSES Yamuna-Delhi","BSESY");
           document.getElementById("board").options[3]=new Option("New Delhi Muncipal Council","NDMC");
           document.getElementById("board").options[4]=new Option("Tata power-DDL","TataDDL");
           break;
       case "odisha" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("CESU","CESU");
           document.getElementById("board").options[2]=new Option("NESCO UTILITY","NESCO");
           document.getElementById("board").options[3]=new Option("SOUTHCO UTILITY","SOUTHCO");
           document.getElementById("board").options[4]=new Option("WESCO UTILITY","WESCO");
           break;
       case "punjab" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Punjab State Power Corporation","PSP");
           break;
       case "Rajasthan" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Ajmer Vidyut Vitran Nigam","AVVNL");
           document.getElementById("board").options[2]=new Option("Bharatpur Electricity Services","BESL");
           document.getElementById("board").options[3]=new Option("Bikaner Electricity Supply Limited","CESC");
           document.getElementById("board").options[4]=new Option("TP Ajmer Distribution Ltd","TPADL");
           document.getElementById("board").options[5]=new Option("Jaipur Vidyut Vitran Nigam","JVVNL");
           document.getElementById("board").options[6]=new Option("Jodhpur Vidyut Vitran Nigam","JDVVNL");
           break;
       case "tamilnadu" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Tamilnadu Electricity Board","TNEB1");
           break;
       case "telangana" :
           document.getElementById("board").options[0]=new Option("Select Board","");
           document.getElementById("board").options[1]=new Option("Telangana State Southern Power Distribution company ","TSSPDCL");
           document.getElementById("board").options[2]=new Option("Tsspdcl-Prepaid Meter Recharge ","TSSPDCLPM");
           document.getElementById("board").options[3]=new Option("Northern Power Distribution company","TSNPDCL");
           break;
          
        }
        return true;
    }
</script>

</head>
<body>
<div class="header1">
<h1>Electricity-Bill Payment</h1>
${message }
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="ebillsave" method="post" modelAttribute="electricity" style="margin-top:50px;margin-left:30px;">
<table>

<tr>
<td>Bill Number:</td>
<td>
<form:input path="billnumber"  class="form-control" />
<br>
 <form:errors path="billnumber" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Service Number:</td>
<td>
<form:input path="servicenumber"  class="form-control" required="required"/>
<br>
 <form:errors path="servicenumber" cssClass="errors"></form:errors> 
</td>
</tr>

<tr>
<td>Amount:</td>
<td>
<form:input path="amount"   class="form-control"/>
<br>
 <form:errors path="amount" cssClass="errors"></form:errors> 
</td>
</tr>


<tr>
<td>State:</td>
<td>
<div class="category_div" id="category_div">
        <select id="state" name="state" onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
        <option value="" disabled selected>Select state</option>
        <option value="AP">AndhraPradesh</option>

<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="chattisgarh">Chattisgarh</option>
<option value="goa">Goa</option>
<option value="gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachalpradesh">HimachalPradesh</option>
<option value="jharkand">Jharkand</option>
<option value="karnataka">Karnataka</option>
<option value="kerala">Kerala</option>
<option value="Madhyapradesh">MadhyaPradesh</option>
<option value="Maharasthra">Maharasthra</option>
<option value="newdelhi">New Delhi</option>
<option value="odisha">Odisha</option>
<option value="punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="tamilnadu">TamilNadu</option>
<option value="telangana">Telangana</option>

        
        </select>
    </div>
    </td>
    </tr>
    
    <tr>
    <td>Board:</td>
    <td>
    <div class="sub_category_div" id="sub_category_div">
        <script type="text/javascript" language="JavaScript">
        document.write('<select name="board" id="board"><option value="" disabled selected>Select board</option></select>')
        </script>
        <noscript>
        <select id="board" name="board">
            
        </select>
        </noscript>
    </div>
</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Confirm" class="formsubmitbutton" />
</tr>
</table>
</form:form>
</div>
</div>
<a href="billpayhome">BACK</a>
</body>
</html>