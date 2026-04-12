// Regular Expressions (Regex) in Java are used to define search patterns for strings. 
// They are widely used for validation, searching, splitting, and replacing text.

// Special Symbols:
// | Symbol | Meaning           | Example          |
// | ------ | ----------------- | -----------------|
// | .      | Any one character | a.c → abc, axc   |
// | ^      | Start of string   | ^a → apple       |
// | $      | End of string     | a$ → data        |
// | *      | 0 or more times   | ab* → a, ab, abb |
// | +      | 1 or more times   | ab+ → ab, abb    |
// | ?      | 0 or 1 time       | ab? → a, ab      |

// | Quantifier | Meaning         |
// | ---------- | --------------- |
// | *          | 0 or more       |
// | +          | 1 or more       |
// | ?          | 0 or 1          |
// | {n}        | exactly n       |
// | {n,}       | n or more       |
// | {n,m}      | between n and m |


// Character Classes:
// | Pattern| Meaning           |
// | -------| ----------------- |
// | [abc]  | a or b or c       |
// | [a-z]  | small letters     |
// | [A-Z]  | capital letters   |
// | [0-9]  | digits            |
// | [^a-z] | NOT small letters |

// Predefined Classes
// | Symbol| Meaning       |
// | ------| --------------|
// | \d   | digit (0–9)    |
// | \D   | non-digit      |
// | \w   | word character |
// | \W   | non-word       |
// | \s   | space          |
// | \S   | non-space      |



import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String pattern = "java";
        String text = "java is easy";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("Pattern found at : "+m.start()+" group : "+ m.group(0)+" End :"+m.end());
        } else {
            System.out.println("Not found");
        }
    }
}