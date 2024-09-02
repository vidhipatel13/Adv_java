package com.royal.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/EmployeeRegistrationServlet")
public class EmployeeRegistrationFilter2 implements Filter{
	
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRegistrationFilter2::init()");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRegistrationFilter2::doFilter()");
		String FirstName = request.getParameter("FirstName");
		String alphaRegEx ="[a-zA-Z]+";
		
		boolean isError =false;
		if(FirstName.matches(alphaRegEx)==false) {
			isError = true;
			request.setAttribute("FirstNameError", "please enter valid FirstName");
		}
		if(isError ==true) {
			request.getRequestDispatcher("EmployeeRegistration.jsp").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRegistrationFilter2::destroy()");
	}
}
