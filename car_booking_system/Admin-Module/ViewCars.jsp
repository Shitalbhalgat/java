<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*,com.car.DBConnection"%>

<%@ include file="header.jsp"%>

<%@ include file="sidebar.jsp"%>

<div class="content">

	<h2>View Cars</h2>

	<br>

	<table border="1" width="100%" cellspacing="0" cellpadding="10">

		<tr style="background: #0d6efd; color: white;">

			<th>ID</th>

			<th>Image</th>

			<th>Car Name</th>

			<th>Company</th>

			<th>Fuel</th>

			<th>Transmission</th>

			<th>Seats</th>

			<th>Price / Day</th>

			<th>Car Number</th>

			<th>Status</th>

			<th>Edit</th>

			<th>Delete</th>

		</tr>

		<%
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			  con = DBConnection.getConnection();

			ps = con.prepareStatement("SELECT * FROM car");

			rs = ps.executeQuery();

			while (rs.next()) {
		%>

		<tr align="center">

			<td><%=rs.getInt("car_id")%></td>

			<td><img src="../images/<%=rs.getString("image")%>" width="120"
				height="80"></td>

			<td><%=rs.getString("car_name")%></td>

			<td><%=rs.getString("company")%></td>

			<td><%=rs.getString("fuel_type")%></td>

			<td><%=rs.getString("transmission")%></td>

			<td><%=rs.getInt("seats")%></td>

			<td>₹ <%=rs.getDouble("price_per_day")%>

			</td>

			<td><%=rs.getString("car_number")%></td>

			<td><%=rs.getString("status")%></td>

			<td><a href="editCar.jsp?id=<%=rs.getInt("car_id")%>">

					<button class="edit-btn">Edit</button>

			</a></td>

			<td><a href="DeleteCarServlet?id=<%=rs.getInt("car_id")%>"
				onclick="return confirm('Are you sure you want to delete this car?');">

					<button class="delete-btn">Delete</button>

			</a></td>

		</tr>

		<%
		}

		} catch (Exception e) {

		out.println("<tr><td colspan='12'>" + e.getMessage() + "</td></tr>");

		} finally {

		if (rs != null)
		rs.close();

		if (ps != null)
		ps.close();

		if (con != null)
		con.close();

		}
		%>

	</table>

</div>

<%@ include file="footer.jsp"%>