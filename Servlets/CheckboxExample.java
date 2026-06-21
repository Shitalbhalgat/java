package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/check")
public class CheckboxExample extends HttpServlet {
	protected void doPost(HttpServletRequest request,  HttpServletResponse response)  throws IOException {

        String[] subjects = request.getParameterValues( "subject");

        PrintWriter out =response.getWriter();

        out.println("Selected Subjects:");

        if(subjects != null)
        {
            for(String s : subjects)
            {
                out.println("<br>" + s);
            }
        }
        
       
        
        
        
    }

}
