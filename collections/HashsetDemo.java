// HashSet is a class in Java that implements the Set interface and stores unique elements using a hashing mechanism
// Underlying data structure is a hash table, which allows for fast access and retrieval of elements based on their hash codes.

// Key Features of HashSet:
// 1) No duplicate elements allowed
// 2) No guaranteed order of elements (not sorted)
// 3) Allows null values (only one null element)
// 4) Fast access and retrieval (constant time complexity for basic operations)
// 5) Not synchronized (not thread-safe)
// 
// How to Create HashSet
// import java.util.*;
// HashSet<String> set = new HashSet<>();

// Internal Working : HashSet uses HashMap internally
// Data stored as:
// key = element
// value = dummy object

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored

        System.out.println("Set: " + set);

        System.out.println("Size of set: " + set.size());
        System.out.println("isEmpty: " + set.isEmpty());

        System.out.println("Contains() :" + set.contains("Apple"));

        set.remove("Banana");

        System.out.println("After remove: " + set);

        // Iterating through the set
        System.out.println("Iterating through set:");
        for (String element : set) {
            System.out.println(element);
        }
        // iterator
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //  clear the set
        set.clear();    
        System.out.println("After clear: " + set);
    }
}
    

