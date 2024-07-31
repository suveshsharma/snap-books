<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.files.issueBooksDao" %>  
<%@ page import="java.util.ArrayList" %>     
<%@ page import="com.files.issuebook" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Return Books</title>
<style>
.front{
background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20191106/pngtree-back-to-school-rectangular-blackboard-education-book-pen-holder-image_321417.jpg");
position:absolute;
top:-26px;
left:-9px;
width: 1370px;
height: 630px;
background-size: 1400px 700px;
background-repeat: no-repeat;
}

.one{
color: red;
font-weight: bolder;
text-align: center;
position: relative;
top: 20px;
}

.inner{
width: 1545px;
height: 100px;
position: relative;
left: 0px;
top: 20px;
font-size: 1.1em;
font-weight: bold;
}
.inner form{
position: absolute;
left:40px;
top:-10px;
color: blue;
}
table{
position: relative;
top:150px;
left:12px;
text-align: center;
}
.two h2{
position: absolute;
top:80px;
left:680px;
color:blue;
}


</style>

</head>
<body>
	
	<div class="front">
	<h1 class="one">Return Books</h1>
	<hr size="5">
	<div class="inner">
	
	<form action="returnbook" method="get">
	<h2>Student id <input type="text" name="sid"></h2>
	<input type="submit">
	</form>
	
	<div class="two">
	<h2>Issued Books List</h2>
	<table border="4" width=87%>
	<tr>
	<th style="color:red; font-weight: bolder;">Book title</th>
	<th style="color:red; font-weight: bolder;">User Id</th>
	<th style="color:red; font-weight: bolder;">Issued Date</th>
	<th style="color:red; font-weight: bolder;">Return Date</th>
	</tr>
<%	issueBooksDao dao=new issueBooksDao();
ArrayList<issuebook> book=dao.showbooks();
	
for(issuebook b:book)
{	%>
	<tr>
	<td><%out.print(b.getBtitle());%></td>
	<td><%out.print(b.getId());%></td>
	<td><%out.print(b.getIssuebook());%></td>
	<td><%out.print(b.getReturnbook());%></td>
	</tr>
	<%
}	
%>	
	</table>
	</div>
	
	</div>
	</div>
	
</body>
</html>