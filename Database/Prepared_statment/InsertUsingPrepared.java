// PreparedStatement is used to execute parameterized SQL queries.
// It provides better performance and security compared to Statement.
// Steps to insert a record into a database table using PreparedStatement:
        // 1) Create a Connection to the database using DriverManager.getConnection().
        // 2) Create a SQL query with placeholders (?) for parameters.
        // 3) Create a PreparedStatement object using the Connection and the SQL query.
        // 4) Set the values for the parameters using the appropriate setter methods (e.g., setInt, setString).
        // 5) Execute the query using executeUpdate() method of PreparedStatement.
        // 6) Handle any exceptions that may occur during the database operations and print appropriate messages.
        // 7) Close the database connection.

// Methods 
// 1)setInt(int parameterIndex, int value): Sets an integer parameter at the specified index.
// 2)setString(int parameterIndex, String value): Sets a string parameter at the specified index.
// 3)setDouble(int parameterIndex, double value): Sets a double parameter at the specified index.   
// 4)setDate(int parameterIndex, java.sql.Date value): Sets a date parameter at the specified index.
// 5)setBoolean(int parameterIndex, boolean value): Sets a boolean parameter at the specified index.
// 6)setObject(int parameterIndex, Object value): Sets an object parameter at the specified index, allowing for various data types to be set dynamically.

// 
import java.sql.*;
public class InsertUsingPrepared {

    public static void main(String[] args) {

        try {

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            // SQL Query with placeholders
            String q ="INSERT INTO student VALUES(?,?,?)";

            // Create PreparedStatement
            PreparedStatement ps =con.prepareStatement(q);

            // Set Values
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setInt(3, 20);

            // Execute Query
            int rows = ps.executeUpdate();

            System.out.println(rows + " Record Inserted Successfully!");
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}