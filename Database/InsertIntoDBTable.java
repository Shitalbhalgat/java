// Insert a Record into Database Table
// Syntax : 1)Insert into all table columns: insert into table_name values(value1, value2, ...);
        //  2)Insert into specific columns: insert into table_name(column1, column2, ...) values(value1, value2, ...);

// Steps to insert a record into a database table using JDBC:  
              
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
            int n=stmt.executeUpdate(q);

            System.out.println(n+" Record Inserted Successfully!");

            // Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
