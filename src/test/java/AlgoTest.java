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
        assertEquals("Reversed {NULL} is {NULL}", null, Algo.revString(null));
        assertEquals("Reversed '' is ''", "", Algo.revString(""));
        assertEquals("Reversed abcde is edcba", "edcba", Algo.revString("abcde"));
        assertEquals("Reversed abcde is dcba", "dcba", Algo.revString("abcd"));
    }

}