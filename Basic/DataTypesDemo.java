// Java Primitive Data Types with Notes

public class DataTypesDemo {

    public static void main(String[] args) {

        // ----------- PRIMITIVE DATA TYPES -----------

        // 1. byte → Small integer range (-128 to 127), 1 byte memory
        byte age = 25;
        
        // 2. short → Medium integer, 2 bytes
        short students = 32000;

        // 3. int → Most commonly used integer type, 4 bytes
        int salary = 50000;

        // 4. long → Large integer values, 8 bytes (Ends with L)
        long phoneNumber = 9876543210L;

        // 5. float → Decimal numbers with 6–7 digits precision, 4 bytes (Ends with f)
        float cgpa = 8.65f;

        // 6. double → High precision decimal values (15 digits), 8 bytes
        double pi = 3.1415926535;

        // 7. char → Stores a single character, 2 bytes (Unicode)
        char grade = 'A';

        // 8. boolean → Stores only true or false (1 bit) It stores only two values:true ,false  (No range, no size like int, float, etc.
        boolean isPass = true;


        // Displaying the values of all primitive data types
        System.out.println("----- Primitive Data Types in Java -----");
        System.out.println("byte (age)       : " + age);
        System.out.println("short (students) : " + students);
        System.out.println("int (salary)     : " + salary);
        System.out.println("long (phone)     : " + phoneNumber);
        System.out.println("float (cgpa)     : " + cgpa);
        System.out.println("double (pi)      : " + pi);
        System.out.println("char (grade)     : " + grade);
        System.out.println("boolean (isPass) : " + isPass);
    }
}
