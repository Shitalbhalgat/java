class Demo
{
    int x;
    void f1()
    {
        System.out.println("From Demo class");
    }
    
}
public class Classs {
    public static void main(String args[])
    {
       Demo d=new Demo();
       d.f1();
       d.x=10;
       System.out.println(d.x);


    }

    
}
   