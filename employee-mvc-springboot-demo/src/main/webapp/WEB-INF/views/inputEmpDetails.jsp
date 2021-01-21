<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Employee Details</h1>
	<!--  
<form action="./insertEmp" method="post">
	Enter Employee ID : <input type="text" name="eId"><br><br>
	Enter Employee Name : <input type="text" name="eName"><br><br>
	Enter Employee Designation : <input type="text" name="desig"><br><br>
	Enter Employee Department : <input type="text" name="deptt"><br><br>
	Enter Employee Salary : <input type="text" name="salary"><br><br>
	<input type="submit" value="Save">
</form>
-->

	<spring:form action="./insertEmp" method="post">
Enter Employee ID : <spring:input path="empId"/>
		<br>
		<br>
	Enter Employee Name : <spring:input path="empName"/>
		<br>
		<br>
	Enter Employee Designation : <spring:input path="empDesig"/>
		<br>
		<br>
	Enter Employee Department : <spring:input path="empDeptt"/>
		<br>
		<br>
	Enter Employee Salary : <spring:input path="empSalary"/>
		<br>
		<br>
		<input type="submit" value="Save">

	</spring:form>
	<a href="./">Go Back</a>
</body>
</html>