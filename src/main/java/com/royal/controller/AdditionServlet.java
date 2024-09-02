package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int Number1 = Integer.parseInt(request.getParameter("Number1"));
		int Number2 = Integer.parseInt(request.getParameter("Number2"));
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<br> Number1 : "+ Number1);
		out.print("<br> Number2 : "+Number2);
		out.print("<br> Addition is  : "+(Number1+Number2));
	}
}
