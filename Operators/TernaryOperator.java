//TernaryOperator :The ternary operator is the only operator in Java that takes three operands.
// It is a short form of if-else used for conditional assignments.
//variable = (condition) ? value_if_true : value_if_false;



public class TernaryOperator {
    public static void main(String[] args) {
        int a = 20, b = 15;

        // Largest number using ternary
        int largest = (a > b) ? a : b;
        System.out.println("Largest number: " + largest); // 20

        // Even or Odd
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result); // 7 is Odd

        // Nested ternary for grade
        int marks = 72;
        String grade = (marks >= 90) ? "A"
                     : (marks >= 75) ? "B"
                     : (marks >= 50) ? "C"
                     : "Fail";
        System.out.println("Grade: " + grade); // C
    }
}
