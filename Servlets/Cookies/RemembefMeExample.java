package com.first;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemembefMeExample
 */
@WebServlet("/RemembefMeExample")
public class RemembefMeExample extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		
		String pass=request.getParameter("password");

		String remember = request.getParameter("remember");

		Cookie cookie = new Cookie( user,pass);

		if (remember != null) {

			cookie.setMaxAge(60 * 60 * 24 * 7); // 7 Days

		} else {

			cookie.setMaxAge(-1); // Session Cookie
		}

		response.addCookie(cookie);

		response.getWriter().println("<b>Cookies are set</b> " );


	}
}
