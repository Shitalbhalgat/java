package com.first;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcceptCookieExample
 */
@WebServlet("/AcceptCookieExample")
public class AcceptCookieExample extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie = new Cookie("cookieConsent", "accepted");

		// Save for 30 days
		cookie.setMaxAge(60 * 60 * 24 * 30);

		response.addCookie(cookie);

		response.sendRedirect("AcceptHomeServlet");
	}
}