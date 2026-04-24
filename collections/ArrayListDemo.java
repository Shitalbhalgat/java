// ArrayList :
//ArrayList is a class in Java that implements the List interface and uses a dynamic array to store elements.
// It allows for resizable arrays, meaning that it can grow and shrink as needed to accommodate the number of elements in the list.

// Key Features of ArrayList:
                // 1) Dynamic size (can grow/shrink)
                // 2) Maintains insertion order
                // 3) Allows duplicates
                // 4) Allows null values
                // 5) Fast access (index-based)
                // 6) Not synchronized (not thread-safe)

// Importing ArrayList:
                // import java.util.ArrayList;

// Creating an ArrayList:
                // ArrayList<Type> listName = new ArrayList<>();

// Common Methods:
                // 1. add(element): Adds an element to the end of the list.
                // 2. get(index): Retrieves the element at the specified index.
                // 3. set(index, element): Replaces the element at the specified index with the given element.
                // 4. remove(index): Removes the element at the specified index.
                // 5. size(): Returns the number of elements in the list.
                // 6. clear(): Removes all elements from the list.
                // 7. contains(element): Checks if the list contains the specified element.
                // 8. isEmpty(): Checks if the list is empty.
                // 9. indexOf(element): Returns the index of the first occurrence of the specified element, or -1 if not found.
// Example:

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
         
        
        // Checking size and if the list is empty
        System.out.println("Size of the list: " + fruits.size()); // Output: 4
        System.out.println("Is the list empty? " + fruits.isEmpty()); // Output: false

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Modifying elements
        fruits.set(1, "Blueberry"); // Replaces "Banana" with "Blueberry"

        // Removing elements
        fruits.remove(2); // Removes "Cherry"

        // Iterating through the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //using for loop with index
        System.out.println("\nFruits in the list using index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // using foreach loop with method reference java 8 feature
        System.out.println("\nFruits in the list using method reference:");
        fruits.forEach(system.out::println); 

        // using lambda expression java 8 feature
        System.out.println("\nFruits in the list using lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));

        


    }
}