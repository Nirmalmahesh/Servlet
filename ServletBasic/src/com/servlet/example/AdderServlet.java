package com.servlet.example;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*

Author : Nirmalmahesh S,

Hint : Refer web.xml file for Confiquration and Mapping 

*/

//AdderServlet extends HttpServlet so it become a Servlet
public class AdderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Getting parameter Passed By the html file or jsp file
				int i = Integer.parseInt(req.getParameter("num1"));
				int j = Integer.parseInt(req.getParameter("num2"));
				
				int k = i + j;
				
				
				
				//Creating Object for printWriter		
				PrintWriter out= resp.getWriter();
				
				out.println("It is get Request");
				
				//Printing the Output
				out.println("Result is: "+k);
				
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//Getting parameter Passed By the html file or jsp file
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
		
		//Creating Object for printWriter		
		PrintWriter out= res.getWriter();
		
		out.println("It is Post Request");
		
		//Printing the Output
		out.println("Result is: "+k);
		
		
	}
	
	
	

	
	
}
