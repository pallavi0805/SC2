<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<form action="BuyProd" method="post">
<%
List<Product> p=(List<Product>)request.getAttribute("product");
int i=0;
for(Product prod:p)
{
	out.print("<tr><td>"+prod.getProductName()+"</td><td>"+prod.getCategory().getCategoryName()+"</td><td><input type=submit name=b"+i+" value=Buy Now/></td></tr>");
	i++;
}
%>
</form>
</table>
</body>
</html>