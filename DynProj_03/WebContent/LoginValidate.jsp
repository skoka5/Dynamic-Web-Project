<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
if(request.getMethod().equalsIgnoreCase("post")){

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	   String username = request.getParameter("username");
	   String password = request.getParameter("password");
	   if(validate(username, password)){
		   response.sendRedirect("Success.jsp");
	   }
	   else{
		   response.sendRedirect("Login.jsp");
	   }
	%>
	
	<%!
	
	public boolean validate(String un, String pw){
		if(un.equals("sai") && pw.equals("Karthik")){
			return true;
		}
		else{
			return false;
		}
	}
	
	%>

</body>
</html>
<%}
else{
	response.sendRedirect("Login.jsp");
}%>