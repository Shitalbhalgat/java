/* 
SYNTAX OF SWITCH CASE

switch (expression) {
    case value1:
        // code block
        break;

    case value2:
        // code block
        break;

    default:
        // default code block
}

RULES FOR SWITCH-CASE (Important): 
--------------------------------------------
1) expression must be: 
      - byte, short, int, long
      - char
      - String
      - enum
2) All case values must be:
      - same data type as expression
      - CONSTANTS (final values)
      - UNIQUE (no duplicates)
3) 'break' stops fall-through.
4) 'default' is optional but recommended.
5) Case values **cannot be variables**.


SYNTAX OF SWITCH EXPRESSION (Java 14+)
---------------------------------------------
String result = switch (expression) {
    case value1 -> "Output 1";
    case value2 -> "Output 2";
    default -> "Default Output";
};

RULES FOR SWITCH EXPRESSION (Important): 
-----------------------------------------------
1) Use **arrow (->)** instead of colon.
2) NO NEED for 'break'.
3) Multiple labels are allowed:
       case 1, 2, 3 -> "Group";
4) Must always return a value.
5) Default is mandatory if cases don't cover all values.
6) Case values must be constant and same type.
*/

import java.util.Scanner;

class SwitchCaseExamples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Day of Week 
        System.out.print("Enter a number (1-7) for day of week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number!");
        }


       
        // 2. Calculator 
        System.out.print("\nEnter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: +  -  *  / ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;

            default:
                System.out.println("Invalid operator!");
        }

        // 3. Grade Checking - NEW Switch Expression
       
        System.out.print("\nEnter grade (A/B/C/D/F): ");
        char grade = sc.next().charAt(0);

        String message = switch (grade) {
            case 'A' -> "Excellent!";
            case 'B' -> "Good job!";
            case 'C' -> "Fair performance.";
            case 'D' -> "Needs improvement.";
            case 'F' -> "Fail.";
            default -> "Invalid grade!";
        };

        System.out.println("Result: " + message);


       
        // 4. Even or Odd 
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        String type = switch (num % 2) {
            case 0 -> "Even number";
            case 1 -> "Odd number";
            default -> "Unknown";
        };

        System.out.println(num + " is an " + type);


        sc.close();
    }
}

/*
PRACTICE PROGRAMS USING SWITCH IN JAVA

1) Create a menu-driven program using switch-case:
       1. Area of Rectangle
       2. Area of triangle
       3. Area of Square
       4. Area of circle

2) Write a Java program using switch-case to display
   number of days in a month.

3) Write a Java program using switch expression to 
   check vowel or consonant.

4) Convert a number (1–5) into words using switch expression.

*/
