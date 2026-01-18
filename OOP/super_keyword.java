// super :super is a reference keyword in Java that refers to the immediate parent class object.
//        It is mainly used in inheritance.
// 
//When we need super:
//                   1)Parent and child have same variable names
//                   2)Parent and child have same method names
//                   3)Parent has parameterized constructor

// super is used to avoid confusion and access parent class members

class Parent {
    int x = 10;
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    int x = 20;
    void display() {
        System.out.println("child display method");
    }

    void show() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);  //Access Parent Class Variable
        display();               // Calls Child class method
        super.display();        // Calls Parent class method
    }
}
public class super_keyword {
        public static void main(String[] args) {
        Child c = new Child();
        c.show();
}
}