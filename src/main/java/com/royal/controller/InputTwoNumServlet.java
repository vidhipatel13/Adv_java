package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputTwoNumServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer n1 = Integer.parseInt(request.getParameter("n1"));
		Integer n2 = Integer.parseInt(request.getParameter("n2"));
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if(n1>n2) {
			out.print(n1+ ">"+n2);
		}else {
			out.print(n2+ ">"+n1);
		}
	}
}
