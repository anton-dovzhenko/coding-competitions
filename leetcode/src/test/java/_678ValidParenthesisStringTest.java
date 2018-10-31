import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 16/7/18.
 */
public class _678ValidParenthesisStringTest {

    @Test
    public void testCheckValidString() {
        assertTrue(new _678ValidParenthesisString().checkValidString("()"));
        assertTrue(new _678ValidParenthesisString().checkValidString("(*)"));
        assertTrue(new _678ValidParenthesisString().checkValidString("(*))"));
        assertFalse(new _678ValidParenthesisString().checkValidString("((*))))"));
        assertFalse(new _678ValidParenthesisString().checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
        assertFalse(new _678ValidParenthesisString().checkValidString("((*)(*))((*"));
    }

    @Test
    public void testCheckValidString2() {
        assertTrue(new _678ValidParenthesisString().checkValidString2("()"));
        assertTrue(new _678ValidParenthesisString().checkValidString2("(*)"));
        assertTrue(new _678ValidParenthesisString().checkValidString2("(*))"));
        assertFalse(new _678ValidParenthesisString().checkValidString2("((*))))"));
        assertFalse(new _678ValidParenthesisString().checkValidString2("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
        assertFalse(new _678ValidParenthesisString().checkValidString2("*((*"));
    }

}