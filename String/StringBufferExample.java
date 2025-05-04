public class StringBufferExample 
{
    public static void main(String[] args) {
       // Creating StringBuffer using Constructor

        StringBuffer s= new StringBuffer();
        System.out.println("Capacity: " + s.capacity());  // 16 (default capacity)
        s.append(" Java");
        System.out.println("Capacity: " + s.capacity()); 
        s.append(" Java Programming java ");
        System.out.println("Length: " + s.length());
        System.out.println("Capacity: " + s.capacity()); 




        StringBuffer s1= new StringBuffer(100);
        System.out.println("Capacity: " + s1.capacity());
    

        StringBuffer s2 = new StringBuffer("Hello");
        System.out.println("Capacity: " + s2.capacity()); 

         // Appending to the StringBuffer
        s2.append(" World");
        System.out.println(s2); 
        System.out.println("Capacity: " + s2.capacity());
        System.out.println("Length: " + s2.length());

    
        // Inserting a substring
        s2.insert(6, "Java ");
        System.out.println(s2);  

    // Setting a character at specific index
        s2.setCharAt(0, 'H');
        System.out.println(s2);
        
        // Deleting a substring
        s2.delete(6, 10);  
        System.out.println(s2); 
        
        //Delete a character at a index
        System.out.println("deleteCharAt() "+s2.deleteCharAt(4));

        //Print a character at given index
        System.out.println("charAt(index) "+s2.charAt(2));

        System.out.println("indexOf(): "+ s2.indexOf("Hello"));

        //Equals()
        System.out.println("Equals() "+s1.equals(s2));

        
        // Reversing the StringBuffer
        s2.reverse();
        System.out.println(s2);
        
        // Replacing a part of the string
        s2.replace(0, 5, "Hola");
        System.out.println(s2);   
    
        
        // Converting StringBuffer to String
        String str = s2.toString();
        System.out.println("String: " + str);  

        s2.setLength(3);
        System.out.println(s2);
        System.out.println(s2.append("10"));
        
    
    }
}


// int left = 0;
//         int right = str.length() - 1;
//         
//         // Compare characters from both ends
//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;  // Not a palindrome if characters don't match
//             }
//             left++;
//             right--;
//         }