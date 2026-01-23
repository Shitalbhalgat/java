// final : final is a non-access modifier in Java used to restrict the user.
//         It means cannot be changed.
// The final keyword can be applied to:
                        // 1) Variables
                        // 2️) Methods
                        // 3️) Classes
// final Variable: A final variable is a constant — once assigned, its value cannot be changed.
class Final_Keyword {
    final int x = 10;
    void show() {
        // x = 20; // Error
        System.out.println(x);
    }

    public static void main(String[] args) {
        Final_Keyword t = new Final_Keyword();
        t.show();
    }
}
// final Method:A final method cannot be overridden in the child class.
// Final methods can be inherited
// But cannot be overridden
class Parent {
    final void show() {
        System.out.println("This is a final method");
    }
}

class Child extends Parent {
    // void show() { } //Error
}

// final Class:A final class cannot be inherited.
// for ex:
// final class Parent {
//     void show() {
//         System.out.println("Parent class");
//     }
// }
