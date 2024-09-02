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
		String studentname = (String)request.getAttribute("studentnameerror");
		String playerTypeError = (String)request.getAttribute("playerTypeError");
		
		String studentnameValue =(String)request.getAttribute("studentnameValue");
		String playertypeValue = (String)request.getAttribute("playertypeValue");
		
	%>
	<h2>Box Cricket Registration</h2>
	
	<form action="BoxCricketRegistrationServlet" method="post">
		StudentName : <input type="text" name="studentname" value="<%=studentnameValue==null?"":studentnameValue %>"/>
		<%=studentname== null ? "" : studentname %>
		<br><br>
		PlayerType : <select name="playertype">
			<option value="">Please select the field </option>
			<option value="Batsman" <%=playertypeValue!=null && playertypeValue.contains("Batsman")?"selected":"" %> >Batsman</option>
			<option value="Bowler"  <%=playertypeValue!=null && playertypeValue.equals("Bowler")?"selected":"" %>>Bolwer</option>
			<option value="allrounder" <%=playertypeValue!=null && playertypeValue.equals("allrounder")?"selected":"" %>>Allrounder</option>
		</select>
		<%=playerTypeError == null ? "" : playerTypeError %>
		<br><br>
		<input type="submit" value="Register">
	</form>
		
</body>
</html>