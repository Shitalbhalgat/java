import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

class Predefined_Functional_interface {
    public static void main(String[] args)
     {
        int n=21;
        Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
        System.out.println(isEven.test(n));

        Predicate<Integer> isNotEven = isEven.negate();
        if(isNotEven.test(n)) 
            System.out.println(n+ " is not even!");

        Predicate<Integer> result = num1 -> num1 % 5 == 0;
        if(isEven.and(result).test(n)) 
                System.out.println(n + " is even and divisible by 5");

       int x[]={1,2,40,4,5,30,45,54};
       Predicate<Integer> p = num1 -> num1>3;
       for(int y:x)
       {
        if(p.test(y))
        System.out.print(y+" ");
       }
       System.out.println();

       List<String> names = new ArrayList<>();
       names.add("JAVA");
       names.add("C++");
       names.add("C");
       names.add("PHP");
       names.removeIf(name -> name.startsWith("C"));  
       System.out.println(names); 

      
       BiPredicate<Integer,Integer> p1=(a,b)->(a-b)>0;
       System.out.println(p1.test(10,20));
       System.out.println(p1.test(30,20));

       IntPredicate b=  n1->(n1%4)>0;
        System.out.println(b.test(4)); 
        System.out.println(b.test(7)); 

   
    //    IntPredicate
       
       DoublePredicate c=s->s/2>8;
       System.out.println(c.test(4)); 





       // 
//         Function<Integer, Integer> square = num -> num * num;
//         System.out.println(square.apply(5));
// 
//         Function<Double, Double> square = num -> num * num;
//         Function<Double, Double> multiplyByPi = num -> num * Math.PI;
//         Function<Double, Double> findArea =multiplyByPi.compose(square);
//         System.out.println(findArea.apply(5.0));



//     Consumer<Integer> inverter = num -> System.out.println(-num);
//     inverter.accept(5);
//     inverter.accept(-8);
// 
//     Consumer<Integer> printNum = num -> System.out.print("Number: " + num);
//     Consumer<Integer> invert = num -> System.out.print(", Inverted: " + (-num));
//     Consumer<Integer> doubleNum = num -> System.out.print(", Double, " + num * 2);
//     Consumer<Integer> result = printNum
//                                  .andThen(invert)
//                                  .andThen(doubleNum);
//     result.accept(10);
// 
// List<Integer> list = List.of(1, 2, 3, 4, 5);
//        list.forEach(a-> System.out.println("Number: " + a)); 
      
// 
//     Supplier<Integer> supplier = () -> new Random().nextInt(100);
//     System.out.println(supplier.get());
// 
// 
//  

// 
// 
//        
// 
// 
//             Predicate<Integer> isEven = num1 -> num1 % 2 == 0;
//     Supplier<Integer> randomIntSupplier = () -> {
//         int random = new Random().nextInt(100);
//         System.out.print("Random number " + random);
//         return random;
//     };
// 
//     Consumer<Boolean> printAnswer = answer -> System.out.println(" is even? " + answer);
// 
//     printAnswer.accept(isEven.test(randomIntSupplier.get()));
// printAnswer.accept(isEven.test(randomIntSupplier.get()));
// printAnswer.accept(isEven.test(randomIntSupplier.get()));
// 
// 
// 
// 

    }
    
}
