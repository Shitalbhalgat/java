package com.first;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.*;
import java.io.*;
/**
 * Servlet implementation class GenericDemo
 */
@WebServlet("/GenericDemo")

public class GenericDemo extends GenericServlet {

    public void service(ServletRequest req,
                        ServletResponse res)
            throws ServletException, IOException {

        PrintWriter out = res.getWriter();
        out.println("Hello from GenericServlet");
    }
}