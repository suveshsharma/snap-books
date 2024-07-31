<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Profile</title>
<style>

.back{
background-image: url("https://www.studentprojects.live/wp-content/uploads/2022/02/Library-Management-System.jpg"); 
position:absolute;
top:-26px;
left:-9px;
width: 1367px;
height: 645px;
background-size: 1400px 700px;
background-repeat: no-repeat;
}

.one{
background-color:white;
width:334px;
height:40px;
position:absolute;
top:28px;
left:590px;
color: red;
}

.book{
position: absolute;
top: 200px;
left:190px;
width:110px;
height: 120px;
border: dashed;
border-color: red;
}
.book h2{
position:relative;
top:-18px;
}
.book a{
color: yellow;
text-decoration: none;
}
a:hover{
text-decoration: underline;
}

.issued{
position: relative;
top: 200px;
left:400px;
width:123px;
height: 120px;
border: dashed;
border-color: red;
}

.issued h2{
position:relative;
top:-18px;
}

.issued a{
color: yellow;
text-decoration: none;
}

a:hover{
text-decoration: underline;
}

.return{
position: absolute;
top: 200px;
left:640px;
width:123px;
height: 120px;
border: dashed;
border-color: red;
}

.return h2{
position:relative;
top:-18px;
width: 150px;
}
.return a{
color: yellow;
text-decoration: none;
}
a:hover{
text-decoration: underline;
}

.info{
position: relative;
top: 74px;
left:900px;
width:123px;
height: 120px;
border: dashed;
border-color: red;
}
.info h2{
position:relative;
top:-18px;
width: 150px;
}

.info a{
color: yellow;
text-decoration: none;
}
a:hover{
text-decoration: underline;
color: red;
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
<div class="back">
<h1 class="one">Welcome to Admin page </h1>


	<section class="book">
    <img src="   https://cdn-icons-png.flaticon.com/512/9211/9211844.png " width="120px" height="120px" alt="" title="" class="img-small">
	<h2><a href="Booklist.jsp">Books List</a></h2> 	
	</section>
	
	<section class=issued>
	
    <img src="   https://cdn-icons-png.flaticon.com/512/4252/4252309.png " width="120px" height="120px" alt="" title="" class="img-small">

	<h2><a href="issuebooks.jsp">Issue Books</a></h2>
	</section>
	
	<section class="return">

    <img src="   https://cdn-icons-png.flaticon.com/512/5597/5597045.png " width="120px" height="120px" alt="" title="" class="img-small">

	<h2><a href="returnbooks.jsp">Return Books</a></h2>
	
	</section>
	
	<section class="info">

    <img src="   https://cdn-icons-png.flaticon.com/512/3135/3135768.png " width="120px" height="120px" alt="" title="" class="img-small">

	<h2><a href="admininfo.jsp">Admin Profile</a></h2>
	
	</section>
	
	<section class="logout">
	<h2><a href="logout.jsp">Logout Profile</a></h2> 
	</section>
	
	<%
/* String name=request.getAttribute("name").toString(); */
	session.setAttribute("name", request.getAttribute("name"));
	session.setAttribute("pass", request.getAttribute("pass"));
	session.setAttribute("mname", request.getAttribute("mname"));
/* request.setAttribute("nam", name); */
/* request.getRequestDispatcher("admininfo.jsp").forward(request, response); */
%>
</div>


































</body>
</html>