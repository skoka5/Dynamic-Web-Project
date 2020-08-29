<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page_01</title>
</head>
<body>
<h2>Welcome</h2>
<%!

public String sayHello(String name){
	return "Hello"+name;
	
}
int a;
%>
Result of method call: <%=sayHello("Karthik") %><br>
</body>
</html>