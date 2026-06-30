package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.Date;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

response.setContentType("text/html");

PrintWriter out = response.getWriter();

HttpSession session = request.getSession(false);

if(session != null)
{
String user = (String)session.getAttribute("user");

out.println("<h2>Welcome " + user + "</h2>");

out.println("<br><br>");
// getId()
out.println("<b>Session ID :</b> " + session.getId());

out.println("<br><br>");

// isNew()
out.println("<b>Is New Session :</b> " + session.isNew());

out.println("<br><br>");

// getCreationTime()
out.println("<b>Creation Time :</b> "  + new Date(session.getCreationTime()));

out.println("<br><br>");

// getLastAccessedTime()
out.println("<b>Last Access Time :</b> " + new Date(session.getLastAccessedTime()));

out.println("<br><br>");

// getMaxInactiveInterval()
out.println("<b>Timeout :</b> "+ session.getMaxInactiveInterval() + " Seconds");

out.println("<hr>");

out.println("<a href='ProfileServlet'>Profile</a>");

}
else
{
out.println("<h2>No Session Found</h2>");
}}

}
