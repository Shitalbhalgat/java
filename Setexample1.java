import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Setexample1
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter number of clients to be added:");
         n = sc.nextInt();
          
        ClientInfo cf = new ClientInfo();
        
        System.out.println("Enter the client details (in the format ClientID:PackageName):");
        for (int i = 0; i<n;i++) {
            String details = sc.next();
            cf.addClient(details); 
        }

        System.out.print("Enter the package name to search for the total number of clients: ");
        String packageName = sc.next();
        int totalClients = cf.getTotalClientsByPackageName(packageName);  

        if (totalClients == -1) {
            System.out.println("No clients found for package: " + packageName);
        } else {
            System.out.println("Total number of clients with package " + packageName + ": " + totalClients);
        }

        System.out.print("Enter the package name to list all client IDs: ");
        String packageToRetrieve = sc.next();
        List<String> clientIds = cf.listClientIdsByPackageName(packageToRetrieve);  

        if (clientIds.isEmpty()) {
            System.out.println("No client IDs found for package: " + packageToRetrieve);
        } else {
            System.out.println("Client IDs for package " + packageToRetrieve + ": " + clientIds);
        }

        
    }
}


 class ClientInfo {
    private Set<String> clientSet = new HashSet<String>();


    public Set<String> getClientSet() {
        return clientSet;
    }

    public void setClientSet(Set<String> clientSet) {
        this.clientSet = clientSet;
    }

    
    public void addClient(String clientDetails) {
        clientSet.add(clientDetails);  
    }

    public int getTotalClientsByPackageName(String packageName) {
        int count = 0;
        for (String clientDetail : clientSet) {
           
            String[] parts = clientDetail.split(":");
            if (parts.length == 2 && parts[1].equals(packageName)) 
            {
                count++;  
            }
        }
        return count > 0 ? count : -1; 
    }


    public List<String> listClientIdsByPackageName(String packageName) {
        List<String> clientIds = new ArrayList<>();
        for (String clientDetail : clientSet) {
            String[] parts = clientDetail.split(":");
            if (parts.length == 2 && parts[1].equals(packageName)) {
                clientIds.add(parts[0]);  
            }
        }
        return clientIds;
    }
}
