package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConstentServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext ctx = getServletContext();
		String pi = ctx.getInitParameter("PI");
		PrintWriter out = res.getWriter();
		out.println("value of PI is :"+pi);
	}
	
}
