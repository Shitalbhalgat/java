package com.first;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Seesion_example
 */
@WebServlet("/Seesion_example")
public class Seesion_example extends HttpServlet {

    protected void doPost(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {

response.setContentType("text/html");

String name = request.getParameter("username");

// Create Session
HttpSession session = request.getSession();

// Store data in Session
session.setAttribute("user", name);

response.sendRedirect("WelcomeServlet");
}
}

