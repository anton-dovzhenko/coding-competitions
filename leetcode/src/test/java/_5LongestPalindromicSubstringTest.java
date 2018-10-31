import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/2/17.
 */
public class _5LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() throws Exception {
        assertEquals("bab", new _5LongestPalindromicSubstring().longestPalindrome("babad"));
        assertEquals("bb", new _5LongestPalindromicSubstring().longestPalindrome("cbbd"));
        assertEquals("bb", new _5LongestPalindromicSubstring().longestPalindrome("cdbb"));
        assertEquals("bb", new _5LongestPalindromicSubstring().longestPalindrome("bbcd"));
        assertEquals("aba", new _5LongestPalindromicSubstring().longestPalindrome("aba"));
        assertEquals("babab", new _5LongestPalindromicSubstring().longestPalindrome("babab"));
        assertEquals("ccc", new _5LongestPalindromicSubstring().longestPalindrome("ccc"));
        assertEquals("ccccc", new _5LongestPalindromicSubstring().longestPalindrome("ccccc"));
        assertEquals("aaaa", new _5LongestPalindromicSubstring().longestPalindrome("aaaa"));
        assertEquals("aaaaaa", new _5LongestPalindromicSubstring().longestPalindrome("aaaaaa"));
    }

}