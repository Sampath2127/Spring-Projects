<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Form</title>
<style>
	.error {
	color:red;
	}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customerDetails">
	Enter Customer Name (*):<form:input path="customerName"/><form:errors path="customerName" cssClass="error"/><br>
	Enter Customer Email:<form:input path="customerEmail"/><form:errors path="customerEmail" cssClass="error"/><br>
	Enter Postal Code: <form:input path="zipcode"/><form:errors path="zipcode" cssClass="error"/><br>
	Enter phone Number: <form:input path="phoneNumber"/><form:errors path="phoneNumber" cssClass="error"/><br>
	<br>
	<br>
	<input type="submit" value="submit">
</form:form>
</body>
</html>