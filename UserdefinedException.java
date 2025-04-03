import java.util.Scanner;

class AgeDoesNotFitException extends Exception 
{
    // String msg;
    AgeDoesNotFitException(String msg) 
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
                
	            throw new AgeDoesNotFitException("Entered age doesn't fulfill the required age limit");
	        }
	    }
	    catch(AgeDoesNotFitException ex)
         {
	        //calls override toString() method
	        System.out.println(ex);

	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}

