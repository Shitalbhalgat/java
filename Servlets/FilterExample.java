package com.first;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FilterExample
 */
@WebServlet("/FliterExample")
public class FilterExample extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		String user = request.getParameter("username");
		String pass = request.getParameter("password");

		if (user.equals("admin") && pass.equals("1234")) {
			HttpSession session = request.getSession();

			session.setAttribute("user", user);

			response.sendRedirect("DashboardServlet");
		} else {
			response.getWriter().println("Invalid Username or Password");
		}
	}

}
