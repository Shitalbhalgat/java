package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcceptHomeServlet
 */
@WebServlet("/AcceptHomeServlet")
public class AcceptHomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");

	        PrintWriter out = response.getWriter();

	        boolean accepted = false;

	        Cookie cookies[] = request.getCookies();

	        if(cookies != null){

	            for(Cookie c : cookies){

	                if(c.getName().equals("cookieConsent")){

	                    accepted = true;
	                }
	            }
	        }

	        out.println("<h1>Welcome to My Website</h1>");

	        if(!accepted){

	            out.println("<div style='position:fixed;"
	                    + "bottom:20px;"
	                    + "left:20px;"
	                    + "right:20px;"
	                    + "background:black;"
	                    + "color:white;"
	                    + "padding:20px;'>");

	            out.println("This website uses cookies.");

	            out.println("<form action='AcceptCookieServlet' method='post'>");

	            out.println("<input type='submit' value='Accept'>");

	            out.println("</form>");

	            out.println("</div>");
	        }
	    }
		

	
}
