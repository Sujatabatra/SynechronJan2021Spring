<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<table border="1">
	<tr>
		<td>Employee Id</td>
		<td>Employee Name</td>
		<td>Designation</td>
		<td>Department</td>
		<td>Salary</td>
	</tr>
	<tr>
		<td>${emp.empId }</td>
		<td>${emp.empName }</td>
		<td>${emp.empDesig }</td>
		<td>${emp.empDeptt }</td>
		<td>${emp.empSalary }</td>
	</tr>
</table>
<br><br>
<a href="./">Go to Main Page</a>
</body>
</html>