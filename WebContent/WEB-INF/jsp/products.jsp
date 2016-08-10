<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

<h3>Cart Product<br>Please Deselect that you want to remove from cart </h3><br>
<form:form action="removecart" commandName="ProductBean">
<form:checkboxes items="${list}" path="products" delimiter="<br/>"/>
	
<td><input type="submit" value="Remove from cart" /></td>
</form:form>
</body>
</html>