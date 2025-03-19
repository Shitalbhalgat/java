import java.util.Scanner;

public class Stringex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("enter a word: ");
        String word = scanner.nextLine();


        word = word.toLowerCase();

        // Validate that the word contains only alphabetic characters
        if (!word.matches("[a-z]+")) {
            System.out.println("Error");
            return;
        }


for (int i = 0; i < word.length(); i++)
{
   char curchar = word.charAt(i);

   // Skip this character if it has already been counted
   if (word.indexOf(curchar, i + 1) != -1) {
    System.out.println(word.indexOf(curchar, i + 1));
       continue;
   }

   // Count occurrences of the current character
   int count = 0;
   for (int j = 0; j < word.length(); j++) 
   {

       if (word.charAt(j) == curchar) 
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
