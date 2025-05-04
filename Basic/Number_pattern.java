public class Number_pattern {

    public static void main(String[] args) {
        int i,j,k,n=4;
// square pattern 
/*
123
123
123*/
System.out.println("Number square pattern 1 ");
for(i=1;i<=3;i++)
    {
      for(j=1;j<=3;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
// Square pattern 
/*
111
222
333*/
System.out.println("Number square pattern 2 ");
for(i=1;i<=3;i++)
    {
      for(j=1;j<=3;j++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
 /*Left half pyramid pattern
      1
      12
      123
    */
System.out.println("Left half pyramid pattern");
System.out.println("pattern 1");
for(i=1;i<=3;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
    /*
        1
        22
        333
    */
System.out.println("pattern 2");
for(i=1;i<=3;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
    /*
      1
      23
      456
      78910
    */
   System.out.println("pattern 3 ");
   int number=1;
   for(i=1;i<=4;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(number++);
      }
      System.out.println();
    }
     /*
     Right half pyramid pattern
          1
         22
        333
       4444
    */
   System.out.println("Right half pyramid pattern ");
   for(i = 1;i <= n;i++) {
         for(k = 1;k<=(n-i);k++) 
         System.out.print(" ");
      for(j =1;j<=i;j++) {
         System.out.print(i);
      }
      System.out.println();
   }
   System.out.println();

/* Inverted left half pyramid pattern
    123
    12
    1

*/
System.out.println("Inverted left half pyramid pattern");
System.out.println("pattern 1");
for(i=3;i>0;i--)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
    /*
      333
      22
      1
    */
   System.out.println("pattern 2");
   for(i=3;i>0;i--)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(i);
      }
      System.out.println();
    } 
/* Inverted Right half pyramid pattern
   4444
    333
     22
     1
*/
System.out.println("Inverted Right half pyramid pattern ");
   for(i=n;i>0;i--) {
       for(k = 1;k<=(n - i);k++) 
         System.out.print(" ");
      for(j =1;j<=i;j++) {
         System.out.print( i);
      }
      System.out.println();
   }
   System.out.println();
}
        
}


    