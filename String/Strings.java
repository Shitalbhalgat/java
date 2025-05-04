import java.util.*;
class Strings
{
  public static void main(String[] args) {
        byte[] b = {97,98,99,100,101};
        char[] c = {'A', 'B', 'C', 'D', 'E'};
        int[] u = {99, 98, 97, 100, 101};
         
        // Method 1
        String s1 = new String(b);
        System.out.println("Method 1: " + s1);


        // Method 2
        String s2 = new String(b, 1, 3);
        System.out.println("Method 2: " + s2);
     

  
        // Method 3
        String s3 = new String(c);
        System.out.println("Method 3: " + s3);

        //method 4
       String s4 = new String(c, 1, 3);
        System.out.println("Method 4: " + s4);
       
        //method 5
        String s5 = new String(u,1,3);
        System.out.println("Method 5: " + s5);
       

    }
}


