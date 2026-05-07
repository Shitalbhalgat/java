// Map:    1) A Map is a collection that stores key-value pairs.
        // 2)Each key is unique, and it maps to a specific value. 
        // 3)Maps are useful for storing and retrieving data based on keys.
        // 4)In Java, the Map interface is part of the java.util package and has several implementations, such as HashMap, TreeMap, and LinkedHashMap.
        // 5)Common operations on a Map include adding key-value pairs, retrieving values based on keys,
        //     checking for the presence of keys or values, and iterating through the entries in the map.
        // 6)Maps are widely used in various applications, such as caching, data storage, and implementing associative arrays.
// Syntax: Map<KeyType, ValueType> mapName = new HashMap<>();
        // Example: Map<Integer, String> map = new HashMap<>();
// Important Methods of Map Interface:
        
// | Method          | Syntax                  | Description       |
// | ----------------| ------------------------| ----------------- |
// | put()           | map.put(101,"A");       | Add key-value     |
// | get()           | map.get(101);           | Get value         |
// | remove()        | map.remove(101);        | Remove entry      |
// | containsKey()   | map.containsKey(101);   | Check key         |
// | containsValue() | map.containsValue("A"); | Check value       |
// | size()          | map.size();             | Number of entries |
// | isEmpty()       | map.isEmpty();          | Check empty       |
// | clear()         | map.clear();            | Remove all        |
// | keySet()        | map.keySet();           | Get all keys      |
// | values()        | map.values();           | Get all values    |
// | entrySet()      | map.entrySet();         | Get all entries   |


import java.util.Map;
import java.util.HashMap;

class MapExample {

    public static void main(String[] args) {
    
        HashMap<Integer,String> map  = new HashMap<>();

        
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"four");
        map.put(5,"five");

        System.out.println("Map: " + map);

        // Access keys of the map
        System.out.println("Keys: " + map.keySet());

        // Access values of the map
        System.out.println("Values: " + map.values());

        // Access entries of the map
        System.out.println("Entries: " + map.entrySet());

        //ContainsKey()
        System.out.println("ContainsKey :" + map.containsKey(5));

 //ContainsValue()
       System.out.println("ContainsValue :" + map.containsValue("Five"));

       System.out.println("Get :" + map.get(2));

       System.out.println("Size :" + map.size());

map.replace(5,"fiveeeeee");

       System.out.println("After replace Map is : " + map);

  map.remove(1);
        System.out.println("After Removed: " +map );

// Iterating through the map using entrySet()
        System.out.println("Iterating through the map:");
    for (Map.Entry<Integer,String> mapElement : map.entrySet()) {
		 System.out.println(mapElement.getKey() + " :"+mapElement.getValue());

      
    }
}
}
