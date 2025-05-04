import java.util.Scanner;

 class Exceptionex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();  // Consume the newline character
        
        System.out.print("Enter your travel mode (Airway/Roadway): ");
        String travelMode = scanner.nextLine();
        
        // Create an instance of TouristManagementSystem
        TouristManagementSystem tms = new TouristManagementSystem();
        
        try {
            // Validate the details and generate tourist ID
            if (tms.validateTouristDetails(name, age, phoneNumber, travelMode)) {
                String touristId = tms.getTouristId(name, age, phoneNumber, travelMode);
                System.out.println("Your Tourist ID is: " + touristId);
            }
        } catch (InvalidTouristDetailsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
 class TouristManagementSystem {

    // Validate tourist details
    public boolean validateTouristDetails(String name, int age, long phoneNumber, String travelMode) throws InvalidTouristDetailsException {
        // Validate Name
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidTouristDetailsException("Invalid name. Name must contain only letters and spaces.");
        }
        
        // Validate Age
        if (age < 60 || age > 99) {
            throw new InvalidTouristDetailsException("Invalid age. Age must be between 60 and 99.");
        }
        
        // Validate Phone Number
        if (String.valueOf(phoneNumber).length() != 10) {
            throw new InvalidTouristDetailsException("Invalid phone number. Phone number must be exactly 10 digits.");
        }
        
        // Validate Travel Mode
        if (!travelMode.equals("Airway") && !travelMode.equals("Roadway")) {
            throw new InvalidTouristDetailsException("Invalid travel mode. Travel mode must be either 'Airway' or 'Roadway'.");
        }
        
        // If all validations pass
        return true;
    }

    // Generate Tourist ID
    public String getTouristId(String name, int age, long phoneNumber, String travelMode) {
        if (name == null || name.isEmpty() || travelMode == null || travelMode.isEmpty()) {
            return "Invalid details, cannot generate Tourist ID.";
        }
        
        // Extract the required parts
        String namePart = name.length() >= 2 ? name.substring(0, 2).toUpperCase() : name.toUpperCase();
        String travelModePart = travelMode.length() >= 2 ? travelMode.substring(0, 2).toUpperCase() : travelMode.toUpperCase();
        String phonePart = String.valueOf(phoneNumber).substring(0, 2);
        
        // Generate the Tourist ID
        return namePart + age + phonePart + travelModePart;
    }
}
 class InvalidTouristDetailsException extends Exception {

    // Constructor that passes the message to the superclass
    public InvalidTouristDetailsException(String message) {
        super(message);
    }
}


