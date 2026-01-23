// Abstract : abstract is a non-access modifier used to hide implementation and show only functionality.
//            It is used when we know what a class/method should do, but not how.

// An abstract method:
            //  1)Has no body
            //  2)Ends with semicolon (;)
            //  3)Must be implemented by child class.
// Syntax:
           // abstract return_type method_name(parameters);
    
// Abstract class:
          // 1) A class that is declared with abstract keyword is known as abstract class.
          // 2) It can have abstract methods (methods without body) as well as concrete methods (methods with body).
          // 3) It cannot be instantiated (i.e., we cannot create objects of abstract class).
          // 4) It is used to achieve abstraction and to provide a base for subclasses to build upon.
          // 5) A class must be declared abstract if it contains one or more abstract methods.
          // 6) A non-abstract class derived from an abstract class must implement all abstract 
          //    methods of the base class.
          // 7) An abstract class can have constructors and static methods.
          // 8) An abstract class can have final methods which will force the subclass 
          //    not to change the body of the method.

abstract class Parent
{
    int x;
    Parent()
    {
        System.out.println("Parent Class Constructor");
    }
    void f1()
    {
        System.out.println("Value of x : "+x);
    }
   
    abstract void display();

}
class child extends Parent{
    child()
    {
        System.out.println("child Class Constructor"); 
    }
    void display()
    {
      System.out.println("Abstract method implemented in child class");
    }
    void f1()
    { 
        super.f1();
        System.out.println("Value of x : "+(x+10));
    }
}


public class Abstract_keyword {
    public static void main(String[] args) {
        child c =new child();
        c.f1();
       
    }
    
}
