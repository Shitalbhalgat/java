// Comparator is an interface used to define custom sorting (multiple ways of sorting).
// Key points:
            // Separate class or lambda
            // Uses method: compare()
            // Can have multiple sorting logics
// Package: java.util
// Syntax
// Comparator<classname> comp = new Comparator<classname>() {
//     public int compare(classname c1, classname c2) {
//         return c1.field.compareTo(c2.field);
//     }
// };  

import java.util.*;

class Student implements Comparator<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>(new Student(0, "")); // passing dummy object for comparator

        set.add(new Student(3, "A"));
        set.add(new Student(1, "C"));
        set.add(new Student(2, "B"));

        System.out.println(set);
    }
}