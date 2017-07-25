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

}