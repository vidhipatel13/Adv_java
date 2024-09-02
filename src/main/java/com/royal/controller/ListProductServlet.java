package com.royal.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("listproductservlet");
		try {
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/advjava";
			String dbUserName = "root";
			String dbPassword = "root";
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			PreparedStatement pstmt = con.prepareStatement("select * from products");

			ResultSet rs = pstmt.executeQuery();
			request.setAttribute("rs", rs);
			request.getRequestDispatcher("ListProduct.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
