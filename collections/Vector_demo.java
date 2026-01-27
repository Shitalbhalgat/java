// Vector : Vector is a legacy, synchronized class in Java used to store a dynamic array of objects.
//          It belongs to the java.util package.
            //  Package for vector import java.util.Vector;
//Key Characteristics of Vector :
                        // 1)Dynamic size (auto grows)
                        // 2)Stores objects only (wrapper classes for primitives)
                        // 3)Allows duplicate values
                        // 4)Maintains insertion order
                        // 5)Slower than ArrayList
                        // 6)Legacy class (Java 1.0)
                        // 7)Thread-safe (all methods are synchronized)
// Constructors:
            // 1)Vector() : creates an empty vector with initial capacity of 10
                        // Vector v = new Vector();
            // 2)Vector(int initialCapacity) : creates an empty vector with specified initial capacity
                    //   Vector v = new Vector(20);
            // 3)Vector(int initialCapacity, int capacityIncrement) : creates an empty vector with specified initial capacity 
            //                                                        and capacity increment
                    //  Vector v = new Vector(20,5);
            // 4)Vector(Collection c) : creates a vector containing elements of the specified collection
            //                   Vector v = new Vector(Arrays.asList(1,2,3));

// Methods:
            // 1)add(element) : adds the specified element to the end of the vector
            // 2)add(index, element) : inserts the specified element at the specified index
            // 3)get(index) : returns the element at the specified index
            // 4)set(index, element) : replaces the element at the specified index with the specified element
            // 5)remove(index) : removes the element at the specified index
            // 6)size() : returns the number of elements in the vector
            // 7)isEmpty() : checks if the vector is empty
            // 8)clear() : removes all elements from the vector
            // 9)contains(element) : checks if the vector contains the specified element
            // 10)indexOf(element) : returns the index of the first occurrence of the specified element

import java.util.Vector;

public class Vector_demo {

    public static void main(String[] args) {

        // Creating a Vector
        Vector<Integer> v = new Vector<>();

        // Checking if Vector is empty
        boolean isEmpty = v.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);

        // capacity of vector
        int capacity = v.capacity();
        System.out.println("Initial capacity of Vector: " + capacity);

        // Adding elements to the Vector
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("Vector: " + v);

        // Size of the Vector
        int size = v.size();
        System.out.println("Size of Vector: " + size);

        // Adding element at specific index
        v.add(1, 15);
        System.out.println("Vector after adding 15 at index 1: " + v);

// Accessing elements
        int element = v.get(1);
        System.out.println("Element at index 1: " + element);

      //firstelement of vector
        int firstElement = v.firstElement();
        System.out.println("First element: " + firstElement);

      //lastelement of vector
        int lastElement = v.lastElement();  
        System.out.println("Last element: " + lastElement);

        // Element at specific index
        int elemAtIndex2 = v.get(2);
        System.out.println("Element at index 2: " + elemAtIndex2);
        
// Modifying elements
        v.set(1, 25);
        System.out.println("Modified Vector: " + v);

        // Setelement at specific index
        v.setElementAt(35, 3);
        System.out.println("Vector after setting 35 at index 3: " + v);

// Searching elements
        int index = v.indexOf(30);
        System.out.println("Index of element 30: " + index);
        // Last index of element
        int lastIndex = v.lastIndexOf(30);
        System.out.println("Last index of element 30: " + lastIndex);
        // Checking if Vector contains an element
        boolean contains = v.contains(30);
        System.out.println("Vector contains 30: " + contains);


// Removing elements
        v.remove(0);
        System.out.println("Vector after removal: " + v);

        // removing element at specific index
        v.removeElementAt(2);
        System.out.println("Vector after removing element at index 2: " + v);

        // Clearing the Vector
        v.clear();
        System.out.println("Vector after clearing: " + v);

        // Final size of the Vector
        int finalSize = v.size();
        System.out.println("Final size of Vector: " + finalSize);


 

     
    
    }
}