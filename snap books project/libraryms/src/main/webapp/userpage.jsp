<%@page import="com.files.Employee"%>
<%@page import="com.files.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.files.adminlog" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<style>

.back{
background-image: url("https://w7.pngwing.com/pngs/929/974/png-transparent-blue-stripe-screenshot-blue-sky-daytime-sky-blue-background-blue-angle-other-thumbnail.png"); 
position:absolute;
top:-26px;
left:-9px;
width: 1367px;
height: 645px;
background-size: 1400px 700px;
background-repeat: no-repeat;
}

.one{
width:1545px;
height:40px;
position:absolute;
top:28px;
text-align:center;
color: red;
}

.front img{
position: absolute;
left: 550px;
}

.two form{
position: absolute;
left:610px;
top:310px;
}

.first{
position: absolute;
left:610px;
top:390px;
color: red;
}
.second{
position: absolute;
left:610px;
top:440px;
color: red;
}

.third{
position: absolute;
left:610px;
top:490px;
color: red;
}
.five{
position: absolute;
left:610px;
top:545px;
color: red;
}

.four{
position: absolute;
left:1000px;
top:550px;
color: red;
}

.four h2{
color:green;
border:dotted;
}
.four a{
color:green;
text-decoration: none;
}
.four a:hover{
text-decoration: underline;
color:blue;
}
</style>

</head>

<body>
<div class="back">
<h1 class="one"></h1>
<hr size="4">

<div class=front>
    <img src="https://cdn-icons-png.flaticon.com/512/6837/6837225.png" width="430px" height="300px" alt="" title="" class="img-small">
</div>

<div class="two">
<%
String id=(String)session.getAttribute("id");
String name=(String)session.getAttribute("name");
String pass=(String)session.getAttribute("pass");
String mname=(String)session.getAttribute("mname");



request.setAttribute("id", id);
request.setAttribute("name", name);
request.setAttribute("mname", mname);
request.setAttribute("pass", pass);

/* String id=(String)request.getAttribute("id");
String name=(String)request.getAttribute("name");
String uid=(String)request.getAttribute("uid");
String upass=(String)request.getAttribute("upass"); */
%>
<h1 class="first">User ID: <%out.print(id); %></h1>
<h1 class="second">Name: <%out.print(mname); %></h1>
<h1 class="third">Username: <%out.print(name); %></h1> 
<h1 class="five">Password: <%out.print(pass); %></h1> 

</div>

<div class="four">
<h2><a href="updateuser.jsp">Edit</a></h2>

</div>


</div>

</body>
</html>