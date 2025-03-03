import java.util.Scanner;

class MultidimensionalArray {
    public static void main(String[] args) {
//      // create a 2d array
//         int[][] a = {
//             {1, 2, 3}, 
//             {4, 5, 6, 9}, 
//             {7}, 
//         };
//  
//         System.out.println("Address of a: "+a);
//         System.out.println("Address of a[0] : "+a[0]);
//    
//        // calculate the length of each row
//         System.out.println("Length of row 1: " + a[0].length);
//         System.out.println("Length of row 2: " + a[1].length);
//         System.out.println("Length of row 3: " + a[2].length);
// 
//         //Iterating an array
//         for (int i = 0; i < a.length; ++i) {
//             for(int j = 0; j < a[i].length; ++j) {
//                 System.out.print(a[i][j]);
//             }
//             System.out.println();
//         }
//         //first for...each loop access the individual array inside the 2d array
//         for (int[] innerArray: a) {
//             // second for...each loop access each element inside the row
//             for(int data: innerArray) {
//                 System.out.print(data);
//             }
//             System.out.println();
//         }
//     }
// }


// Java program to demonstrate 2-D jagged array such that first row has 1 element, second row has two elements and so on

//         int r = 5;
// 
//         // Declaring 2-D array with 5 rows
//         int arr[][] = new int[r][];
// 
//         // Creating a 2D array such that first row  has 1 element, second row has two elements and so on
//         for (int i = 0; i < arr.length; i++)
//         
//             arr[i] = new int[i+1];
// 
//         // Initializing array
//         int count = 0;
//         for (int i = 0; i < arr.length; i++)
//             for (int j = 0; j < arr[i].length; j++)
//                 arr[i][j] = count++;
// 
//         // Displaying the values of 2D Jagged array
//         System.out.println("Contents of 2D Jagged Array");
//       
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++)
//                 System.out.print(arr[i][j] + " ");
//             System.out.println();
//         }
//     }
// }


        int arr[][] = new int[2][];
         Scanner sc=new Scanner(System.in);
         int n;
        // Creating a 2D array such that first row  has 1 element, second row has two elements and so on
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter a number of array element for each row");
            n=sc.nextInt();
            arr[i] = new int[n];
        }
        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
  System.out.println("Enter a array elements for row"+i);
         arr[i][j]=sc.nextInt();
        
            }
        }
                

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
