<%@page isELIgnored="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h2>Login Page</h2>
<!--  
<form method="post" action="./login">
	Enter UserName : <input type="text" name="username"><br><br>
	Enter Password : <input type="password" name="password"><br><br>
	<input type="submit" value="login">
</form>
-->
<spring:form method="post" action="./login">
	Enter UserName : <spring:input path="userName"/><br><br>
	Enter Password : <spring:password path="password"/><br><br>
	<input type="submit" value="Login">
</spring:form>
</body>
</html>
