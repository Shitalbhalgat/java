package com.car;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		try {

			  Connection   con = DBConnection.getConnection();

			String sql = "SELECT * FROM admin WHERE username=? AND password=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, username);

			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				HttpSession session = request.getSession();

				session.setAttribute("admin", rs.getString("username"));

				response.sendRedirect("adminDashboard.jsp");

			} else {

				response.sendRedirect("adminLogin.jsp?error=1");

			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
