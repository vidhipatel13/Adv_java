package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String no1 = request.getParameter("no1");
		String no2 = request.getParameter("no2");
		String operation = request.getParameter("Operation");
		
		if (no1 == null || no2 == null || operation == null) {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("Please Select all the fields...");
		}
		else {
			Integer x = Integer.parseInt(no1);
			Integer y = Integer.parseInt(no2);
			
			int ans =0;
			
			if(operation.equals("+")) {
				ans = x + y;
			} 
			else if (operation.equals("-")) {
				ans = x - y;
			} 
			else if (operation.equals("*")) {
				ans = x * y;
			} 
			else if (operation.equals("/")) {
				ans = x / y;
			}
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("ans = "+ ans);
		}
		
	}
		
}
