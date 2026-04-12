// 1. GROUPING ( ) 
// Definition:Grouping is used to combine parts of a regex and treat them as a single unit. 
// It also allows capturing parts of the matched string.
// 
// Syntax:
// (...)
// 
// Example:
// (ab)+ matches "ab", "abab", "ababab"

import java.util.regex.*;

class Grouping {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("(ab)+").matcher("abab");
        System.out.println(m.matches());

        // 
    Matcher m1 = Pattern.compile("(\\d{3})-(\\d{4})").matcher("123-4567");

      if (m1.find()) {
    System.out.println(m1.group(1)); // 123
    System.out.println(m1.group(2)); // 4567
}
    }
}

