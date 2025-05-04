import java.util.Map;
import java.util.HashMap;

class MapExample {

    public static void main(String[] args) {
    
        Map<Integer,String> map  = new HashMap<>();

        
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



//map.entrt interface

    for (Map.Entry<Integer,String> mapElement : map.entrySet()) {
		 System.out.println(mapElement.getKey() + " :"+mapElement.getValue());

      
    }
}
}