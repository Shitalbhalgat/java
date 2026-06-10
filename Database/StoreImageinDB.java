// BLOB Types in MySQL : BLOB stands for Binary Large Object.
//                       It is a data type in MySQL that can store large amounts of binary data, such as images, audio files, and other multimedia content. 
// There are four types of BLOBs in MySQL, each with a different maximum size limit:
// Type	      MaxSize
// TINYBLOB	  255Bytes
// BLOB     	65 KB
// MEDIUMBLOB	 16 MB
// LONGBLOB  	4 GB

// methods to handle BLOB data in Java:
// Method	Purpose
// setBlob()	Store image/file
// getBlob()	Retrieve image/file
// getBytes()	Convert BLOB to byte array
// length()	 Get file size

import java.sql.*;
import java.io.*;

public class StoreImageinDB {

    public static void main(String[] args) {

        try {

            Connection con =
                DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "");
            
            Statement stmt = con.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS user(id INT PRIMARY KEY, name VARCHAR(50), image BLOB)");

            String sql ="INSERT INTO user (id,name,image) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);
            ps.setString(2, "Rahul");

            FileInputStream fis =  new FileInputStream( "C:\\Users\\shita\\OneDrive\\Pictures\\hotel.png");
            ps.setBlob(3, fis);

            int rows = ps.executeUpdate();

            System.out.println( rows + " record inserted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}