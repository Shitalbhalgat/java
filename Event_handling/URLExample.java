// The URL (Uniform Resource Locator) class (from java.net) represents a web address.
// Example URL: https://www.google.com/index.html
// 
// https://www.google.com:443/index.html?name=abc#top
// │      │               │   │             │        │
// │      │               │   │             │        └──Reference (Section in page)
// │      │               │   │             └──────── Query(Data sent to server)
// │      │               │   └───────────── Path
// │      │               └───────────────── Port
// │      └──────────────────────────────── Host
// └─────────────────────────────────────── Protocol

import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.google.com/index.html");

            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("Host: " + u.getHost());
            System.out.println("Port: " + u.getPort()); //Returns -1 if the port is not specified in the URL
            System.out.println("Default Port: " + u.getDefaultPort());  //Returns the default port for the protocol
            System.out.println("File: " + u.getFile());
            System.out.println("Path: " + u.getPath());
            System.out.println("Query: " + u.getQuery());
            System.out.println("Reference: " + u.getRef());

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
