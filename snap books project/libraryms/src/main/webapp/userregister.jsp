<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<style>
.front{
background-image: url("https://mdbootstrap.com/img/Photos/Horizontal/Nature/6-col/img%20(122).jpg");
position:absolute;
top:-26px;
left:-9px;
width:1545px;
height:738.9px;
background-repeat: no-repeat;
background-size: 1400px 700px;
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
	<h1 class="one">User Registration</h1>
	<hr size="5">
	<div class="inner">
	
	<form action="userregistration" method="get">
	<h2>Enter Id: <input type="text" name="id"></h2> <br>
	<h2>Enter Name: <input type="text" name="name"></h2> <br>
	<h2>Enter Username: <input type="text" name="uid"></h2> <br>
	<h2>Enter Password: <input type="password" name="upass"></h2> <br>
	
	<input type="submit"> &nbsp; &nbsp;
	<input type="reset">
	</form>
	
	</div>
	</div>
	
</body>
</html>