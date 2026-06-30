package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");

PrintWriter out = response.getWriter();

 HttpSession session = request.getSession(false);
out.println("<h2>Profile Page</h2>");
String user = (String) session.getAttribute("user");

out.println("Welcome " + user);

out.println("<hr>");

out.println("<a href='LogoutServlet'>Logout</a>");
}

}
