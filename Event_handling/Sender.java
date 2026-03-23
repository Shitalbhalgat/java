// A Datagram is a small packet of data sent over a network using UDP (User Datagram Protocol).

// Step-by-step flow:
            // 1)Sender creates data (message)
            // 2)Converts it into byte array
            // 3)Packs into DatagramPacket
            // 4)Sends using DatagramSocket
            // 5)Receiver gets packet using socket
            // 6)Extracts data from packet
// 
// Main Classes in Java:  1. DatagramSocket : Used to send and receive data
//                        2.DatagramPacket : Used to store data + address info
//                                  Two Types:
                                // (1) For Sending:
                                // DatagramPacket(byte[] data, int length, InetAddress ip, int port)
                                // 
                                // 2)For Receiving:
                                // DatagramPacket(byte[] buffer, int size)

// Sender Side:
//           String → byte[] → DatagramPacket → DatagramSocket → Network
//Receiver Side:
//           Network → DatagramSocket → DatagramPacket → byte[] → String
import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {

        // Step 1: Create socket
        DatagramSocket ds = new DatagramSocket();

        // Step 2: Create message
        String msg = "Hello Receiver";

        // Step 3: Convert to bytes
        byte[] b = msg.getBytes();

        // Step 4: Get IP address
        InetAddress ip = InetAddress.getByName("localhost");

        // Step 5: Create packet
        DatagramPacket dp = new DatagramPacket(b, b.length, ip, 1234);

        // Step 6: Send packet
        ds.send(dp);

        // Step 7: Close socket
        ds.close();
    }
}