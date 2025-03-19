import java.util.Scanner;

public class Stringex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a username: ");
        String username = scanner.nextLine();

      if (username.length()<2 || username.length() > 10 || !username.matches("[a-zA-Z ]+")) {
            System.out.println("Error.");
            return;  
        }

   
        username = username.toLowerCase();

        // Calculate the ASCII average character of the username
        int asciiSum = 0;
        for (int i = 0; i < username.length(); i++) 
        {
            asciiSum =asciiSum+username.charAt(i); 
           
        }
        char avg = (char) (asciiSum / username.length()); 
// 
//          Count the occurrences of each character in the username
//         int[] charCount = new int[256];  // Array to store the count of characters (based on ASCII values)
//         for (int i = 0; i < username.length(); i++) {
//             charCount[username.charAt(i)]++;  // Increment the count for the character
//         }
// 
//          Print the character counts followed by the ASCII average character
//         System.out.println("Character counts:");
//         for (int i = 0; i < 256; i++) {
//             if (charCount[i] > 0) {
//                 System.out.println("Character '" + (char) i + "' appears " + charCount[i] + " time(s).");
//             }
//         }
// 
//         System.out.println("ASCII average character: " + avg);
//     }
// }

for (int i = 0; i < username.length(); i++)
{
   char curchar = username.charAt(i);

   // Skip this character if it has already been counted
   if (username.indexOf(curchar, i + 1) != -1) {
       continue;
   }

   // Count occurrences of the current character
   int count = 0;
   for (int j = 0; j < username.length(); j++) 
   {

       if (username.charAt(j) == curchar) 
       {
           count++;
       }
   }
   
   // Print the count for the current character
   System.out.println("Character '" + curchar + "' appears " + count + " times.");
}
//
    }
}

