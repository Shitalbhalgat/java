package com.first;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;

@WebServlet("/Second")
public class SecondServlet extends HttpServlet {

    protected void doGet(  HttpServletRequest request,HttpServletResponse response)
            throws IOException {

        ServletContext context =  getServletContext();

        String Email =(String)context.getAttribute("Email");

        response.getWriter().println("Email= "+Email );
        
     
    }
}