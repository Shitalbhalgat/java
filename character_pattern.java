public class character_pattern {

    public static void main(String[] args) {
        /* 
    left half pyramid
    A 
    B B
    C C C
    D D D D
    E E E E E
    */	
   int i,j,n=5,k;
   char ch='A';
  System.out.println("Left half pyramid pattern");
   for (i=0;i<n;i++) {
       for (j = 0; j <= i; j++) {
          System.out.print(ch+" ");
       }
     System.out.println();
       ch++;
   }
   /* 
   left half pyramid
       A
       B C
       D E F
       G H I J
       K L M N O
   */	
  ch='A';
 System.out.println();
  System.out.println("Left half pyramid pattern 2");
   for (i=0;i<n;i++) {
       for (j = 0; j <= i; j++) 
       {
          System.out.print(ch+" ");
           ch++;
       }
       System.out.println();
       
   }
   /*
   Inverted left half pyramid pattern
       A A A A A
       B B B B
       C C C
       D D
       E
   */
   ch='A';
  System.out.println();
  System.out.println("Inverted left half pyramid pattern" );
  for(i=1; i<=n; i++)
  {
   for(j=i; j<=n; j++)
   {
    System.out.print(ch+" ");
    }
    ch++;
 System.out.println();
}
/*
   Right half pyramid pattern
        A
       BB
      CCC
     DDDD
    EEEEE
   */
   ch='A';
  System.out.println();
  System.out.println("Right half pyramid pattern ");
  for(i = 1;i <= n;i++) {
        for(k = 1;k<=(n-i);k++) 
        System.out.print(" ");
     for(j =1;j<=i;j++) {
       System.out.print(ch);
     }
     ch++;
     System.out.println();
  }
 System.out.println();
/* Inverted Right half pyramid pattern
  AAAAA
   BBBB
    CCC
     DD
      E
*/
ch='A';
System.out.println("Inverted Right half pyramid pattern ");
  for(i=n;i>0;i--) {
      for(k = 1;k<=(n - i);k++) 
        System.out.print(" ");
     for(j =1;j<=i;j++) {
        System.out.print(ch);
     }
     ch++;
     System.out.println();
  }
 System.out.println();
  /*
    pyramid pattern
        A
       B B
      C C C
     D D D D
    E E E E E
   */
   ch='A';
  System.out.println(" pyramid pattern ");
  for(i = 1;i <= n;i++) {
        for(k = 1;k<=(n-i);k++) 
        System.out.print( " ");
     for(j =1;j<=i;j++) {
       System.out.print(ch+" ");
     }
     ch++;
     System.out.println();
  }
}
}

    