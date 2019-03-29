package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class MyServlet extends HttpServlet {


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig cf = getServletConfig();
		String name = cf.getInitParameter("Name");	
		Enumeration allNames = getInitParameterNames();
		PrintWriter out = res.getWriter();
		while(allNames.hasMoreElements())
		{
			String nextElement = (String) allNames.nextElement();
			String nextValue = (String) getInitParameter(nextElement);
			out.println("Parameter Name :"+nextElement+" Parameter Value :"+nextValue);
		}
		
		
		
		out.println("Welcome :"+name);
	}
	
	
	
	
}
