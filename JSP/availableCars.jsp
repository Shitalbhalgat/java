<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Available Cars</title>
</head>
<body>

<h2>Available Cars</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Car Name</th>
    <th>Company</th>
    <th>Price</th>
</tr>

<%
try{

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con =
        DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/car_booking",
        "root",
        "root");

    PreparedStatement ps =
        con.prepareStatement(
        "SELECT * FROM car WHERE status='Available'");

    ResultSet rs = ps.executeQuery();

    while(rs.next()){
%>

<tr>

<td><%= rs.getInt("car_id") %></td>

<td><%= rs.getString("car_name") %></td>

<td><%= rs.getString("company") %></td>

<td>₹<%= rs.getDouble("price_per_day") %></td>

</tr>

<%
    }

    rs.close();
    ps.close();
    con.close();

}catch(Exception e){

    out.println(e);

}
%>

</table>

</body>
</html>
