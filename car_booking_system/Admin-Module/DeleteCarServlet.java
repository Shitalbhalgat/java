package com.car;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


@WebServlet("/DeleteCarServlet")
public class DeleteCarServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request,
	            HttpServletResponse response)
	            throws ServletException, IOException {

	        int carId = Integer.parseInt(request.getParameter("id"));

	        try {

	            String sql = "DELETE FROM car WHERE car_id=?";
	          Connection   con = DBConnection.getConnection();

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setInt(1, carId);

	            int i = ps.executeUpdate();

	            if(i > 0){

	                response.sendRedirect("ViewCars.jsp");

	            }
	            else{

	                response.getWriter().println("Car Not Deleted.");

	            }

	            ps.close();
	            con.close();

	        }
	        catch(Exception e){

	            e.printStackTrace();

	        }

	    }
}
