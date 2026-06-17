package com.first;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/lifehttp")
public class LifeHttpServlet extends HttpServlet {

    public void init() {
        System.out.println("init() called");
    }

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        System.out.println("doGet() called");

        PrintWriter out = res.getWriter();
        out.println("HttpServlet Life Cycle");
    }

    public void destroy() {
        System.out.println("destroy() called");
    }
}