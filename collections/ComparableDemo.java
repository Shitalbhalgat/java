// omparable is an interface used to define the natural (default) sorting order of objects.
// Key Points
        // Inside the same class
        // Uses method: compareTo()
        // Only one sorting logic
// Package: java.lang
// 
// Syntax
// class Classname implements Comparable<classname> {
//     public int compareTo(Classname c) {
//         return this.field - c.field;
//     }
// }   


import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id; // ascending order
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student(3, "A"));
        set.add(new Student(1, "B"));
        set.add(new Student(2, "C"));

        System.out.println(set);
    }
}