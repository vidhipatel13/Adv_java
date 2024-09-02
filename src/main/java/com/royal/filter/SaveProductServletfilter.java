package com.royal.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/SaveProductServlet")
public class SaveProductServletfilter implements Filter {

		public void init(FilterConfig arg0) throws ServletException {
			// TODO Auto-generated method stub
			
		}
		
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			boolean isError = false;
			String productName = request.getParameter("productName");
	        String priceStr = request.getParameter("price");
	        String category = request.getParameter("category");
	        String qtyStr = request.getParameter("qty");
	       System.out.println(priceStr + " "+  qtyStr);
	       
	        if (productName == null || productName.trim().length() == 0) {
	           isError = true;
	        	request.setAttribute("productnameerror", "pleae enter the product name");
	        }
	        if (priceStr == null ||priceStr.trim().length() == 0) {
	        	isError = true;
	        	request.setAttribute("priceError","please enter the price");
	        }
	        if (category == null || category.trim().length() == 0) {
	        	isError = true;
	        	request.setAttribute("categoryError", "please enter the category");
	        }
	        if (qtyStr == null || qtyStr.trim().length() == 0) {
	        	isError = true;
	        	request.setAttribute("qtyError","please enter the qty");
	        }

	       
        if (isError == true) {
			// back
			request.getRequestDispatcher("InputProduct.jsp").forward(request, response);
		} else {
			// forward
			chain.doFilter(request, response);
		}


		
		}
		public void destroy() {
		// TODO Auto-generated method stub
		
		}
}

