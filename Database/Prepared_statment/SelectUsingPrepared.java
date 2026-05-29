import java.sql.*;
public class SelectUsingPrepared {
    public static void main(String[] args) {

        try {

            // Create Connection
            Connection con =
            DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            // SQL Query
            String q ="SELECT * FROM student WHERE id=?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(q);

            // Set Value
            ps.setInt(1, 1);

            // Execute Query
            ResultSet rs =ps.executeQuery();

            // Process Result
            while(rs.next()) {

                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getInt("age")
                );
            }
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}