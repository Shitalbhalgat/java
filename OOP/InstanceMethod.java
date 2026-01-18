// An instance method is a method that: 1)is NOT declared with static keyword
//                                      2)belongs to an object (instance) of a class
//                                      3)is called using object reference
//                                      4)can access instance variables and static variables
// 
// Syntax of Instance Method:
                            //  returntype methodName(parameters) {
                            //         // block of code
                            //     }
          
// 
// Types Of Instance Methods:
// 
// 1) Accessor Methods(GETTER METHODS) : Methods that only read/access data and do not modify it.
// 2) Mutator  Methods(SETTER METHODS) :Methods that modify/change object data.
// 3) Logic  Methods :Methods that perform operations or logic using object data.

class InstanceMethod {
   // instance variables
    int a, b;

    // method with no arguments and no return type
    void show() {
        System.out.println("Values are: a = " + a + ", b = " + b);
    }

    // method with arguments and no return type
    void setValues(int x, int y) {
        a = x;
        b = y;
    }
   
    // mehtod with no arguments and return type
    int add() { 
        return a+b;
    }

    // method with arguments and return type
    int multiply(int x, int y) {
        return x * y;
    }
       public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
        obj.setValues(20, 10);
        System.out.println("Addition: " + obj.add());
        obj.show();
        System.out.println("Multiplication: " + obj.multiply(5, 4));

    }
}
