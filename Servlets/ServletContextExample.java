package com.first;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextExample
 */
@WebServlet("/ServletContextExample")
public class ServletContextExample extends HttpServlet {


	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    	
//	    	 Create a reference variable that can store a ServletContext object.
	        ServletContext context =  getServletContext();
	        
//	        Returns the value of a context parameter.
	        String college = context.getInitParameter("college");
	        response.getWriter().println(college);
	        
	        //Returns information about the web server.
	        System.out.println(context.getServerInfo());
	        
	        //Returns the actual physical path of the application.
	        System.out.println(context.getRealPath("/"));
	        
//	        Stores data that can be shared by all servlets.
	        context.setAttribute( "Email", "admin@abc.com" );
	        response.getWriter().println( "Data Stored Successfully" );
	    }
	}

