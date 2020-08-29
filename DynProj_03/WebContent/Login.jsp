
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
    <form action="LoginValidate.jsp" method="post">
	User Name : <input type="text" name="username"><br>
	Password : <input type="password" name="password"><br>
	<input type="submit" value="Login">
	<input type="reset" value="Cancel">
	</form>

</body>
</html>