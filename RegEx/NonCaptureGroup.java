// NON-CAPTURING GROUP (?: )
// 
// Definition:
// Used when grouping is needed but you don’t want to store the matched part.
// 
// Syntax:
// (?:...)
// 
// Example:
// (?:ab)+ matches "ab", "abab"


import java.util.regex.*;

class NonCaptureGroup {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?:ab)+");
        Matcher m = p.matcher("ababab");
        System.out.println(m.matches() + " - Non-capturing group does not store the matched part " + m.group());

        // 
        Matcher m1 = Pattern.compile("(?:\\d{3})-(\\d{4})").matcher("123-4567");

        if (m1.find()) {
            System.out.println(m1.group(1)); // only one group exists
            System.out.println(m1.group(1)); // 4567
    }
    }
}


