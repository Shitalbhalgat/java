/* 
Syntax of while loop in Java:

while (condition) {
    // code to be executed repeatedly while condition is true
}
*/

import java.util.Scanner;
class WhileLoopExamples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Print A to Z using while loop
        char ch = 'A';
        System.out.println("Alphabets from A to Z:");
        
        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();


        // 2. Count number of digits in a given number
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + n + " is: " + count);


        // 3. Check for Armstrong number
        /*
            Armstrong number:
            A number equal to the sum of its own digits each raised 
            to the power of number of digits.
            Example: 153 → 1^3 + 5^3 + 3^3 = 153
        */
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        temp = n;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem; // for 3-digit Armstrong
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is NOT an Armstrong number.");


        // 4. Check for Palindrome number
        /*
            Palindrome number:
            A number that reads the same backward as forward.
            Example: 121, 1221, 12321
        */
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        temp = n;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (reverse == n)
            System.out.println(n + " is a Palindrome number.");
        else
            System.out.println(n + " is NOT a Palindrome number.");

        sc.close();
    }
}

/*
Practice Problems Using While Loop in Java:

1) Write a Java program to print the 2's multiplication table.
2) Write a Java program to print first 20 odd natural numbers and their sum.
3) Write a Java program to find sum of first 100 natural numbers.
*/
