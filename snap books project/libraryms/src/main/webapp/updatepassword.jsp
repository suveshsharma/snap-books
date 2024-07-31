<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Profile</title>
<style>
.front{
background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20201026/pngtree-scene-with-geometrical-forms-the-poster-model-minimal-background-render-image_437743.jpg");
position:absolute;
top:-26px;
left:-9px;
width: 1367px;
height: 645px;
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
form {
	text-align: center;
	position: relative;
	top: 50px;
}

.inner{
width: 500px;
height: 500px;
position: relative;
left: 510px;
top: 30px;
opacity: 100%;
font-size: 1.1em;
font-weight: bold;
}
input{
width: 150px;
}

</style>

</head>
<body>
	
	<div class="front">
	<h1 class="one">Update Profile</h1>
	<hr size="5">
	<div class="inner">
	
	<form action="updatepass" method="get">
	<h2>Enter Name: <input type="text" name="name" value="<%=request.getParameter("name")%>"></h2> <br> <br>
	<h2>Enter Username: <input type="text" name="uid" value="<%=request.getParameter("uid") %>"></h2> <br> <br>
	<h2>Enter Password: <input type="password" name="upass" value="<%=request.getParameter("upass") %>"></h2> <br> <br>
	
	<input type="submit"> &nbsp; &nbsp;
	<input type="reset">
	</form>
	
	</div>
	</div>
	
</body>
</html>