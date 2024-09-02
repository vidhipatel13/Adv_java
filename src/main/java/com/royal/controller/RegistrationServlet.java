package com.royal.controller;

import java.awt.Insets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
			System.out.println("welcome to registration ");
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			out.print("<h2>REGISTRATION COMPLETED!! </h2>");
		}
}
