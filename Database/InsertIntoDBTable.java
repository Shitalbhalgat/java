// 

import java.sql.*;
public class InsertIntoDBTable {
    public static void main(String[] args) {

        try {

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL Query
            String q = "INSERT INTO student VALUES(1,'Rahul',20,'Mumbai')";

            // Execute Query
            stmt.executeUpdate(q);

            System.out.println("Record Inserted Successfully!");

            // Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}