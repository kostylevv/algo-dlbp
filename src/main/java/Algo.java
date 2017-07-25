import java.util.Arrays;

/**
 * Created by vkostylev on 25/07/2017.
 */
public class Algo {

    public static void main(String[] args) {

    }

    /**  CCI 1.1
     Implement an algorithm to determine if a string has all unique characters.
     What if you can not use additional data structures?

     Solution below assume that charset is ASCII
     **/
    public static boolean allUniqueChars(String str) {
        if (str == null || str.length() == 0) return false;
        if (str.length() == 1) return true;

        boolean[] match = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (match[val] == true) return false;
            match[val] = true;
        }
        return true;
    }

    /**  CCI 1.2
     Write code to reverse a C-Style String.
     (C-String means that “abcd” is represented as
     five characters, including the null character.)
     **/
    public static String revString(String s) {
        if (s == null) return null;
        if (s.length() <= 1) return s;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = tmp;
        }

        return new String(chars);
    }

    /** CCI 1.3
     Design an algorithm and write code to remove the duplicate characters
     in a string without using any additional bu er.
     NOTE: One or two additional variables are ok.
     An extra copy of the array is not.
     **/
    public static String rmDuplicateChars(String str) {
        if (str == null) return null;
        if (str.length() <= 1) return str;

        char[] s = str.toCharArray();
        int len = s.length;
        int tail = 1; //tail of already found characters part of the string


        for (int i = 1; i < len; ++i) { //loop through all characters
            int j;
            for (j = 0; j < tail; ++j) {  //compare current character with
                // all found characters
                if (s[i] == s[j]) break; // if it was already found - skip it
            }
            if (j == tail) { //if we are hear, this char wasn't found previously
                // so we add it to the appropriate part of the string
                // and adjust tail accordingly
                s[tail] = s[i];
                ++tail;
            }


        }

        return new String(Arrays.copyOf(s, tail));
    }
}
