package com.royal.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/SearchCategoryServlet")
public class SearchCategoryServlet extends HttpServlet{

		@Override
		public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			
			String category = request.getParameter("category");

			try {
				String driverClassName = "com.mysql.cj.jdbc.Driver";
				String dbUrl = "jdbc:mysql://localhost:3306/24advjavagenmon6tue5";
				String dbUserName = "root";
				String dbPassword = "root";
				Class.forName(driverClassName);
				Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
				PreparedStatement pstmt = con.prepareStatement("select * from products where category = ?");
				pstmt.setString(1, category);

				ResultSet rs = pstmt.executeQuery();
				
				request.setAttribute("rs", rs);

				
				request.getRequestDispatcher("OutputSearch.jsp").forward(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
