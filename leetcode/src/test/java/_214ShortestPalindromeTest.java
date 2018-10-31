import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/10/18.
 */
public class _214ShortestPalindromeTest {
    @Test
    public void shortestPalindrome() throws Exception {
        assertEquals("aaacecaaa", new _214ShortestPalindrome().shortestPalindrome0("aacecaaa"));
        assertEquals("dcbabcd", new _214ShortestPalindrome().shortestPalindrome0("abcd"));
    }

}