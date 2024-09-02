package com.royal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BoxCricketRegistrationServlet")
public class BoxCricketRegistrationServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String studentname = Request.getParameter("studentname");
			String playertype = Request.getParameter("playertype");
			
			Request.setAttribute("studentnameValue",studentname);
			Request.setAttribute("playertypeValue",playertype);
			
			
			boolean isError = false;
			
			if(studentname == null || studentname.trim().length() == 0)
			{
				Request.setAttribute("studentnameerror", "Please Enter Student name");
				isError = true;
			}else {
				String alphaRegEX = "[a-zA-Z]{2,}";
				if (studentname.matches(alphaRegEX) == false) {
					isError =true;
					Request.setAttribute("studentnameerror","please enter valid student name");
				}
			}
			if(playertype == null || playertype.trim().length() == 0)
			{
				isError = true;
				Request.setAttribute("playerTypeError", "Please Select Player Type");
			}
			if(isError==true)
			{
				RequestDispatcher rd = Request.getRequestDispatcher("BoxCricketRegistration.jsp");
				rd.forward(Request,Response);
			}
			else
			{
				RequestDispatcher rd = Request.getRequestDispatcher("BoxCricketRegistrationSuccess.jsp");
				rd.forward(Request,Response);
				
			}

		}
}
