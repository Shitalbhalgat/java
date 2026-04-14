// LOOKAHEAD (?= ) and (?! ) : Lookahead checks a condition without consuming characters.
// 
// Types:
// Positive Lookahead (?=...)
// Negative Lookahead (?!...)
 
// Positive Lookahead Example:  String s = "abc123";
                            //  System.out.println(s.matches(".*(?=\d).*"));   //String must contain at least one digit.

// Negative Lookahead Example: String s = "abc";
//                         System.out.println(s.matches("^(?!.*\d).*$")); String must NOT contain digits.

class Lookahead {
    public static void main(String[] args) {
        String pass = "Abc@1234";
        System.out.println(pass.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$]).{8,}"));
    }
}

