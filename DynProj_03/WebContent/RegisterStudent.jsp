<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body>
<jsp:useBean id="student" class="com.dxc.beans.Student" scope="request"/>
	Student registred in the earlier page : <%= student %>

</body>
</html>