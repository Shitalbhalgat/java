import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//@FunctionalInterface
interface X
{  
   public void F1(); 
    //public void s2(String s);
    //void F2(int a ,int b); 
    // public String s1(String s);
   

}  
// class Test implements X{
// 
//     // public void F1(){
//     //     System.out.println("Hello...");
//     //     } 
// }
// class CustomSorting1  implements Comparator<Integer>{
// 
//     public int compare(Integer i1,Integer i2)
//     {
//         return (i1<i2)?1:((i1>i2)?-1:0);
//     }
// }
class LambdaExpressionExample {  
    public static void main(String[] args) {  
        
    //    X i = new Test();
    //     i.F1();

    // Lambda Expression with no parameter
        // X x=()->System.out.println("Hello...");
        //  x.F1();
        
  // Lambda expression with a single parameter without return keyword.
            // 1st way 
            //  X s2 = str -> System.out.println("Hello..."+str); 
                //  s2.s2("Abc");
  
 // Lambda Expression with more than one parameter
        // X x=(a,b)->System.out.println("Sum : "+(a+b));
        // x.F2(10,20);

 //2nd way with return keyword.
       //  X s1 = (str) -> {  return "Hello..."+str; }; 
           // System.out.println(s1.s1("Abc")); 

    


    //Iterating Collections Using the Foreach Loop  
        List<Integer> list=new ArrayList<>();  
        
        list.add(1);  
        list.add(12);  
        list.add(16);  
        list.add(17);  
    
          
        Collections.sort(list);
        System.out.println(list); 
        // Collections.sort(list ,new CustomSorting1());
        // System.out.println(list); 

        Comparator<Integer> c=(i1,i2)->(i1<i2)?1:((i1>i2)?-1:0);
        Collections.sort(list ,c);
        System.out.println(list); 
    


        

        
        // for treeset example(o1,o2)->(o1.id>o2.id)?1:(o1.id<o2.id)?-1:0
    }  
}  


          
       
   
  
  
