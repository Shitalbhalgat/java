// Regex Flags: Flags modify how a regex behaves
// Can be used: Inside pattern → (?i)
//              Or with Pattern.compile()

// Most Important Flags
// 1. (?i) → Case Insensitive : Ignores uppercase/lowercase
// Example:  "HELLO".matches("(?i)hello")  // true
// Alternative: Pattern.compile("hello", Pattern.CASE_INSENSITIVE);

// 2.(?m) → Multiline Mode
// Changes behavior of ^ and $ : ^ → start of each line
//                               $ → end of each line
// Example:
            // String s = "java\npython";
            // Pattern p = Pattern.compile("(?m)^python");
            // Matcher m = p.matcher(s);
            // System.out.println(m.find()); // true

// 3. (?s) → Dotall Mode 
// Changes behavior of . : matches newline characters as well
// Example:
            // String s = "hello\nworld";
            // System.out.println(s.matches("hello.world"));   // false
            // System.out.println(s.matches("(?s)hello.world"));// true   
import java.util.regex.*;
public class Flags {

     public static void main(String[] args) {
        // Case Insensitive Example
        String s1 = "HELLO";
        System.out.println(s1.matches("(?i)hello"));  // true

        // Multiline Mode Example
        String s2 = "java\npython";
        Pattern p = Pattern.compile("(?m)^python");
        Matcher m = p.matcher(s2);
        System.out.println(m.find()); // true

        // Dotall Mode Example
        String s3 = "hello\nworld";
        System.out.println(s3.matches("hello.world"));   // false
        System.out.println(s3.matches("(?s)hello.world"));// true
     }

}