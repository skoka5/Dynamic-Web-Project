<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
	if (request.getMethod().equalsIgnoreCase("get")) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h2>Login Successfully</h2>
	<h3>Enter student details below</h3>
	<form method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name">
				<td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>
	</form>

</body>
</html>
<%
	} else {
		if (request.getMethod().equalsIgnoreCase("post")) {
			

%>
<jsp:useBean id="student" class="com.dxc.beans.Student" scope="request" />
<jsp:setProperty property="id" name="student" param="id" />
<jsp:setProperty property="name" name="student" param="name" />
<jsp:setProperty property="email" name="student" param="email" />
<jsp:setProperty property="mobile" name="student" param="mobile" />

<jsp:forward page="RegisterStudent.jsp"></jsp:forward>
<%
	}
	}
%>