package com.first;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
	    urlPatterns = "/demo",
	    initParams = {
	        @WebInitParam(
	            name = "email",
	            value = "admin@gmail.com"
	        )
	    }
	)
public class ServletConfigExample extends HttpServlet {

    private String email;

    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);

        email = config.getInitParameter("email");

        System.out.println("Email: " + email);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h2>Email : " + email + "</h2>");
    }
}