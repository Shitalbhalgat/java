package com.first;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/life")
public class LifeCycleServlet implements Servlet {

    public void init(ServletConfig config) {
        System.out.println("init() called");
    }

    public void service(ServletRequest req,ServletResponse res)
            throws ServletException, IOException {

        System.out.println("service() called");

        PrintWriter out = res.getWriter();
        out.println("Hello Servlet Life Cycle");
    }

    public void destroy() {
        System.out.println("destroy() called");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return "Life Cycle Servlet";
    }
}