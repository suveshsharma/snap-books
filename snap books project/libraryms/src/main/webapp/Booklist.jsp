<%@page import="com.files.BooksDao"%>
<%@page import="com.files.Books"%>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
<style>

.one{
background-image: url("https://marketplace.canva.com/EAD2962NKnQ/2/0/1600w/canva-rainbow-gradient-pink-and-purple-virtual-background-_Tcjok-d9b4.jpg");
position:absolute;
top:-26px;
left:-9px;
width: 1367px;
height: 645px;
background-size: 1400px 700px;
background-repeat: no-repeat;
}

.one h1{
text-align: center;
position:relative;
top:10px;
color: red;
}
table{
position: relative;
top:-30px;
left:12px;
text-align: center;
}
.add{
/* background-color:white; */
position: relative;
top:2px;
left:400px;
border: solid;
border-color:red;
width:180px;
height:50px;
}
.add a{
text-decoration: none;
color:green;
}
.add a:hover{
text-decoration: underline;
}

.delete{
/* background-color:white; */
position: relative;
top:-54px;
left:970px;
border: solid;
border-color:red;
width:150px;
height:50px;
}
.delete a{
text-decoration: none;
color:green;
}
.delete a:hover{
text-decoration: underline;
}

</style>
</head>
<body>
	<div class="one">
	<h1>Book List</h1>
	<hr size="4">
	
	 <div class="add">
	 <h2 ><a href="addbooks.jsp">Add New Books</a></h2>
	 </div>
	 
	  <div class="delete">
	 <h2 ><a href="deletebooks.jsp">Delete Books</a></h2>
	 </div>
	
	<table border="4" width=99%>
	<tr>
	<th>Book title</th>
	<th>Book Language</th>
	<th>Book Author</th>
	<th>Book Available</th>
	</tr>
<%	BooksDao dao=new BooksDao();
ArrayList<Books> book=dao.getdata();
	
for(Books b:book)
{	%>
	<tr>
	<td><%out.print(b.getBtitle());%></td>
	<td><%out.print(b.getBlanguage());%></td>
	<td><%out.print(b.getBauthor());%></td>
	<td><%out.print(b.getBavailable());%></td>
	</tr>
	<%
}	
%>	
	</table>
	
	 
	
	</div>

</body>
</html>