// Parent class
class A {

    int x = 10;

    void showA() {
        System.out.println("Class A method");
    }
}


// Child class
class B extends A {

    int y = 20;

    void showB() {
        System.out.println("Class B method");
    }
}


// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        B obj = new B();

        // accessing parent class data
        System.out.println("x = " + obj.x);

        // accessing child class data
        System.out.println("y = " + obj.y);

        // calling parent method
        obj.showA();

        // calling child method
        obj.showB();
    }
}
