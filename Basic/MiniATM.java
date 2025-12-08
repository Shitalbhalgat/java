import java.util.Scanner;

public class MiniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;          
        String correctPin = "1234";      
        String inputPin;
        int attempts = 0;
        boolean accessGranted = false;

        System.out.println("===== Welcome to Mini ATM =====");

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            inputPin = sc.next();

            if (inputPin.equals(correctPin)) {
                System.out.println("PIN correct! Access granted.");
                accessGranted = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN! Attempts left: " + (3 - attempts));
            }
        }

        if (!accessGranted) {
            System.out.println("Too many incorrect attempts! Exiting program...");
            return;
        }

        char choice;
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1) Check Balance");
            System.out.println("2) Deposit Money");
            System.out.println("3) Withdraw Money");
            System.out.println("Q) Quit");
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);

            if (choice == '1') {
                System.out.println("Current Balance: " + balance);
            } 
            else if (choice == '2') {
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit successful! New Balance: " + balance);
                } else {
                    System.out.println("Invalid amount!");
                }
            } 
            else if (choice == '3') {
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if (withdraw > 0 && (balance - withdraw) >= 1000) {
                    balance -= withdraw;
                    System.out.println("Withdrawal successful! New Balance: " + balance);
                } else if ((balance - withdraw) < 1000) {
                    System.out.println("Cannot withdraw! Minimum balance of 1000 must be maintained.");
                } else {
                    System.out.println("Invalid amount!");
                }
            } 
            else if (choice == 'q' || choice == 'Q') {
                System.out.println("Thank you for using Mini ATM. Goodbye!");
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 'q' && choice != 'Q');
    }
}
