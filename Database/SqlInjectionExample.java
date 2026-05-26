// sql injection: SQL injection is a code injection technique that exploits a security vulnerability 
                    // in an application's software by inserting malicious SQL code into an input field for execution. 
                    // This can allow attackers to manipulate the database, access sensitive data, or even delete data.
// 
import java.sql.*;
public class SqlInjectionExample {

    public static void main(String[] args) {

        String name ="Rahul'); DROP TABLE student; --";
         try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            Statement stmt = con.createStatement();
             String q ="INSERT INTO student(name) VALUES('"+ name + "')";
            System.out.println(q);

            stmt.executeUpdate(q);

            System.out.println("Inserted!");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    


// To prevent SQL injection, we can use PreparedStatement which allows us to set parameters safely without concatenating user input directly into the SQL query.

        String name1 ="Rahul'); DROP TABLE student; --";
         try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                ""
            );

            String q ="INSERT INTO student(name) VALUES(?)";

            PreparedStatement ps =con.prepareStatement(q);
            ps.setString(1, name1);
            ps.executeUpdate();
            System.out.println("Inserted Safely!");
            con.close();
         } catch(Exception e) {
            System.out.println(e);
        }
    }
}