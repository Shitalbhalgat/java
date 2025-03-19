import java.util.Scanner;

class UserInterface{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        
        System.out.print("Enter your travel mode (Airway/Roadway): ");
        String travelMode = scanner.nextLine();
        
        // Create an instance of TouristManagementSystem
        TouristManagementSystem t1 = new TouristManagementSystem();
        
        try {
            // Validate the details and generate tourist ID
            if (t1.validateTouristDetails(name, age, phoneNumber, travelMode)) 
            {
                String Id = t1.getTouristId(name, age, phoneNumber, travelMode);
                System.out.println("Your Tourist ID is: " + Id);
            }
        }
         catch (InvalidTouristDetailsException e)
          {
            System.out.println("Error: " + e.getMessage());
        } 
        
    }
}
 class TouristManagementSystem {

    // Validate tourist details
    public boolean validateTouristDetails(String name, int age, long phoneNumber, String travelMode) throws InvalidTouristDetailsException
     {
        
        if (!name.matches("[a-zA-Z ]+"))
         {
            throw new InvalidTouristDetailsException("Invalid name. Name must contain only letters and spaces.");
        }
        
        
        if (age<60 || age > 99)
         {
            throw new InvalidTouristDetailsException("Invalid age. Age must be between 60 and 99.");
        }
        
        if (String.valueOf(phoneNumber).length() != 10) {
            throw new InvalidTouristDetailsException("Invalid phone number. Phone number must be exactly 10 digits.");
        }
        
        if (!travelMode.equals("Airway") && !travelMode.equals("Roadway")) {
            throw new InvalidTouristDetailsException("Invalid travel mode. Travel mode must be either 'Airway' or 'Roadway'.");
        }
        
        // If all validations pass
        return true;
    }

    // Generate Tourist ID
    public String getTouristId(String name, int age, long phoneNumber, String travelMode) {
         if (name == null || name.length()<2 || String.valueOf(phoneNumber).length() < 2 || travelMode == null||travelMode.length()<2) 
         {
            return "Invalid details to generate Tourist ID."; 
        }
        return name.substring(0, 2) + age + String.valueOf(phoneNumber).substring(0, 2) + travelMode.substring(0, 2);
    }
}
class InvalidTouristDetailsException extends Exception {

    // Constructor that passes the message to the superclass
    public InvalidTouristDetailsException(String message) {
        super(message);
    }
}


