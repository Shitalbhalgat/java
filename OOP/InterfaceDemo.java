interface Bank {

    //  Interface variable (public static final by default)
    int RATE_OF_INTEREST = 5;

    //  Abstract method (public abstract by default)
    void deposit(int amount);

    //  Default method (Java 8+)
    default void displayRate() {
        System.out.println("Rate of Interest: " + RATE_OF_INTEREST + "%");
    }

    //  Static method (Java 8+)
    static void bankInfo() {
        System.out.println("Welcome to National Bank");
    }
}


class SBI implements Bank {

    // Implement abstract method
    public void deposit(int amount) {
        System.out.println("Deposited amount: " + amount);
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {


        SBI s = new SBI();

        // Calling abstract method
        s.deposit(10000);

        // Calling default method
        s.displayRate();

        // Accessing interface variable
        System.out.println("Interest Rate: " + Bank.RATE_OF_INTEREST);

        // Calling static method
        Bank.bankInfo();
    }
}
