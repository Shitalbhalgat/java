import java.io.*;
import java.util.*;

class Stringmethods
{
    public static void main (String[] args)
    {
        String str= "Java Programming";
        String str1= new String ("Java Programming");

        // Returns the number of characters in the String.
        System.out.println("String length = " + str.length());

        //Returns boolean value depanding upon string is empty or not
        System.out.println("isEmpty() = " +str1.isEmpty());

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = " + str.charAt(3));

        // Return the substring from the ith  index character to end of string
        System.out.println("Substring = " + str.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring = " + str.substring(2,5));

        // Concatenates string2 to the end of string1.
        String s1 = "Java";
        String s2 = "Programming";
        System.out.println("Concatenated string = " +s1.concat(s2));

        // Returns the index within the string of the first occurrence of the specified string.
        String s4 = "C++ Java Python Java ";
        System.out.println("indexof(Stirng) = " + s4.indexOf("Java"));
        System.out.println("lastIndexof(Stirng) = " + s4.lastIndexOf("Java"));
   // Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        System.out.println("Index of a = " +s4.indexOf('a',3));

        // Checking equality of Strings
        System.out.println("Checking Equality = " + "Java".equals("Java"));
        System.out.println("Checking Equality = " + "Java".equals("java"));
        System.out.println("Checking Equality = " + "Java".equalsIgnoreCase("Java"));

        //If ASCII difference is zero then the two strings are similar
        System.out.println("compareTo()= "+s1.compareTo("Java"));
        System.out.println("compareTo()= "+s1.compareToIgnoreCase("java"));

   // Converting cases
      System.out.println("Changing to lower Case = " +  "ABCDE".toLowerCase());

        // Converting cases
   
        System.out.println("Changing to UPPER Case = " + "abcedf".toUpperCase());

        System.out.println("Checking a Startswith() = " + "abcedf".startsWith("a"));


        // Trimming the word
        String s3 = " String Trimmimg ";
        System.out.println("Trim the word " + s3.trim());
        System.out.println("Trim the Spaces " + "    ".trim()+"...");

        // Replacing characters
        String str2 = "JAVAPROGRAM";
        System.out.println("Original String =" + str1);
        String str3 = str2.replace('A' ,'@') ;
        System.out.println("Replaced A with @ =" + str3);

        System.out.println("join() = "+String.join(",", str3,str2));

    }
}
