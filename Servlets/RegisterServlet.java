package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

	        response.setContentType( "text/html" );

	        PrintWriter out =response.getWriter();

	        String name = request.getParameter("name");

	        String email = request.getParameter("email");

	        String password =request.getParameter("password");

	        String gender = request.getParameter("gender");

	        String city = request.getParameter("city");

	        String address = request.getParameter("address");

	        String[] courses = request.getParameterValues( "course" );

	        out.println("<h2>Student Details</h2>");

	        out.println("Name : " + name + "<br>" );

	        out.println( "Email : " + email + "<br>");

	        out.println(  "Gender : "  + gender + "<br>" );

	        out.println(   "City : "    + city + "<br>" );

	        out.println(  "Address : "   + address  + "<br>"  );

	        out.println("Courses : "  );

	        if(courses != null)
	        {
	            for(String c : courses)
	            {
	                out.println(
	                        c + "<br>"
	                );
	            }
	        }
	    }
	}


