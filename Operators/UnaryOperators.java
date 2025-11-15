// UnaryOperators: Unary operators works with  a single variable/operand.
            

public class UnaryOperators {
    public static void main(String[] args) {
        int x = 10;

        // Unary plus and minus
        System.out.println("Unary Plus: " + (+x));   // 10
        System.out.println("Unary Minus: " + (-x));  // -10

        // Pre-increment
        int a = 5;
        System.out.println("Pre-increment (++a): " + ++a); // 6

        // Post-increment
        int b = 5;
        System.out.println("Post-increment (b++): " + b++); // 5
        System.out.println("Value of b after post-increment: " + b); // 6

        // Pre-decrement
        int c = 5;
        System.out.println("Pre-decrement (--c): " + --c); // 4

        // Post-decrement
        int d = 5;
        System.out.println("Post-decrement (d--): " + d--); // 5
        System.out.println("Value of d after post-decrement: " + d); // 4

        // Logical NOT
        boolean flag = true;
        System.out.println("Logical NOT (!flag): " + !flag); // false
    }
}
