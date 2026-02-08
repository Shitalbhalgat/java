// A package is a folder that contains related classes and interfaces.
// Example: java.util,java.io,java.lang

// User Defined package :a package that you create yourself to organize your own classes and interfaces.
// Steps to create user defined package:
    // 1) Create a folder with the name of package
    // 2) Place your java files inside that folder
    // 3) Use package keyword at the top of your java file to specify the package name
    // 4) To use classes from that package in other java files, you need to import the package using import keyword
    // 5) To compile and run java files in package, you need to use the package name as part of the class name
    //    For example, if you have a class named MyClass in a package named mypackage,
    //  you would compile it using the command: javac  -d . mypackage/MyClass.java
    //    and run it using the command: java mypackage.MyClass

// Access Modifiers in package:
    // 1) public : can be accessed from anywhere
    // 2) protected : can be accessed within the same package and by subclasses in other packages
    // 3) default (no modifier) : can be accessed only within the same package
    // 4) private : can be accessed only within the same class

// Accessing classes from package:
    // 1) To access a class from a package, you need to import the package using import keyword
        // Using import specific class: import mypackage.MyClass;
        // Using import all classes: import mypackage.*;
        // Using fully qualified name: mypackage.MyClass obj = new mypackage.MyClass();
        

package demo;
public class demo{
    demo()
    {
        System.out.println("demo " );
    }
}