// Stream in Java
// 1)A Stream in Java is a sequence of elements that can be processed in a functional style.
// 2)It is a part of the java.util.stream package and provides a powerful way to perform operations on collections of data.
// 3)Streams can be created from various data sources, such as collections, arrays, or I/O channels, and 
//    they support a wide range of operations, including filtering, mapping, and reducing.
// 4)A stream pipeline has: Source → Intermediate Operations → Terminal Operation


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streaminjava {
    public static void main(String[] args) {

    //Stream Creation 1)Empty Stream
      Stream<String> streamEmpty = Stream.empty();
      System.out.println("Empty Stream: " + streamEmpty);

    //2)Stream of Collection
        List<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
    
    
    //3)Using Stream.of() method 
       Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
     //4)Stream from an Array using Arrays.stream()
     String[] arr= new String[] { "a", "b", "c" };
     Stream<String> streamOfStrings = Arrays.stream(arr);

// Intermediate Operations

        List<Integer> l =List.of(1,2,34,5,6,7,70);

        //filter
          System.out.println("Filtered Stream: "+l.stream().filter(x->x%2==0));
         System.out.println("Filtered List: "+l.stream().filter(x->x%2==0).toList());
        
         //peek : The peek() method is an intermediate operation that allows you to perform an action 
         // on each element of the stream as it is processed, without modifying the stream itself.
         //  It is often used for debugging purposes or to perform side effects, such as logging or printing values,
         //  while processing the stream.
       Stream<Integer> s= l.stream().filter(x->x%2==0).peek(x->System.out.println(x));
       long z=l.stream().filter(x->x%2==0).peek(x->System.out.println("value of x :"+x)).count();
       System.out.println("Count: "+z);

//map
       List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
       List<Integer> square = num.stream().map(n-> n * n).collect(Collectors.toList());
       System.out.println("Original list: " + num);
        System.out.println("Squared list: " + square);

        //distinct
      List<Integer> a = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);
      List<Integer> b = a.stream().distinct().collect(Collectors.toList());
      System.out.println("Original list with duplicates: " + a);
      System.out.println("List after removing duplicates: " + b);
      
      //sorted
      System.out.println("Sorted List : "+a.stream().sorted().toList());

      //limit
      System.out.println(" List  after limit: "+a.stream().limit(3).toList());

      //skip
      System.out.println(" List  after skipping first 3 elements: "+a.stream().skip(3).toList());

    
      List<String> str=List.of("C","PHP","Java","C++","Python");

       //Terminal operation
    //count
         System.out.println("Count : "+str.stream().count());
    //anyMatch
       System.out.println("anyMatch(): "+str.stream().anyMatch((value) -> value.startsWith("Java")));
    //allMatch
        System.out.println("allMatch(): "+str.stream().allMatch((value) -> value.startsWith("Java")));
    //noneMatch
        System.out.println("NoneMatch(): "+str.stream().noneMatch((value) -> value.startsWith("Java")));
    //findAny()
    System.out.println("findAny(): "+str.stream().findAny());
    //findFirst()
    System.out.println("findFirst(): "+str.stream().findFirst());

    //forEach
    str.stream().forEach(x->System.err.println(x));

    //toArray
    System.out.println("toArray():"+str.stream().toArray());


    //collect
    System.out.println("collect : "+str.stream().map(x->x.toUpperCase()).peek(x->System.out.println(x)).collect(Collectors.toList()));

   //min
   System.out.println("Minimum : "+str.stream().min((s1,s2)->s1.compareTo(s2)).get());

   //max
   System.out.println("Maxmimum :"+str.stream().max((s1,s2)->s1.compareTo(s2)).get());

   //reduce
  String result = str.stream().reduce("", (s1, s2) -> s1 + " " + s2);
   System.out.println(result);
   

   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   int sum = numbers.stream().reduce(0, (n1, n2) -> n1+n2); 
   System.out.println("Sum: " + sum);
 }
    
}
