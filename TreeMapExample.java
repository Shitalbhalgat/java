import java.util.*;

public class TreeMapExample
{

	public static void main(String[] args)
	{
	    TreeMap<Integer, String> t = new TreeMap();

		// Storing key-value pairs by using put() method
		t.put(1 ,"Abc");
		t.put(6 ,"Pqr");
		t.put(3 ,"Xyz");
		t.put(4 ,"Mnq");
		t.put(2, "Cde");
        System.out.println("TreeMap(t) : " + t);

        // Constructor  with Map
		TreeMap<Integer, String> t1 = new TreeMap(t);
		System.out.println("TreeMap(t1): " + t1);

        // Constructor  with Comparator
        TreeMap<String, Integer> t2 = new TreeMap(new CustomComparator());
		t2.put("ABC", 17);
		t2.put("XYZ", 29);
		t2.put("CDE", 43);
		t2.put("MNQ", 13);
		t2.put("PQR", 19);
        System.out.println("TreeMap(t2): " +t2);

		System.out.println("First Key: " + t.firstKey());
		System.out.println("Last Key: " + t.lastKey());
		System.out.println("First Entry: " + t.firstEntry());
		System.out.println("Last Entry: " + t.lastEntry());

			// Using higher and lower methods
		System.out.println("Higher Key: " + t.higherKey(3));
		System.out.println("Lower Key: " + t.lowerKey(3));
		System.out.println("Higher Entry: " + t.higherEntry(4));
		System.out.println("Lower Entry: " + t.lowerEntry(3));
		
		// Using ceiling and floor methods
		System.out.println("Ceiling Key: " + t.ceilingKey(3));
		System.out.println("Floor Key: " + t.floorKey(3));
		System.out.println("Ceiling Entry: " + t.ceilingEntry(3));
		System.out.println("Floor Entry: " + t.floorEntry(3));


		System.out.println("Printing the entries before id-3 in ascending order using headMap: " + t.headMap(3));
		
		System.out.println("Printing the entries from id-3 till the end in ascending order usning tailMap: " + t.tailMap(3));
 		
		System.out.println("subMap: " + t.subMap(2, 5));

	
		System.out.println("TreeMap : " + t); 

		System.out.println(t.get(5));
		
		System.out.println(t.keySet());
		
		System.out.println(t.values());

		t.remove(4);
		System.out.println(t);


	}
}

class CustomComparator implements Comparator{

    public int compare(Object emp1, Object emp2)
    {
        String name1 = emp1.toString();
        String name2 = emp2.toString();
        
        // decreasing order sorting
        return name1.compareTo(name2);
    }
}
