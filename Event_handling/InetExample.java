// The InetAddress class (from java.net package) is used to represent an IP address.
// It helps to:  Get IP address of a host
//               Get host name
//               Work with DNS (Domain Name System)
// It provides methods to get host name, IP address, 
// and check connectivity using methods like getByName(), getHostAddress(), and isReachable().
// Note:Each Method of InetAddress class may throw an UnknownHostException if the host is not found or cannot be resolved.
import java.net.*;

public class InetExample {
    public static void main(String[] args) {
        try {
            // Returns IP address of a host
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip);

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
           
            System.out.println("Reachable: " + ip.isReachable(5000));

            // Returns your system IP
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println("IP Address of your system: " + ip1);

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
