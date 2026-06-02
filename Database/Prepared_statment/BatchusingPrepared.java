import java.sql.*;
public class BatchusingPrepared {

    public static void main(String[] args) {

        try {

            Connection con =
            DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            String q ="INSERT INTO student VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);

            // First Record
            ps.setInt(1,1);
            ps.setString(2,"Rahul");
            ps.setInt(3,20);

            ps.addBatch();

            // Second Record
            ps.setInt(1,2);
            ps.setString(2,"Amit");
            ps.setInt(3,22);

            ps.addBatch();

            // Execute Batch
            ps.executeBatch();

            System.out.println("Batch Insert Successful");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}