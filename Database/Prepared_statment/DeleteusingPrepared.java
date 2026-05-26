import java.sql.*;

public class DeleteusingPrepared {

    public static void main(String[] args) {

        try {

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            // SQL DELETE Query
            String q ="DELETE FROM student WHERE id=?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, 1);
            int rows = ps.executeUpdate();

            System.out.println( rows + " Record Deleted Successfully!" );
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}