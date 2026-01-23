// Constructors are NOT inherited
//  Parent class constructor is executed first
//  Then child class constructor is executed
//  Child constructor implicitly calls parent constructor using super()
class Parent {

    Parent() {
        System.out.println("Parent Default constructor");
    }
    Parent(int x) {
        System.out.println("Parent parameterized constructor: " + x);
    }
}
class Child extends Parent {

    Child() {
        System.out.println("Child Default constructor");
    }
   Child(int y) {
    // Calling parent parameterized constructor
        super(y);
        System.out.println("Child constructor: " + y);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        child c1=new Child(10);
    }
}
