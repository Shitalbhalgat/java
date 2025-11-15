// BinaryOperatorsFull: It works on two operands and performs various operations like arithmetic, relational, logical, and bitwise operations.


public class BinaryOperators{
    public static void main(String[] args) {

        int a = 12;
        int b = 5;

         // Arithmetic OPERATORS
        System.out.println("a + b = " + (a + b));  // 17
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 60
        System.out.println("a / b = " + (a / b));  // 2
        System.out.println("a % b = " + (a % b));  // 2

        
        // RELATIONAL OPERATORS
      
        System.out.println("RELATIONAL OPERATORS:");
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b  : " + (a > b));  // true
        System.out.println("a < b  : " + (a < b));  // false
        System.out.println("a >= b : " + (a >= b)); // true
        System.out.println("a <= b : " + (a <= b)); // false

        System.out.println();

        // LOGICAL OPERATORS
         boolean x = true;
        boolean y = false;
        System.out.println("LOGICAL OPERATORS:");
        System.out.println("x && y : " + (x && y)); // false (AND)
        System.out.println("x || y : " + (x || y)); // true  (OR)
        System.out.println("x ^ y  : " + (x ^ y));  // true  (XOR)
        System.out.println("!x     : " + (!x));     // false (NOT)

        System.out.println();

       
        // BITWISE OPERATORS
        // Binary representation: a = 12 (1100), b = 5 (0101)
        System.out.println("BITWISE OPERATORS:");
        System.out.println("a & b  : " + (a & b));   // 1100 & 0101 = 0100 -> 4
        System.out.println("a | b  : " + (a | b));   // 1100 | 0101 = 1101 -> 13
        System.out.println("a ^ b  : " + (a ^ b));   // 1100 ^ 0101 = 1001 -> 9
        System.out.println("~a     : " + (~a));      // ~1100 = 0011...1011 -> -13 (2's complement)
        System.out.println("a << 1 : " + (a << 1));  // 1100 << 1 = 11000 -> 24
        System.out.println("a >> 1 : " + (a >> 1));  // 1100 >> 1 = 0110 -> 6
        System.out.println("a >>>1 : " + (a >>>1));  // 1100 >>>1 = 0110 -> 6

        // ASSIGNMENT OPERATORS
        
        // Simple assignment
        int m = 10;
        System.out.println("ASSIGNMENT OPERATORS:");
        System.out.println("Initial m = " + m);

        m += 5; // m = m + 5
        System.out.println("m += 5  : " + m);

        m -= 3; // m = m - 3
        System.out.println("m -= 3  : " + m);

        m *= 2; // m = m * 2
        System.out.println("m *= 2  : " + m);

        m /= 4; // m = m / 4
        System.out.println("m /= 4  : " + m);

        m %= 3; // m = m % 3
        System.out.println("m %= 3  : " + m);

    }
}
