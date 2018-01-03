import static org.junit.Assert.*;

/**
 * Created by vkostylev on 25/07/2017.
 */
public class AlgoTest {
    @org.junit.Test
    public void allUniqueChars() throws Exception {
        assertTrue(Algo.allUniqueChars("abcdefg"));
        assertFalse(Algo.allUniqueChars("abcc"));
        assertFalse(Algo.allUniqueChars("abbc"));
        assertFalse(Algo.allUniqueChars("aabc"));
        assertFalse(Algo.allUniqueChars(null));
        assertFalse(Algo.allUniqueChars(""));
        assertTrue(Algo.allUniqueChars("a"));
    }

    @org.junit.Test
    public void reverseString() throws Exception {
        assertEquals("Reversed a is a", "a", Algo.revString("a"));
        assertEquals("Reversed NULL is NULL", null, Algo.revString(null));
        assertEquals("Reversed '' is ''", "", Algo.revString(""));
        assertEquals("Reversed abcde is edcba", "edcba", Algo.revString("abcde"));
        assertEquals("Reversed abcde is dcba", "dcba", Algo.revString("abcd"));
    }

    @org.junit.Test
    public void removeDuplicates() throws Exception {
        assertEquals("RMDuplicates: abccdbfg is abcdfg", "abcdfg", Algo.rmDuplicateChars("abccdbfg"));
        assertEquals("RMDuplicates: NULL is NULL", null, Algo.rmDuplicateChars(null));
        assertEquals("RMDuplicates: a is a", "a", Algo.rmDuplicateChars("a"));
        assertEquals("RMDuplicates: aaaaaaaaaaaaaaaaaa is a", "a", Algo.rmDuplicateChars("aaaaaaaaaaaaaaaaaa"));
        assertEquals("RMDuplicates: aaaaaaaaaaaaaaaaac is ac", "ac", Algo.rmDuplicateChars("aaaaaaaaaaaaaaaaaac"));
        assertEquals("RMDuplicates: caaaaaaaaaaaaaaaaa is ca", "ca", Algo.rmDuplicateChars("caaaaaaaaaaaaaaaaa"));
        assertEquals("RMDuplicates: caaaaaaaaaaaaaaaaac is ca", "ca", Algo.rmDuplicateChars("caaaaaaaaaaaaaaaaac"));
        assertEquals("RMDuplicates: aaaaaaaaabaaaaaaaa is ab", "ab", Algo.rmDuplicateChars("aaaaaaaaabaaaaaaaa"));
    }

    @org.junit.Test
    public void anagram() throws Exception {
        assertFalse(Algo.isAnagram("",""));
        assertTrue(Algo.isAnagram("abch","hacb"));
        assertFalse(Algo.isAnagram("abcc","abcd"));
        assertFalse(Algo.isAnagram(null,null));
        assertFalse(Algo.isAnagram("abchf","hacb"));
        assertTrue(Algo.isAnagram("f","f"));
        assertFalse(Algo.isAnagram("g","b"));
    }

    @org.junit.Test
    public void replaceCharWithString() throws Exception {
        assertEquals("Rm '_' with '!UNDERSCORE!' ", "ab!UNDERSCORE!cd!UNDERSCORE!g",
                Algo.replaceCharWithString("ab_cd_g",'_',"!UNDERSCORE!"));

    }

    @org.junit.Test
    public void fizzBuzz() throws Exception {
        assertEquals("3 % 3 == 0", "fizz",
                Algo.fizzBuzz(3));
        assertEquals("5 % 5 == 0", "buzz",
                Algo.fizzBuzz(5));
        assertEquals("6 % 3 == 0", "fizz",
                Algo.fizzBuzz(6));
        assertEquals("10 % 5 == 0", "buzz",
                Algo.fizzBuzz(10));
        assertEquals("33 % 3 == 0", "fizz",
                Algo.fizzBuzz(33));
        assertEquals("25 % 5 == 0", "buzz",
                Algo.fizzBuzz(25));
        assertEquals("15 % 3 == 0 && 15 % 5 == 0", "fizzbuzz",
                Algo.fizzBuzz(15));
        assertEquals("45 % 3 == 0 && 45 % 5 == 0", "fizzbuzz",
                Algo.fizzBuzz(45));
        assertEquals("0 is not allowed", null,
                Algo.fizzBuzz(0));
        assertEquals("1 % 3 != 0 && 1 % 5 != 0", "1",
                Algo.fizzBuzz(1));



    }


}