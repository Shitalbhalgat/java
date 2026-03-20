import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Step 1: Create Server
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started...");

            // Step 2: Wait for client
            Socket s = ss.accept();
            System.out.println("Client connected");

            // Step 3: Receive data
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = dis.readUTF();

            System.out.println("Client says: " + msg);

            // Step 4: Close
            dis.close();
            s.close();
            ss.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}