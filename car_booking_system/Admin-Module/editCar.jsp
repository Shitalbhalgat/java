<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*,com.car.DBConnection"%>


<%@ include file="header.jsp"%>

<%@ include file="sidebar.jsp"%>

<div class="content">

	<h2>Edit Car</h2>

	<%
	int id = Integer.parseInt(request.getParameter("id"));

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	try {

		con = DBConnection.getConnection();

		ps = con.prepareStatement("SELECT * FROM car WHERE car_id=?");

		ps.setInt(1, id);

		rs = ps.executeQuery();

		if (rs.next()) {
	%>

	<form action="UpdateCarServlet" method="post" enctype="multipart/form-data">

		<input type="hidden" name="carId" value="<%=rs.getInt("car_id")%>">

		<table>

			<tr>

				<td>Car Name</td>

				<td><input type="text" name="carName" value="<%=rs.getString("car_name")%>" required></td>

			</tr>

			<tr>

				<td>Company</td>

				<td><input type="text" name="company" value="<%=rs.getString("company")%>" required></td>

			</tr>

			<tr>

				<td>Fuel Type</td>

				<td><select name="fuelType">

						<option value="Petrol" <%=rs.getString("fuel_type").equals("Petrol") ? "selected" : ""%>> Petrol</option>

						<option value="Diesel" <%=rs.getString("fuel_type").equals("Diesel") ? "selected" : ""%>> Diesel</option>

						<option value="CNG" <%=rs.getString("fuel_type").equals("CNG") ? "selected" : ""%>> CNG</option>

						<option value="Electric" <%=rs.getString("fuel_type").equals("Electric") ? "selected" : ""%>> Electric</option>

				</select></td>

			</tr>

			<tr>

				<td>Transmission</td>

				<td><select name="transmission">

						<option value="Manual" <%=rs.getString("transmission").equals("Manual") ? "selected" : ""%>> Manual</option>

						<option value="Automatic" 	<%=rs.getString("transmission").equals("Automatic") ? "selected" : ""%>> Automatic</option>

				</select></td>

			</tr>

			<tr>

				<td>Seats</td>

				<td><input type="number" name="seats" value="<%=rs.getInt("seats")%>" required></td>

			</tr>

			<tr>

				<td>Price Per Day</td>

				<td><input type="number" name="price" value="<%=rs.getDouble("price_per_day")%>" required></td>

			</tr>

			<tr>

				<td>Car Number</td>

				<td><input type="text" name="carNumber" value="<%=rs.getString("car_number")%>" required></td>

			</tr>

			<tr>

				<td>Status</td>

				<td><select name="status">

						<option value="Available"
							<%=rs.getString("status").equals("Available") ? "selected" : ""%>>
							Available</option>

						<option value="Booked"
							<%=rs.getString("status").equals("Booked") ? "selected" : ""%>>
							Booked</option>

						<option value="Maintenance"
							<%=rs.getString("status").equals("Maintenance") ? "selected" : ""%>>
							Maintenance</option>

				</select></td>

			</tr>

			<tr>

				<td>Current Image</td>

				<td><img src="../images/<%=rs.getString("image")%>" width="150"
					height="100"></td>

			</tr>

			<tr>

				<td>New Image</td>

				<td><input type="file" name="image"></td>

			</tr>

			<tr>

				<td></td>

				<td><input type="submit" value="Update Car" class="btn">

				</td>

			</tr>

		</table>

	</form>

	<%
	}

	} catch (Exception e) {

	out.println(e);

	} finally {

	if (rs != null)
	rs.close();
	if (ps != null)
	ps.close();
	if (con != null)
	con.close();

	}
	%>

</div>

<%@ include file="footer.jsp"%>