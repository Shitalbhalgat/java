// this keyword: 1) this is a reference variable in Java.
//               2)It refers to the current object of the class.
//               3)Whenever an object calls a method or constructor,this stores the address of that 
//                 calling object.
// need of this keyword :
//                        1)To differentiate instance variables and local variables
//                        2)To refer current class instance variable
//                        3)To call current class constructor
//                        4)To call current class method
//                        5)To pass current object as parameter
//                        6) To return current object
// Syntax:
        // this.variableName;
        // this.methodName();
        // this();   // constructor call and it must be first statement

class This_Keyword {
    int id;

    This_Keyword() {
        // this to Call Current Class Constructor
        this(10); 
        System.out.println("Default Constructor");
     
    }
    // this to Differentiate Instance & Local Variables
    This_Keyword(int id) {
        this.id = id;
        System.out.println("Parameterized Constructor: " + id);
    }
    // this to Pass Current Object as Argument
    void show(This_Keyword e) {
        System.out.println("Method called");
    }
    void call() {
        show(this);
    }
    
public static void main(String[] args) {
        This_Keyword s = new This_Keyword();
        s.call();
    }
}
    

