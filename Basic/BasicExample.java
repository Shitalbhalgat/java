import java.util.Scanner;

public class BasicExample {
    public static void main(String[] args) {
    
        System.out.println("Enter a number ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int  c=a+b;
         System.out.println("Addition of two number is "+c);
         float n=sc.nextFloat();
         double m=sc.nextDouble();
         System.out.println(m+n);
         sc.close();

    }
    

    
}