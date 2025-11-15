/*
A variable is a memory location that stores data temporarily during program execution.
A variable has:Name → what you call the box
               Data type → what kind of data it can store
               Value → the actual data inside the box

Rules for naming variables in Java:
1. A variable must begin with a letter (A-Z or a-z), underscore (_), or dollar sign ($).
2. After the first character, digits (0-9) can also be used.
3. Variable names cannot contain spaces. (Use camelCase instead)
4. Variable names are case-sensitive (age, Age, and AGE are different variables).
5. Reserved keywords in Java cannot be used as variable names (e.g., int, class, public).
6. Variable names should be meaningful and descriptive (e.g., studentAge, totalMarks).
7. Only the underscore (_) and dollar sign ($) are allowed as special characters.
8. A variable must be initialized (assigned a value) before it is used.

*/


public class VariableRulesExample {

    public static void main(String[] args) {

        // 1. Variable starts with letters, _, $
        int age = 20;
        int _rollNumber = 45;
        int $salary = 30000;

        // 2. After first character → digits allowed
        int student1Marks = 88;
        int total_2025 = 100;

        // 3. No spaces (using camelCase instead)
        int totalMarks = 95;

        // 4. Case-sensitive variables
        int value = 10;
        int Value = 20;  // different from 'value'

        // 5. Not using keywords (valid names only)
        int class1 = 5;
        int returnValue = 50;

        // 6. Meaningful variable names
        int studentAge = 18;
        int mobileNumber = 987654321;

        // 7. Only _ and $ allowed as special chars
        int _count = 10;
        int $bonus = 500;

        // 8. Initializing before use
        int number;
        number = 25;  // initialization before printing

        // Printing the values
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + _rollNumber);
        System.out.println("Salary: " + $salary);
        System.out.println("Student Marks: " + student1Marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("value: " + value);
        System.out.println("Value (case-sensitive): " + Value);
        System.out.println("Class1: " + class1);
        System.out.println("Return Value: " + returnValue);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Count: " + _count);
        System.out.println("Bonus: " + $bonus);
        System.out.println("Number: " + number);
    }
}
