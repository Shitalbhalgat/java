// The URLConnection class (from java.net) is used to establish a connection between a
//  Java program and a URL resource.
// In simple words:
//            It connects your program to a webpage or file on the internet
// How It Works (Flow):
//          URL  ───> URLConnection  ───>  InputStream  ───>  Data
import java.net.*;
import java.io.*;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");

            URLConnection con = url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            System.out.println("Content Type: " + con.getContentType());
            System.out.println("Content Length: " + con.getContentLength());

            InputStream is = con.getInputStream();
            int i;

            while((i = is.read()) != -1) {
                System.out.print((char)i);
            }

            is.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}