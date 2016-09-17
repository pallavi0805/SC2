<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="user-reg-form"  action="UserRegController" method="post">		
		<h1>Admin Registration </h1>		
		EmailId/UserId:<input name="email" type="text"  value="pal@gmail.com" />
		<br><br>
		Password:<input name="password" type="password" value="123456" />
		<br><br>
		ContactNo:<input name="contact" type="text" value="123456" />	
		<br><br>	
		Name:<input name="name" type="text" value="pallavi" />	
		<br><br>			
		<input type="submit" value="Register" />			
	</form>
</body>
</html>