import java.util.Scanner;

public class Stringex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

         if (!sentence.matches("[a-zA-Z ]+")) {
            System.out.println("Error.");
            return;
        }

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate over each word and process it
        for (String word : words)
         {
            if (word.length() % 2 == 0) 
            {
                    String str = word.toLowerCase();
                    String vowels = "aeiou";
                    int count = 0;
                    for (int i = 0;i<vowels.length(); i++)
                     {
                        char ch = vowels.charAt(i);
                        if (str.indexOf(ch) != -1) 
                        {
                            // Check if the vowel exists in the word and count it
                            count++;
                        }
                    }
                System.out.println("Word: " + word + " - Unique vowels: " + count);
         }
          else {
                 String str = word.toLowerCase();
                String ch = "bcdfghjklmnpqrstvwxyz";
                int count = 0;
                for (int i = 0; i < ch.length(); i++) 
                {
                    char ch1 = ch.charAt(i);
                    if (str.indexOf(ch1) != -1)
                     {
                        // Check if the consonant exists in the word and count it
                        count++;
                     }
                 }
               System.out.println("Word: " + word + " - Unique consonants: " + count);
            }
        }
    }
}
