<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!-- to get more tags -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<table border="1">
		<tr>
			<td>Employee ID</td>
			<td>Employee Name</td>
			<td>Designation</td>
			<td>Department</td>
			<td>Basic</td>
		</tr>
		<c:forEach items="${employees }" var="emp">
			<tr>
				<td>${emp.empId }</td>
				<td>${emp.empName }</td>
				<td>${emp.empDesig }</td>
				<td>${emp.empDeptt }</td>
				<td>${emp.empSalary }</td>
			</tr>

		</c:forEach>
	</table>
	<br><br>
	<a href="./">Go Back</a>
</body>
</html>