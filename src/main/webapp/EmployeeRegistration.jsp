<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
			String FirstNameError = (String)request.getAttribute("FirstNameError");
			String BirthYearError = (String)request.getAttribute("BirthYearError");
			String EmailError = (String)request.getAttribute("EmailError");
			String PasswordError =(String)request.getAttribute("PasswordError");
	%>
	<form action="EmployeeRegistrationServlet" method="post">
	
	<h2>EMPLOYEE REGISTRATION</h2>
	
	FirstName: <input type="text" name="FirstName"/>
	<%=FirstNameError == null ? " ":FirstNameError %>
	<br><br>
	Email: <input type="text" name="Email"/>
	<%=EmailError == null ? " ":EmailError %>
	<br><br>
	Password: <input type="password" name="Password"/>
	<%=PasswordError == null ? " ":PasswordError %>
	<br><br>
	BirthYear:<input type="number" name="BirthYear"/>
	<%=BirthYearError == null ? " ":BirthYearError %><br><br>
	<input type="submit" value="Register "/>
	
	</form>
</body>
</html>