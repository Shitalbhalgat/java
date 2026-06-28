package com.first;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestForwarding
 */
@WebServlet("/RequestForwarding")
public class RequestForwarding extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 protected void doGet( HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {

	        RequestDispatcher rd =request.getRequestDispatcher( "Second");
	        
//	        Passing Data using forward()
	        request.setAttribute( "name",  "Rahul");

	        rd.forward( request, response);
	    }
}
