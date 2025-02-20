import java.util.Scanner;

class do_while {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
    //     char ch;
    // do{
    //     System.out.println("\n\n********Menu Driven program  using do while loop**********");
    //     System.out.println("1) Area of circle");
    //     System.out.println("2) Area of Trianlge");
    //     System.out.println("3) Area of rectanlge");
    //     System.out.println("Q) Quit");
    //     System.out.println("Enter your choice");
    //     ch=sc.next().charAt(0);
    //     if(ch=='1')
    //     {
    //              
    //               System.out.println("Enter a value of radius ");
    //               int r=sc.nextInt();
    //               System.out.println("Area of circle is : "+(3.14*r*r));
    //               
    //      }else if (ch=='2')
    //      {
    //               
    //               System.out.println("Enter a value of height and base ");
    //               float height=sc.nextFloat();
    //               float base=sc.nextFloat();
    //               System.out.println("Area of triangle is : "+(0.5*height*base));
    //               
    //      }
    //     else if(ch=='3')
    //     {
    //      
    //               System.out.println("Enter a values of lenght and breath : ");
    //             int l=sc.nextInt();
    //             int b=sc.nextInt();
    //               System.out.println("Area of rectangle is : "+(l*b));
    //     }        
    //      else if(ch == 'q' ||ch=='Q')
    //      { 
    //               System.out.println("Quit from loop ");
    //     }
    //     else
    //     {
    //         System.out.println("Try again....");
    //     }
    // }while(ch!='q'&& ch!='Q');
    //     
    // }}

    



    //Menu Driven program
    

    //Asking a user to enter a positive number and calculate sum of this,if user enter negative number then  exit the program
  
//      int n=0, sum=0;
//     do{
//         sum=sum+n;
//         System.out.println("enter a number :");
//          n=sc.nextInt();
//        System.out.println("You enter a number is : "+n);
//     }while(n>=0);
//     System.out.println(sum);
// }}
// calculate the additon of two number until user press NO
   int n1,n2;
     char ch1;
    do{
       
        System.out.println("\nenter a two numbers :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Addition of two number is : "+(n1+n2));
       System.out.println("Do you want to continue press(Y/y): ");
       ch1=sc.next().charAt(0);
    }while(ch=='y'||ch =='Y');
    System.out.println("out of loop");
}
}