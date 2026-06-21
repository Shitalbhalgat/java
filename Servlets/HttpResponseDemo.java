package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class HttpResponseDemo extends HttpServlet {
	

	    protected void doGet( HttpServletRequest request,HttpServletResponse response)throws IOException {

	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();

	        out.println("<h2>Student Details</h2>");

	        out.println("Name : Rahul<br>");
	        out.println("Course : Java<br>");
	        out.println("City : Pune");
	        
	        response.setIntHeader( "Refresh", 5 );

	        response.getWriter().println("Page Refreshes Every 5 Seconds" );
	       
	    }
	}

