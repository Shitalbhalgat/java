import java.util.Scanner;
import java.util.*;
class Methods
{
 public static void main(String args[])
 {
    f1();
    sum();
    System.out.println(sum1());
    f2("javaa");
 }
 static void f1()
 {
    System.out.println("Hello");
 }
 static void sum()
 {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter  two numbers");
   a=sc.nextInt();
   b=sc.nextInt();
   System.out.println("Addition of two numbers is ="+a+b);
}
static int sum1()
{
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter  two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Addition of two numbers is ="+(a+b));
    return a+b;
}
static void f2(String s)
{
   System.out.println( s) ;
}
}