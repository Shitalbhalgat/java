package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register_servlet
 */
@WebServlet("/Register_servlet")
public class Register_servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			// Read Form Data
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String gender = request.getParameter("gender");
			String city = request.getParameter("city");

			String[] courses = request.getParameterValues("course");

			String address = request.getParameter("address");

			// Convert Checkbox values into one String
			String course = "";

			if (courses != null) {

				course = String.join(",", courses);
			}
			   Class.forName("com.mysql.cj.jdbc.Driver");

	            // Create Connection
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/studentdb",
	                    "root",
	                    "");
			// SQL Query
			String sql = "insert into registration(name,email,password,gender,city,course,address) values(?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);
			ps.setString(6, course);
			ps.setString(7, address);

			int i = ps.executeUpdate();

			if (i > 0) {

				response.getWriter().println("<h2>Registration Successful</h2>");

			} else {

				response.getWriter().println("<h2>Registration Failed</h2>");
			}

			ps.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();

			response.getWriter().println(e);
		}

	}

}
