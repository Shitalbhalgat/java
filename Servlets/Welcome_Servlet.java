package com.first;

import jakarta.servlet.http.*;
import java.io.*;

public class Welcome_Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws IOException {

        PrintWriter out = response.getWriter();
        out.println("Welcome from web.xml");
    }
}