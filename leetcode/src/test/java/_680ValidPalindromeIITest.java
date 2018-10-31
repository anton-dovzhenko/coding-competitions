import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 11/11/17.
 */
public class _680ValidPalindromeIITest {

    @Test
    public void testValidPalindrome() throws Exception {
        assertTrue(new _680ValidPalindromeII().validPalindrome("aba"));
        assertTrue(new _680ValidPalindromeII().validPalindrome("abca"));
        assertFalse(new _680ValidPalindromeII().validPalindrome("abc"));
        assertTrue(new _680ValidPalindromeII().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}