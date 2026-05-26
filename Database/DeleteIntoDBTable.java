// Delete a Record from Database Table
// Syntax : delete from table_name where condition;
// Note: If you omit the WHERE clause, all records will be deleted from the table.


import java.sql.*;
public class DeleteIntoDBTable {

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

            // DELETE Query
            String q ="DELETE FROM student WHERE id=1";

            // Execute Query
            int rows = stmt.executeUpdate(q);
            System.out.println(rows + " Record Deleted Successfully!");
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
