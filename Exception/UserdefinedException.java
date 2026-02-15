// User defined exception : 1) A User Defined Exception is an exception created by the programmer to handle 
//                          application-specific errors that are not covered by built-in exceptions.
//                          2)It is created by extending the Exception or RuntimeException class.
// Steps to Create User Defined Exception
// 1) Define a new class that extends the Exception class(checked exceptions) or RuntimeException (for unchecked exceptions).
    //   syntax: class MyException extends Exception
	//                 { 
	//                 ... }
// 2) Implement a constructor that accepts a message and passes it to the superclass constructor.
// 3) Optionally, override the toString() method to provide a custom string representation of the exception.
// 4) Throw the exception in your code when a specific error condition occurs using the throw keyword.
// 5) Catch the exception using a try-catch block to handle it.


import java.util.Scanner;

class AgenotmatchException extends Exception 
{
    // String msg;
    AgenotmatchException(String msg) 
    { 
        super(msg);
        //this.msg=msg;
    }
    
    
    // @Override
    // public String toString() 
    // {
    //     return msg;
    // }
}

public class UserdefinedException {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age : ");
	    int age = sc.nextInt();
	    try {
	        if(age<18) 
            { 
                
	            throw new AgenotmatchException("Entered age doesn't fulfill the required age limit");
	        }
	    }
	    catch(AgenotmatchException ex)
         {
	        //calls override toString() method
	        System.out.println(ex);

	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}

