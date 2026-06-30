package com.first;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,   HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");

        HttpSession session = request.getSession(false);

        if(session != null)
        {
            // removeAttribute()
            session.removeAttribute("city");

            // invalidate()
            session.invalidate();
        }

        response.getWriter().println("<h2>Logout Successfully</h2>");
    }
}