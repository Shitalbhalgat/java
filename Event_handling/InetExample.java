//  InetAddress class represents IP address of a host. It provides methods to get host name, IP address, and check connectivity using methods like getByName(), getHostAddress(), and isReachable().
import java.net.*;

public class InetExample {
    public static void main(String[] args) {
        try {
            // Returns IP address of a host
            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Canonical Name: " + ip.getCanonicalHostName());

            System.out.println("Reachable: " + ip.isReachable(5000));

            // Returns your system IP
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1);

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}