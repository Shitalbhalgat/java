package com.first;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/HttpDemo")
public class HttpDemo extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws IOException {

        PrintWriter out = response.getWriter();

        out.println("Hello from HttpServlet");
    }
}