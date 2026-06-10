import java.sql.*;
import java.io.*;

public class RetrieveImagefromDB {

    public static void main(String[] args) {

        try {

            Connection con =
                DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "");

            PreparedStatement ps =  con.prepareStatement("SELECT image FROM user WHERE id=?");

            ps.setInt(1, 1);

            ResultSet rs =ps.executeQuery();

            if(rs.next()) {

                Blob blob =rs.getBlob("image");

                byte[] data =  blob.getBytes(  1,  (int)blob.length());

                FileOutputStream fos = new FileOutputStream("output.jpg");

                fos.write(data);

                fos.close();

                System.out.println("Image Retrieved");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}