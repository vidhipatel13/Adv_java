package com.royal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet{

		@Override
		public void init() throws ServletException {
			System.out.println("Servlet::init()");
		}
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Servlet::service()");
		}
		@Override
		public void destroy() {
			System.out.println("Servlet::destroy()");
		}
}
