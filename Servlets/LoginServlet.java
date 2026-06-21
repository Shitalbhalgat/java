package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
    protected void doPost( HttpServletRequest request, HttpServletResponse response)throws IOException {
         
		response.setContentType("text/html");
		
//		Returns a single parameter value submitted through a form.
        String name =request.getParameter("username");
        PrintWriter out =response.getWriter();

        out.println("Welcome " + name+"<br>");
        
//      Returns all request parameter names.
        Enumeration<String> e = request.getParameterNames();

        while(e.hasMoreElements())
        {
            String key =e.nextElement();

            String value = request.getParameter(key);

           out.println( key + " : " + value + "<br>");
        }
        
//        Returns the HTTP request method.
        String method = request.getMethod();

        out.println(  "HTTP request Method = " + method+"<br>");
        
//        
        out.println("URI : " + request.getRequestURI()+"<br>");

        out.println("URL : "+ request.getRequestURL()+"<br>");
        
//   Returns the client's IP address.

        String ip =request.getRemoteAddr();

        out.println( "Client IP : " + ip);
//        Returns the client's host name.
        String host =request.getRemoteHost();
        out.println( "Client Hostname" + host+"<br>");
        
        String browser = request.getHeader( "User-Agent");

        out.println(browser);
    }
	

}
