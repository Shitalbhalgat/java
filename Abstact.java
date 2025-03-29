abstract class Parent
{
    int x;
    Parent()
    {
        System.out.println("Parent Class Constructor");
    }
    // void f1()
    // {
    //     System.out.println("Value of x : "+x);
    // }
   
    abstract void display();

}
class child extends Parent{
    child()
    {
        System.out.println("child Class Constructor"); 
    }
    void display(){}
    // void f1()
    // {
    //     System.out.println("Value of x : "+(x+10));
    // }
}


public class Abstact {
    public static void main(String[] args) {
        child c =new child();
        //c.f1();
       
    }
    
}
