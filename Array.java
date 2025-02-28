class Array {
 public static void main(String[] args) 
 {
  // Declare an array with literals
     int[] roll = {1,2,3,4,5,6};
  // declare an array and create an array
    int[] a = new int[5];

      // initialize array
      a[0]=12;
      a[1]=4;
      a[2]=5;
      a[3]=10;
      a[4]=20;

   // access each array elements
   System.out.println("Accessing Elements of Array:");
   System.out.println(a);
   System.out.println("First Element: " + a[0]);
   System.out.println("Second Element: " + a[1]);
   System.out.println("Third Element: " + a[2]);
   System.out.println("Fourth Element: " + a[3]);
   System.out.println("Fifth Element: " + a[4]);
 
 // loop through the array using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i <a.length; i++) 
        {
          System.out.println(a[i]);
        }


 // loop through the array using for each  loop
   System.out.println("Using for-each Loop:");
   for(int a1 : a)
    {
     System.out.println(a1);
   }
}
}