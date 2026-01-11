//  STATIC METHOD:
// A static method is a method declared using static keyword.
// It belongs to the class, not the object.
// It can be called without creating an instance of the class.

// Memory Allocation
        //  Stored in Method Area
        //  Loaded at class loading time
        //  No object creation required

// Rules of Static Method
// 
//  1. Can access only static variables and static methods
//  2. Cannot use this or super
//  3. Can be overloaded
//  4. Cannot be overridden (method hiding)
//  5. Called using class name

public class Static_Method {

    // Static Method
    static void display() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Calling static method without creating an object
        Static_Method.display();
    }
}   