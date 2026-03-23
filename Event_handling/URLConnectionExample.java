// 1)The URLConnection class (from java.net) is used to establish a connection between a
//  Java program and a URL resource.
// 2)In simple words:
//            It connects your program to a webpage or file on the internet
// 3)How It Works (Flow):
//          URL  ───> URLConnection  ───>  InputStream  ───>  Data
// 4)URLConnection class throws an IOException if an I/O error occurs 
//           while creating the connection or reading from it.

import java.net.*;
import java.io.*;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");

            // openConnection() method of URL class is used to create a connection to the specified URL.
            URLConnection con = url.openConnection(); 

            // con.setRequestProperty("User-Agent", "Mozilla/5.0");

            System.out.println("Content Type: " + con.getContentType());
            System.out.println("Content Length: " + con.getContentLength());

            InputStream is = con.getInputStream();
            int i;

            // read() method of InputStream class is used to read data from the input stream and return
            //  it as an integer.

            while((i = is.read()) != -1) {
                System.out.print((char)i);
            }

            is.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
