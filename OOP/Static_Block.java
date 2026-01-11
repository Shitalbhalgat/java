// STATIC BLOCK : A static block is a block of code executed only once when the class is loaded.
 
// Memory & Execution
  //    Stored in Method Area
        // Executes before main()
        // Runs only once
public class Static_Block {
    static int x;

    static {
        x = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        System.out.println(x);
    }
}


    
