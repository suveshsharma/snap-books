<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<style>

.back{
background-image: url("https://blogs.nottingham.ac.uk/librarymatters/files/2017/07/Scanning.jpg"); 
position:absolute;
top:-26px;
left:-9px;
width:1366px;
height:645px;
background-repeat: no-repeat;
background-size: 1400px 700px;
}

.one{
position:relative;
top:18px;
color: red;
text-align: center;
}

.two{
position: absolute;
top:200px;
left:300px;
border: dashed;
width:195px;
height: 200px;
color:red;
}

.two a{
text-decoration: none;
color: red;
font-weight: bolder;
}

.two a:hover{
text-decoration: underline;
}

.in{
position: absolute;
left:10px;
top:200px;
}


.three{
position: absolute;
top:200px;
left:600px;
border: dashed;
width:195px;
height: 200px;
color:red;
}
.three a{
text-decoration: none;
color: red;
font-weight: bolder;
}
.three a:hover{
text-decoration: underline;
}
.out{
position: absolute;
left:43px;
top:200px;
}

.four{
position: absolute;
top:200px;
left:920px;
border: dashed;
width:195px;
height: 200px;
color:red;
}
.four img{
position: relative;
top:-29px;
left:-30px;
}
.four a{
text-decoration: none;
color: red;
font-weight: bolder;
}
.four a:hover{
text-decoration: underline;
}
.center{
position: absolute;
left:43px;
top:200px;
}
.logout{
position: absolute;
top:40px;
right:200px;
background-color: wheat;
height: 50px;
font-size: 1em;
font-weight: bolder;
border: dashed;
}

.logout a{
color: red;
text-decoration: none;
}

.logout a:hover{
text-decoration: underline;
}
</style>

</head>

<body>

<%
session.setAttribute("name", request.getAttribute("name"));
session.setAttribute("pass", request.getAttribute("pass"));
session.setAttribute("mname", request.getAttribute("mname"));
session.setAttribute("id", request.getAttribute("id"));
%>

<div class="back">
<h1 class="one">Welcome to User Profile Page</h1>

<div class="two">
    <img src="   https://cdn-icons-png.flaticon.com/512/4410/4410712.png " width="200px" height="200px" alt="" title="" class="img-small">

<h2 class="in"><a href="isbook.jsp">Issued Book List</a></h2>

</div>

<div class="three">

    <img src="   https://cdn-icons-png.flaticon.com/512/3038/3038168.png " width="200px" height="200px" alt="" title="" class="img-small">
<h2 class="out"><a href="booklists.jsp">Book List</a></h2>

</div>

<div class="four">

    <img src="   https://cdn-icons-png.flaticon.com/512/6542/6542954.png " width="256" height="256" alt="" title="" class="img-small">
<h2 class="center"><a href="userpage.jsp">User Profile</a></h2>

</div>

<div class="logout">
	<h2><a href="logout.jsp">Logout Profile</a></h2> 
</div>


</div>

</body>
</html>