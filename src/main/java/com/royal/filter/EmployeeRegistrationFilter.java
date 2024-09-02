package com.royal.filter;


import java.io.IOException;
import java.security.Provider.Service;
import java.security.spec.ECPublicKeySpec;

import javax.naming.InitialContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.swing.text.DocumentFilter;


@WebFilter("/EmployeeRegistrationServlet")
public class EmployeeRegistrationFilter implements Filter {
	
		public void init(FilterConfig arg0) throws ServletException {
			// TODO Auto-generated method stub
				System.out.println("EmployeeRegistrationFilter::init()");
		}
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
			System.out.println("EmployeeRegistrationFilter::doFilter()");
			
			boolean isError =false;
			String FirstName = request.getParameter("FirstName");
			String Email = request.getParameter("Email");
			String Password = request.getParameter("Password");
			String BirthYear = request.getParameter("BirthYear");
			
			if (FirstName == null || FirstName.trim().length()==0) {
				isError = true;
				request.setAttribute("FirstNameError","please enter FirstName");
			}
			if (BirthYear == null || BirthYear.trim().length()==0) {
				isError = true;
				request.setAttribute("BirthYearError","please enter BirthYear");
			}
			if (Email == null || Email.trim().length()==0) {
				isError = true;
				request.setAttribute("EmailError","please enter Email");
			}
			if (Password == null || Password.trim().length()==0) {
				isError = true;
				request.setAttribute("PasswordError","please enter Password");
			}
			if(isError==true) {
				//back
				request.getRequestDispatcher("EmployeeRegistration.jsp").forward(request, response);
			}
			else {
				//forward
				chain.doFilter(request, response);
			}
		}
		public void destroy() {
		// TODO Auto-generated method stub
			System.out.println("EmployeeRegistrationFilter::destroy()");
		}
		
		
}
