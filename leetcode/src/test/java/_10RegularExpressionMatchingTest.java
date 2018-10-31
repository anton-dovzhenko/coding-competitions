import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/9/18.
 */
public class _10RegularExpressionMatchingTest {
    @Test
    public void isMatch() throws Exception {
        assertFalse(new _10RegularExpressionMatching().isMatch("aa", "a"));
        assertTrue(new _10RegularExpressionMatching().isMatch("aa", "a*"));
        assertTrue(new _10RegularExpressionMatching().isMatch("ab", ".*"));
        assertTrue(new _10RegularExpressionMatching().isMatch("aab", "c*a*b"));
        assertFalse(new _10RegularExpressionMatching().isMatch("mississippi", "mis*is*p*."));
        assertFalse(new _10RegularExpressionMatching().isMatch("ab", ".*c"));
        assertTrue(new _10RegularExpressionMatching().isMatch("aaa", "ab*ac*a"));
        assertTrue(new _10RegularExpressionMatching().isMatch("a", "ab*"));
        assertTrue(new _10RegularExpressionMatching().isMatch("", ".*"));
        assertFalse(new _10RegularExpressionMatching().isMatch("", ".*a"));
        assertFalse(new _10RegularExpressionMatching().isMatch("", "."));
    }

}