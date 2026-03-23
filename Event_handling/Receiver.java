import java.net.*;

public class Receiver {
    public static void main(String[] args) throws Exception {

        // Step 1: Create socket on port 1234
        DatagramSocket ds = new DatagramSocket(1234);

        // Step 2: Create buffer
        byte[] b = new byte[1024];

        // Step 3: Create packet
        DatagramPacket dp = new DatagramPacket(b, b.length);

        // Step 4: Receive data (waiting)
        ds.receive(dp);

        // Step 5: Convert to string
        String msg = new String(dp.getData(), 0, dp.getLength());

        // Step 6: Print message
        System.out.println("Received: " + msg);

        // Step 7: Close socket
        ds.close();
    }
}