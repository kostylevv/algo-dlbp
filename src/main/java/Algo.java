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
        boolean[] match = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println(val);
            if (match[val] == true) return false;
            match[val] = true;
        }
        return true;
    }
}
