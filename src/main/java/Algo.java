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
}
