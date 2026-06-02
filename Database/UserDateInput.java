// 1)use java.sql.Date to handle date input from user and insert into database
// 2)java.sql.Date is a subclass of java.util.Date and is used to represent SQL DATE values.
// 3)It only contains date information (year, month, day) and does not include time information
// 4)To convert a String input from the user to java.sql.Date, we can use the Date.valueOf() method which takes 
//   a String in the format "YYYY-MM-DD" and returns a java.sql.Date object.
// 5)This allows us to easily insert date values into the database using PreparedStatement.
// 
import java.sql.*;
import java.util.Scanner;

public class UserDateInput {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            ""
            );

            String q ="INSERT INTO student VALUES(?,?,?)";

            PreparedStatement ps =con.prepareStatement(q);

            // User Input
            System.out.print("Enter ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name : ");
            String name =sc.nextLine();

            System.out.print( "Enter DOB (YYYY-MM-DD) : ");
            String dob =sc.nextLine();

            // Set Values
            ps.setInt(1,id);

            ps.setString(2,name);

            // Convert String to Date
            ps.setDate(3,Date.valueOf(dob));
            ps.executeUpdate();

            System.out.println("Record Inserted");
            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}