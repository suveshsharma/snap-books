<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<style>

.first{
position:absolute;
top:-26px;
left:-9px;
width: 1367px;
height: 645px;
background-size: 1400px 700px;
background-repeat: no-repeat;
background-image: url("https://thumbs.dreamstime.com/b/login-box-finger-pushing-username-password-fields-office-background-62243752.jpg");

}

.one{
text-align: center;
font-size: 2.4em;
font-weight: bolder;
color: orange;
}

form{
text-align: center;
color:orange;
font-size: 1.1em;
}

input{
font-size:1em;
}

a{
text-decoration: none;
color:orange;
font-weight: bolder;
font-size: 1.1em;
}

a:hover{
text-decoration: underline;
}

</style>
</head>
<body>
 
 

<div class="first">
 <h1 class="one">Admin Login</h1>
 
 <%
 String n=request.getParameter("attempt");
 int i;
 if(n==null)
 {
	 i=0;
 }
 else{
	 i=Integer.parseInt(n);
	 if(i==2)
	 {
		 %>
		 <jsp:forward page="error.jsp"/>
		 <%
	 }
	 else{
		 i++;
	 }
 }
 %>
 <h2 style="position: absolute; left:700px; top:86px; color: red;">Attempt: <%=i%></h2>
 <form action="adminlog" method="post">
 
 <hr size="4">
  	<br> <br> <br>
 <h1 style="color: white; text-align: center;">Sign in</h1>
 	<input type="hidden" name="attempt" value="<%=i%>">
	<h2>Username:  <input type="text" name="uname"> <br> <br></h2> 
	
	<h2>Password:  <input type="password" name="upass"> <br> <br></h2> 
	
	<input type="submit"> &nbsp; &nbsp; &nbsp; 
	<input type="reset">
	<br> <br>
	<br>
	<a href="newregister.jsp">create a new Admin Account</a>

 </form>
</div>
</body>
</html>