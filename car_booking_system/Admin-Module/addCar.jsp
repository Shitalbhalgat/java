<%@ include file="header.jsp"%>
<%@ include file="sidebar.jsp"%>

<div class="content">

	<h2>Add New Car</h2>

	<form action="AddCarServlet" method="post" enctype="multipart/form-data">

		<table>

			<tr>

				<td>Car Name</td>

				<td><input type="text" name="carName" required></td>

			</tr>

			<tr>

				<td>Company</td>

				<td><input type="text" name="company" required></td>

			</tr>

			<tr>

				<td>Fuel Type</td>

				<td><select name="fuelType">

						<option>Petrol</option>

						<option>Diesel</option>

						<option>CNG</option>

						<option>Electric</option>

				</select></td>

			</tr>

			<tr>

				<td>Transmission</td>

				<td><select name="transmission">

						<option>Manual</option>

						<option>Automatic</option>

				</select></td>

			</tr>

			<tr>

				<td>Seats</td>

				<td><input type="number" name="seats" required></td>

			</tr>

			<tr>

				<td>Price / Day</td>

				<td><input type="number" name="price" required></td>

			</tr>

			<tr>

				<td>Car Number</td>

				<td><input type="text" name="carNumber" required></td>

			</tr>

			<tr>

				<td>Status</td>

				<td><select name="status">

						<option>Available</option>

						<option>Booked</option>

						<option>Maintenance</option>

				</select></td>

			</tr>

			<tr>

				<td>Car Image</td>

				<td><input type="file" name="image" required></td>

			</tr>

			<tr>

				<td></td>

				<td><input type="submit" value="Add Car" class="btn"></td>

			</tr>

		</table>

	</form>

</div>

<%@ include file="footer.jsp"%>