public class star_pattern {

    public static void main(String[] args) {
        // star square pattern
    /*
        ***
        ***
        ***
    */
    int i,j,k,n=4;
    System.out.println(" star square pattern ");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
      System.out.println();
      // Left half pyramid pattern
/*
      *
      **
      ***
*/
    System.out.println("Left half pyramid pattern ");
    for(i=1;i<=3;i++)
        {
          for(j=1;j<=i;j++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
         System.out.println();

         /* Right handed triangle pattern
     *
    **
   ***
  ****
  */
     System.out.println("Right half pyramid pattern ");
     for(i = 1;i <= n;i++) {
        for(k = 1;k<=(n - i);k++) 
     {
        System.out.print(  " ");
     }
     for(j =1;j<=i;j++) {
        System.out.print(  "*");
     }
     System.out.println( ) ;
  }
  System.out.println();
/* Inverted triangle pattern
      ***
      **
      *
*/
System.out.println("Inverted left half pyramid pattern ");
for(i=3;i>0;i--)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
        /*Inverted Right half pyramid pattern 
        ****
         ***
          **
           *
  */
  System.out.println("Inverted Right half pyramid pattern ");
  for(i=n;i>0;i--) {
        for(k = 1;k<=(n - i);k++) 
        {
           System.out.print(" ");
        }
        for(j =1;j<=i;j++) {
           System.out.print("*");
        }
        System.out.println();
     }
     System.out.println();
      /* Pyramid pattern
        *
       ***
      *****
     *******
  */
System.out.println("Pyramid pattern ");

for(i=1;i<=n;i++)
  {
      for(k=0;k<n-i;k++)
      {
         System.out.print(" ");

      }
    for(j=1;j<=2*i-1;j++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
  
  /*
  Equilateral triangle
           *
          * *
         * * *
        * * * *
*/
System.out.println();
System.out.println("Equilatral triangle pattern ");

    for(i=1;i<=n;i++)
    {
        for(k=n-i;k>0;k--)
        {
           System.out.print(" ");

        }
      for(j=1;j<=i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    } 
/* Diamond pattern
        *
       ***
      *****
     *******
      *****
       ***
        *
  */
System.out.println("Diamond pattern ");

  for(i=1;i<=n;i++)
    {
        for(k=0;k<n-i;k++)
           System.out.print(" ");
      for(j=1;j<=2*i-1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
   for(i=n-1;i>0;i--)
    {
        for(k=0;k<n-i;k++)
           System.out.print(" ");
      for(j=1;j<=2*i-1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }

  



    }
}
    
    

  

  
 