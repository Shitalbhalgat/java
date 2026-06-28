package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeServlet1
 */
@WebServlet("/IncludeServlet1")
public class IncludeServlet1 extends HttpServlet {
	 @Override
	    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {

	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();

	        out.println("<h2>Header</h2>");

	        RequestDispatcher rd = request.getRequestDispatcher("includeServlet2");

	        rd.include(request, response);

	        out.println("<h2>Footer</h2>");
	    }

}
