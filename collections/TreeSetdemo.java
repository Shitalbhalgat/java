// TreeSet is a class in Java that implements the Set interface and stores elements in sorted order using a tree structure (Red-Black Tree).
// Key Features:
            // 1)No duplicates
            // 2)Sorted order (ascending by default)
            // 3)Does NOT allow null
            // 4)Uses Red-Black Tree as underlying data structure
            // 5)Slower than HashSet (O(log n))

// How to Create TreeSet :
            // import java.util.*;
            // TreeSet<Integer> set = new TreeSet<>();

// Internal Working 
            // Uses Red-Black Tree
            // Elements stored in sorted order
            // Uses:
            // Comparable (natural sorting)
            // Comparator (custom sorting)
// 


import java.util.*;

public class TreeSetdemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Set: " + set);

        System.out.println("Size of set: " + set.size()) ;
        System.out.println("isEmpty: " + set.isEmpty());
        System.out.println("Contains() :" + set.contains(20));
        set.remove(30);
        System.out.println("After remove: " + set);

// TreeSet specific methods
        System.out.println("First() returns first element : " + set.first());
        System.out.println("Last() returns last element : " + set.last());
        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 20: " + set.lower(20));
        System.out.println("Ceiling 25: " + set.ceiling(25));
        System.out.println("Floor 25: " + set.floor(25));

        // Iterating through the set
        System.out.println("Iterating through set:");
         for(String s : set) {
            System.out.println(s);
        }

        // iterator
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}