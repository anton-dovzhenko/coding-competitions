import org.junit.Test;

import static org.junit.Assert.*;

public class _32LongestValidParenthesesTest {

    @Test
    public void longestValidParentheses() {
        assertEquals(2, new _32LongestValidParentheses().longestValidParentheses("(()"));
        assertEquals(4, new _32LongestValidParentheses().longestValidParentheses(")()())"));
        assertEquals(6, new _32LongestValidParentheses().longestValidParentheses(")((()))))(("));
    }
}