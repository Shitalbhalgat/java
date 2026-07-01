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
 * Servlet implementation class ReadCookie
 */
@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		Cookie cookies[] = request.getCookies();

		if (cookies != null) {
			out.println("<h2>Available Cookies</h2>");

			for (Cookie c : cookies) {
				out.println("<b>Name :</b> " + c.getName());

				out.println("<br>");

				out.println("<b>Value :</b> " + c.getValue());

				out.println("<hr>");
			}
		} else {
			out.println("<h2>No Cookies Found</h2>");
		}
	}
}
