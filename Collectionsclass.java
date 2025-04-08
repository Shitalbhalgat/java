import java.util.*;

 class Collectionsclass {
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList();
        list.add("abc");
        list.add("pqr");
        list.add("mnq");
        list.add("zxy");
        // Sorts the specified list into ascending order, according to  the natural ordering of its elements.
        Collections.sort(list);
        System.out.println("sort elements in ascending order" + list);

         //Reverse order
        Collections.reverse(list);
        System.out.println("sort elements in decending order " + list);

    

        //swap
        Collections.sort(list);
       
        Collections.swap(list, 1, 3);
        
        System.out.println("\nArrayList after the Swap:" + list);
    
  
        //copy
        ArrayList<String> src = new ArrayList();
        src.add("A");
        src.add("B");
        src.add("C");

        
        ArrayList<String> dest = new ArrayList();
        dest.add("");
        dest.add("");
        dest.add("");

        
        System.out.println("Source List: " + src);
        System.out.println("Destination List (Before Copy): " + dest);

        // Use Collections.copy() method to copy elements
        Collections.copy(dest, src);

        System.out.println("Destination List (After Copy): " + dest);
    }

    }

