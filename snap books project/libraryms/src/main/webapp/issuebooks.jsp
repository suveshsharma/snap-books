<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>issuebooks</title>
<style>
.front{
background-image: url("https://png.pngtree.com/thumb_back/fh260/back_our/20190622/ourmid/pngtree-creative-synthesis-simple-book-education-and-training-background-image_219497.jpg");
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
	top: 10px;
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
<h1 class="one">Issue Books</h1>
<hr size="4">
<div class="inner">

<form action="issuebooks" method="get">
<h2>Book Title: <input type="text" name="btitle"> </h2> <br> <br>
<h2>User id: <input type="text" name="id"> </h2> <br> <br>
<h2>Issue Date: <input type="text" name="issuebook"> </h2> <br> <br>
<h2>Return Date: <input type="text" name="returnbook"> </h2> <br> <br>
<input type="submit"> &nbsp; &nbsp;
<input type="reset">
</form>
</div>
</div>
</body>
</html>