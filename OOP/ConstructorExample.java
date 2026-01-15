// Constructor:1)A constructor is a special method in Java that is used to initialize an object.
//             2)It is automatically called when an object is created using new keyword.
// 
// Key Characteristics of Constructor:
//         1) Constructor name is same as class name
//         2) Constructor does not have return type (not even void)
//         3) Called automatically
//         4) Used to initialize instance variables
//         5) Executes only once per object
// Syntax of Constructor
// class ClassName {
//     ClassName() {
//         // initialization code
//     }
// }
// 
// Java mainly has 3 types of constructors:
// 
// 1️) Default Constructor :A default constructor is automatically provided by the Java compiler if no constructor is written.
                        // Note: If you write any constructor, compiler does NOT create default constructor.

// 2️) No-Argument or userdefined default Constructor: A no-argument constructor is explicitly defined by 
                                                    //   the programmer and does not take any parameters.

// 3️) Parameterized Constructor: A parameterized constructor is defined by the programmer 
                                // and takes parameters to initialize an object with specific values.
public class ConstructorExample {
    int id;
    String name;

    // Default constructor
    ConstructorExample() {
        id = 0;
        name = "ABC";
       System.out.println("Default constructor");

    }

    // Parameterized constructor
    ConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor");
    }
    // Copy constructor
    ConstructorExample(ConstructorExample obj) {
        this.id = obj.id;
        this.name = obj.name;
        System.out.println("Copy constructor");
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        // Using no-argument constructor
        ConstructorExample obj1 = new ConstructorExample();
        obj1.display();

        // Using parameterized constructor
        ConstructorExample obj2 = new ConstructorExample(1, "Aniket");
        obj2.display();

        //copy constructor
        ConstructorExample obj3 = new ConstructorExample(obj2);
        obj3.display();
}
}