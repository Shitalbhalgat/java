public class Function_overloading {
//Complie time polymorphism
// Overloading using different types of parameters
    void display(int A)
{
     System.out.println( "Value of A : "+A);     
}

void display(char A)
{
     System.out.println("Value of A : "+A);     
}

void display(double A)
{
     System.out.println( "Value of A : "+A);     
}


// Function overloading by changing the number of arguments
void Sum(int A, int B)
{
     System.out.println( "Sum is : "+ A+B);
}

void Sum(int A, int B, int C)
{
     System.out.println( "Sum is : "+ A+B+C);    
}

void Sum(int A, int B, int C, int D)
{
     System.out.println( "Sum is : "+ A+B+C+D);     
}

// Function overloading by changing the sequence  of arguments
void f1(int a ,String b)
{
  System.out.println("Function with int and string parameter  "+a+" "+b);
}
void f1(String b,int a)
{
  System.out.println("Function with  string and int parameter  "+b+" "+a);
}


public static void main(String[] args) {
    Function_overloading f1=new Function_overloading();
    f1.display(10);
    f1.display('@');
    f1.display(3.14);

    f1.Sum(1,2);
    f1.Sum(1,2,3);
    f1.Sum(1,2,3,4);

    f1.f1(10,"java");
    f1.f1("java",1);
}
    
}
