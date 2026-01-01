// 1)Two strings are isomorphic if characters in the first string can be replaced to
//  get the second string, with a one-to-one mapping.

// 2)Each character must map to only one character.
// Input:  s = "egg", t = "add"
// Output: true

// Input:  s = "foo", t = "bar"
// Output: false

// Input:  s = "paper", t = "title"
// Output: true


public class IsomorphicString {
    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        boolean isIsomorphic = true;

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                isIsomorphic = false;
                break;
            }

            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }

        System.out.println(isIsomorphic);
    }
}
