/*
Basic Structure of a Java Program
A Java program has 5 main parts:
1. Package statement   (optional)
2. Import statements   (optional)
3. Class definition    (mandatory) : Every Java program must have at least one class.
                                        class HelloWorld {
                                        }
                                        1)Class name should start with capital letter
                                        2)File name = Class name
4. Main method  (mandatory for execution)  : This is where the program starts.
                                              public static void main(String[] args) {
                                                         //statements
                                                }

                                                Meaning of each keyword : public → accessible everywhere
                                                                          static → JVM can run it without creating an object
                                                                          void → does not return anything
                                                                           main → starting point of program
                                                                           String[] args → command-line arguments
5. Statements inside main(): Code that performs actions.
                            System.out.println("Hello World");
                            Prints output on screen
                            Ends with semicolon (;)
*/

// Class declaration
class BasicStructureDemo {    
    
    // Main method
       public static void main(String[] args) 
       {  
        System.out.println("This is my first Java program!");
    }
}
