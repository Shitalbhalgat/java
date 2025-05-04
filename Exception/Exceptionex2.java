import java.util.Scanner;

 class Exceptionex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter your account number (10 digits): ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your tenure (in months): ");
        int tenure = scanner.nextInt();
        
        System.out.print("Enter your monthly deposit: ");
        double monthlyDeposit = scanner.nextDouble();

        // Create an instance of CustomerInfoSystem
        CustomerInfoSystem customerSystem = new CustomerInfoSystem();

        try {
            // Validate the customer details and calculate total amount if valid
            if (customerSystem.validateCustomerInfo(accountNumber, name, age, tenure, monthlyDeposit)) {
                double totalAmount = customerSystem.getTotalAmount(age, tenure, monthlyDeposit);
                System.out.println("Total amount after " + tenure + " months: " + totalAmount);
            }
        } catch (InvalidCustomerInfoException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
 class CustomerInfoSystem {

 
    public boolean validateCustomerInfo(String accountNumber, String name, int age, int tenure, double monthlyDeposit) throws InvalidCustomerInfoException {
       
        if (accountNumber.length() != 10 || !accountNumber.matches("\\d+")) {
            throw new InvalidCustomerInfoException("Invalid account number. It must be exactly 10 digits.");
        }

        
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidCustomerInfoException("Invalid name. Name must contain only letters and spaces.");
        }

        if (age<18 && age >100) {
            throw new InvalidCustomerInfoException("Invalid age. Age must be between 18 and 100.");
        }

       
        if (tenure< 12 || tenure >120) {
            throw new InvalidCustomerInfoException("Invalid tenure. Tenure must be between 12 and 120 months.");
        }

        if (monthlyDeposit<0) {
            throw new InvalidCustomerInfoException("Invalid monthly deposit. It must be a non-negative number.");
        }

        // If all validations pass
        return true;
    }

    public double getTotalAmount(int age, int tenure, double monthlyDeposit) {
        double interestRate = 0;

        if (age>=18 && age <= 59) {
            interestRate = 0.02;  
        } else if (age >= 60) {
            interestRate = 0.05; 
        }

        double totalAmount = monthlyDeposit +(monthlyDeposit + (interestRate * tenure));
        // (interestRate * monthlyDeposit * tenure);
        //  double totalAmount = (monthlyDeposit *tenure)+(interestRate * tenure*monthlyDeposit);
// 
//         double p=monthlyDeposit *tenure;
//         double totalAmount =p +(interestRate *p*tenure);

        
        return totalAmount; 
    }
}
 class InvalidCustomerInfoException extends Exception {

    public InvalidCustomerInfoException(String message) {
        super(message);
    }
}

