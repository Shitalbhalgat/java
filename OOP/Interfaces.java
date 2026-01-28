// Interface :An interface in Java is a collection of abstract methods and constants 
//              which is implemented by a class using the implements keyword.
// An interface is a blueprint of a class that contains:1)abstract methods
//                                                      2)static & default methods
//                                                      3)public static final variables
// It is used to achieve 100% abstraction and multiple inheritance in Java.
// Syntax of Interface: interface InterfaceName {
                                // variables (public static final)
                                // abstract methods (public abstract)
                            // }
// Syntax to Implement Interface:
//                             class ClassName implements InterfaceName {
//                                      // method implementations
//                                   }
// Rules of Interface:
// 1️) Interface methods are public & abstract by default
// 2️) Interface variables are public static final
// 3️) Interface cannot have constructors
// 4️) Interface cannot create objects
// 5️) Class must implement all methods of interface
// 6️) Multiple interfaces can be implemented
// 7️)Interface can extend another interface
// 8)After java 8+ interface can have static & default methods

// Interface Extending Interface
interface A {
    void m1();
}

interface B extends A {
    void m2();
}

class C implements B {
    public void m1() {
        System.out.println("m1 method");
    }

    public void m2() {
        System.out.println("m2 method");
    }
}

// Multiple Inheritance Using Interface
interface X {
    void show();
}

interface Y {
    void display();
}

class Z implements X, Y {
    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}

class Interfaces {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();
        obj.display();
         C c =new C();
         c.m1();
         c.m2();

    }
}
    

