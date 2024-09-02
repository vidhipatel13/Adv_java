<%@page import="java.sql.ResultSet"%>
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
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>

	<h2>List Products</h2>

	<table border="1">
		<tr>  
			<th>Name</th>
			<th>category</th>
			<th>Price</th>

		</tr>
		<%
		while (rs.next()) {
			String ProductName = rs.getString("ProductName");
			String Category = rs.getString("Category");
			Integer Price = rs.getInt("Price");
			out.println("<tr>");
			out.print("<td>" + ProductName + "</td>");
			out.print("<td>" + Category + "</td>");
			out.print("<td>" + Price + "</td>");

			out.print("</tr>");
		}
		%>

	</table>
</body>
</html>