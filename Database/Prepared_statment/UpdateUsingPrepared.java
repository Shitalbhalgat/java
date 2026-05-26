// 

import java.sql.*;
public class UpdateUsingPrepared {

    public static void main(String[] args) {

        try {

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            // SQL UPDATE Query
            String q ="UPDATE student SET age=? WHERE id=?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(q);

            // Set Values
            ps.setInt(1, 25); // new age
            ps.setInt(2, 1);  // student id

            // Execute Query
            int rows = ps.executeUpdate();

            System.out.println( rows + " Record Updated Successfully!" );
 // Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}