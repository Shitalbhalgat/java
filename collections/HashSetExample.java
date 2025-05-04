import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample 
{

    public static void main(String[] args) {
        
        Set<String> nameSet = new HashSet();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\nHashSet Example Menu:");
            System.out.println("1. Add Name");
            System.out.println("2. Check if Name Exists");
            System.out.println("3. Remove Name");
            System.out.println("4. Display All Names");
            System.out.println("5. Get Number of Names");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) 
            {
                case "1":
                    System.out.print("Enter name to add: ");
                    String nameToAdd = sc.nextLine();
                    if (nameSet.add(nameToAdd)) {
                        System.out.println(nameToAdd + " added successfully.");
                    } else {
                        System.out.println(nameToAdd + " already exists in the set.");
                    }
                    break;
                case "2":
                    System.out.print("Enter name to check: ");
                    String nameToCheck = sc.nextLine();
                    if (nameSet.contains(nameToCheck)) {
                        System.out.println(nameToCheck + " exists in the set.");
                    } else {
                        System.out.println(nameToCheck + " does not exist in the set.");
                    }
                    break;
                case "3":
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = sc.nextLine();
                    if (nameSet.remove(nameToRemove)) {
                        System.out.println(nameToRemove + " removed successfully.");
                    } else {
                        System.out.println(nameToRemove + " not found in the set.");
                    }
                    break;
                case "4":
                    System.out.println("\nAll names in the HashSet:");
                    if (nameSet.isEmpty()) {
                        System.out.println("The set is empty.");
                    } else {
                        Iterator<String> it = nameSet.iterator();
                        while (it.hasNext()) {
                            System.out.println(" - " + it.next());
                        }
                        // Alternatively, you can use a for-each loop:
                        // for (String name : nameSet) {
                        //     System.out.println("- " + name);
                        // }
                    }
                    break;
                case "5":
                    System.out.println("Number of names in the HashSet: " + nameSet.size());
                    break;
                case "6":
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}