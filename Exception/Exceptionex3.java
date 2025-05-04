import java.util.Scanner;

 class Exceptionex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Registration ID (VR-####): ");
        String registrationId = scanner.nextLine();

        System.out.print("Enter Vehicle License Number (LL00LL0000): ");
        String vehicleLicenseNumber = scanner.nextLine();

        System.out.print("Enter Driver License Number (LL0000000000000): ");
        String driverLicenseNumber = scanner.nextLine();

  
        VehicleRegistrationSystem vehicleSystem = new VehicleRegistrationSystem();

        try {
     
            String result = vehicleSystem.validateFleetDetails(registrationId, vehicleLicenseNumber, driverLicenseNumber);
            System.out.println(result);
        } catch (InvalidVehicleDetailsException e) {

            System.out.println("Error: " + e.getMessage());
        } 
    }
}
 class VehicleRegistrationSystem {

    public String validateFleetDetails(String registrationId, String vehicleLicenseNumber, String driverLicenseNumber) throws InvalidVehicleDetailsException {
          // VR-####
        if (!registrationId.matches("VR-\\d{4}")) {
            throw new InvalidVehicleDetailsException("Invalid Registration ID. It must match the format VR-#### (e.g., VR-1234).");
        }

        //  License Number (LL00LL0000)
        if (!vehicleLicenseNumber.matches("[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}")) {
            throw new InvalidVehicleDetailsException("Invalid Vehicle License Number. It must match the format LL00LL0000 (e.g., AB12CD3456).");
        }

        //  License Number (LL0000000000000)
        if (!driverLicenseNumber.matches("[A-Z]{2}\\d{13}")) {
            throw new InvalidVehicleDetailsException("Invalid Driver License Number. It must match the format LL0000000000000 (e.g., AB1234567890123).");
        }

        // If all details are valid, return a success message
        return "All details are valid and can be added to the system.";
    }
}
 class InvalidVehicleDetailsException extends Exception {

    
    public InvalidVehicleDetailsException(String message) {
        super(message);
    }
}
