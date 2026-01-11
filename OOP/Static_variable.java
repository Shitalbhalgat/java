// In Java, static is a keyword used to make class-level members instead of object-level members.
// Static members belong to the class, not to individual objects.
// 
// 1. STATIC VARIABLE (Class Variable)
//     A static variable is a variable declared using the static keyword inside a class but outside methods, constructors, or blocks.
//     It is shared among all objects of the class.
// 
// Memory Allocation of Static Variable
//             1)Static variables are stored in the Method Area / Class Area
//             2)Memory is allocated only once, when the class is loaded
//             3) Same copy is shared by all objects
// 
// Important Rules of Static Variable:
//           //1)Declared using static keyword
            // 2)Only one copy exists
            // 3)Accessed using class name
            // 4)Cannot be declared inside a method
            // 5)Default value is provided by JVM

public class Static_variable {
     
    // Static Variable
    static int count;

    void f1() 
    {
        count++;
        System.out.println(count);
    }


    public static void main(String[] args) {
        Static_variable s1 = new Static_variable();
        Static_variable s2 = new Static_variable();
        Static_variable s3 = new Static_variable();
        s1.f1(); // Output: 1
        s2.f1(); // Output: 2
        s3.f1(); // Output: 3
 
        System.out.println("Final count: " + count);
    }
}
