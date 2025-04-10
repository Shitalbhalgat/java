import java.util.*;

class MaintenanceInfo {

    // Instance Variable
    private Map<String, String> maintenanceMap;

    // Constructor
    public MaintenanceInfo() {
        maintenanceMap = new HashMap<>();
    }

    // Method to add maintenance details
    public void addAcMaintenanceDetails(String serviceCode, String acType) {
        maintenanceMap.put(serviceCode, acType);
    }

    // Method to count records for a given AC type
    public int findTheNumberOfRecordsBasedOnTheACType(String acType) {
        int count = 0;
        for (String type : maintenanceMap.values()) {
            if (type.equalsIgnoreCase(acType)) {
                count++;
            }
        }
        return count > 0 ? count : -1;
    }

    // Method to get service codes for a given AC type
    public Set<String> findServiceCodesBasedOnACType(String acType) {
        Set<String> serviceCodes = new HashSet<>();
        for (Map.Entry<String, String> entry : maintenanceMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(acType)) {
                serviceCodes.add(entry.getKey());
            }
        }
        return serviceCodes;
    }
}


class MapExample1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaintenanceInfo maintenanceInfo = new MaintenanceInfo();

        // Step 1: Add records
        System.out.print("Enter the number of maintenance records to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter service code: ");
            String serviceCode = scanner.nextLine();

            System.out.print("Enter AC type: ");
            String acType = scanner.nextLine();

            maintenanceInfo.addAcMaintenanceDetails(serviceCode, acType);
        }

        // Step 2: Find number of records for a specific AC type
        System.out.print("Enter AC type to search for count: ");
        String searchAcType = scanner.nextLine();
        int count = maintenanceInfo.findTheNumberOfRecordsBasedOnTheACType(searchAcType);
        if (count == -1) {
            System.out.println("No records found for AC type: " + searchAcType);
        } else {
            System.out.println("Number of records for AC type \"" + searchAcType + "\": " + count);
        }

        // Step 3: Get service codes for a specific AC type
        System.out.print("Enter AC type to retrieve service codes: ");
        String acTypeForCodes = scanner.nextLine();
        Set<String> serviceCodes = maintenanceInfo.findServiceCodesBasedOnACType(acTypeForCodes);

        if (serviceCodes.isEmpty()) {
            System.out.println("No service codes found for AC type: " + acTypeForCodes);
        } else {
            System.out.println("Service codes for AC type \"" + acTypeForCodes + "\":");
            for (String code : serviceCodes) {
                System.out.println(code);
            }
        }

      
    }
}
for (String key : maintenanceMap.keySet()) {
            String value = maintenanceMap.get(key);
            if (value.equalsIgnoreCase(acType.trim())) {
                serviceCodes.add(key);
            }
        }
