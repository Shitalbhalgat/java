import java.util.function.*;

 class Function_Functional_interface {
    public static void main(String[] args)
    {
        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(5));

        Function<String, String> str= s ->s.toUpperCase();
        System.out.println(str.apply("java"));

        
        Function<Double, Double> radius=r -> r*r;
        Function<Double, Double> multiplyByPi = r -> r * Math.PI;
        System.out.println(radius.andThen(multiplyByPi).apply(2.0));
        System.out.println(radius.compose(multiplyByPi).apply(2.0));

        BiFunction<Integer, Integer,Integer> add= (n1,n2)->n1+n2;
        System.out.println(add.apply(5,4));

        //Primitive Function
        IntFunction<String> i1 = i -> "Number: " + i;
        System.out.println(i1.apply(5)); 

        DoubleFunction<String> doubleToString = d -> "Value: " + d;
         System.out.println(doubleToString.apply(45.67)); 


        ToIntFunction<String> stringLength = s1 -> s1.length();
          System.out.println(stringLength.applyAsInt("Hello"));

        
        DoubleToIntFunction doubleToInt = value -> (int) Math.floor(value);
          System.out.println(doubleToInt.applyAsInt(45.67));
          System.out.println(doubleToInt.applyAsInt(12.34));  

          IntToDoubleFunction InttoDouble = value -> Math.sqrt(value);
          System.out.println(InttoDouble.applyAsDouble(25));
          System.out.println(InttoDouble.applyAsDouble(12));

        


    
}
}