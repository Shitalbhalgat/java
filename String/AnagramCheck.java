// An anagram is when two strings contain the same characters with the same
// frequency, but in a different order.
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}
