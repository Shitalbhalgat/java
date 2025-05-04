import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetExample {

    public static void main(String[] args) 
    {
        SortedSet<Integer> n = new TreeSet<>();

        n.add(12);
        n.add(20);
        n.add(32);
        n.add(40);
        n.add(10);
        n.add(5);
        System.out.println("SortedSet: " + n);

        // Access the element
        int firstNumber = n.first();
        System.out.println("First Number: " + firstNumber);

        int lastNumber = n.last();
        System.out.println("Last Number: " + lastNumber);

        // Remove elements
        n.remove(12);
        System.out.println("After removing :  " + n );

        //Headset
         System.out.println("Elements less than 20: " + n.headSet(20));

         //tailset
         System.out.println("Elements greater than 20: " + n.tailSet(20));
 
         // Subset
         System.out.println("Elements greater than 10 and len than 25: " + n.subSet(10,25));

         TreeSet<Integer> t =new TreeSet<>(n);
         System.out.println("SortedSet: " + t);

        TreeSet<Integer> descending = new TreeSet(Comparator.reverseOrder());
        descending.addAll(t);
        System.out.println(" SortedSet in descending: " + descending);


         TreeSet<StringBuffer> t1 =new TreeSet<>();
         t1.add(new StringBuffer("A"));
         t1.add(new StringBuffer("X")); 
         t1.add(new StringBuffer("M"));
         t1.add(new StringBuffer("K"));
         System.out.println("SortedSet: " + t1);
        





 

 
    
    }
}
