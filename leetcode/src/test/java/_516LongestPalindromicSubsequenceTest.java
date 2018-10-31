import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/2/18.
 */
public class _516LongestPalindromicSubsequenceTest {

    @Test
    public void testLongestPalindromeSubseq() throws Exception {
        assertEquals(4, new _516LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
        assertEquals(2, new _516LongestPalindromicSubsequence().longestPalindromeSubseq("cbbd"));
    }
}