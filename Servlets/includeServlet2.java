package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class includeServlet2
 */
@WebServlet("/includeServlet2")
public class includeServlet2 extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {

        PrintWriter out = response.getWriter();

        out.println("<h3>Menu Included</h3>");
    }

}
