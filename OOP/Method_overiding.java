// Method overriding:1)Method overriding is a key feature of polymorphism in OOP.
//                   2)A child class provides its own implementation of 
//                        a method that is already defined in its parent class, with the same method signature.
//                   3)This allows the child class to modify or extend the behavior of the inherited method.
//                  4)Method overriding is used to achieve runtime polymorphism.
//                  5)It is also  called as dynamin binding or late binding.

// Rules for Method Overriding:
// 1)Inheritance is mandatory for method overriding.
// 2)The method in the child class must have the same name, return type, and parameters as the method in the parent class.
// 3)The method in the child class must have the same or higher access level than
//   the method in the parent class.
// 4)Static methods cannot be overridden because they are associated with the class rather than an
//   instance.
// 5)Constructors cannot be overridden because they are not inherited.
// 6)final method and private method cannot be overridden.

// Access Modifier Rules:

// | Parent    | Child                        | Allowed   |
// | --------- | ---------------------------- | -------   |
// | public    | public                       | yes       |
// | protected | protected / public           | yes       |
// | default   | default / protected / public | yes       |
// | public    | protected                    | no        |


class Parent {
    void display() {
        System.out.println("This is parent display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is child display method");
    }
}

public class Method_overiding {

    public static void main(String[] args) {
        Child p = new Child(); 
        p.display();
    }
}




