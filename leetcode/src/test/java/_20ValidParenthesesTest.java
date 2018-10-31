import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/1/17.
 */
public class _20ValidParenthesesTest {
    @Test
    public void isValid() throws Exception {
        assertTrue(new _20ValidParentheses().isValid("()[]{}"));
        assertTrue(new _20ValidParentheses().isValid("([{}])"));
        assertTrue(new _20ValidParentheses().isValid("([{}(())[[]]({})])"));
        assertFalse(new _20ValidParentheses().isValid("(]"));
        assertFalse(new _20ValidParentheses().isValid("([)]"));
    }

}