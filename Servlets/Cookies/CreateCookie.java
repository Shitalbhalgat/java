package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");

     PrintWriter out = response.getWriter();

     String name = request.getParameter("username");

     // Create Cookie
     Cookie cookie = new Cookie("user", name);

     // Cookie will live for 1 hour
     cookie.setMaxAge(60 * 60);

     // Send cookie to browser
     response.addCookie(cookie);

     out.println("<h2>Cookie Created Successfully</h2>");

     out.println("<br>");

     out.println("<a href='ReadCookie'>Read Cookie</a>");
    }
}
