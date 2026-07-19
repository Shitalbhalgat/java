package com.car;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/AddCarServlet")
@MultipartConfig
public class AddCarServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String carName = request.getParameter("carName");
		String company = request.getParameter("company");
		String fuelType = request.getParameter("fuelType");
		String transmission = request.getParameter("transmission");
		int seats = Integer.parseInt(request.getParameter("seats"));
		double price = Double.parseDouble(request.getParameter("price"));
		String carNumber = request.getParameter("carNumber");
		String status = request.getParameter("status");

		// Image Upload
		Part part = request.getPart("image");

		String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();

		String uploadPath = getServletContext().getRealPath("") + File.separator + "images";

		File folder = new File(uploadPath);

		if (!folder.exists()) {
			folder.mkdir();
		}

		part.write(uploadPath + File.separator + fileName);

		try {

			  Connection   con = DBConnection.getConnection();

			String sql = "INSERT INTO car(car_name,company,fuel_type,transmission,seats,price_per_day,car_number,status,image) VALUES(?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, carName);
			ps.setString(2, company);
			ps.setString(3, fuelType);
			ps.setString(4, transmission);
			ps.setInt(5, seats);
			ps.setDouble(6, price);
			ps.setString(7, carNumber);
			ps.setString(8, status);
			ps.setString(9, fileName);

			int i = ps.executeUpdate();

			if (i > 0) {

				response.sendRedirect("ViewCars.jsp");

			} else {

				response.sendRedirect("addCar.jsp");

			}

			ps.close();
			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
