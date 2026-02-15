// // throw Keyword:1)Throw is used to manually create and throw an exception object inside a method or block.
//                  2)It sends the exception to the nearest catch block that can handle it. 
//                    If no such catch block is found, the program will terminate and display an error message.
//               Syntax:
//                   throw new ExceptionType("message");

                // How it works (Flow):
                //              throw → exception object created → control jumps → catch block
                
                // Rules of throw:
                                // 1)Used inside method/block only
                                // 2)Followed by exception object
                                // 3)Only one exception at a time
                                // 4)After throw, next statements are not executed
// 
// throws Keyword:1)Throws is used in method declaration to inform the compiler that 
//                   the method might throw exceptions.
//                2) It passes responsibility to the caller method.
                // Syntax:
                //           returnType methodName() throws ExceptionType


                // How it works (Flow):
                //               Method → throws → caller handles exception

//               // Rules of throws:
                // 1)Used in method declaration only
                // 2)Followed by exception type(s)
                // 3)Multiple exceptions can be declared, separated by commas
                // 4)Caller method must handle or declare the exception

class ThrowandThrowsExample {

    // throws declaration
    static void checkAge(int age) throws Exception {

        // throw statement
        if(age < 18) {
            throw new Exception("Age must be 18+");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


// Example of user defined exception using throw and throws keywords
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class Test {

    static void checkAge(int age) throws InvalidAgeException {

        if(age < 18)
            throw new InvalidAgeException("Age must be 18+");

        System.out.println("Valid age");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
