import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 18/4/18.
 */
public class _151ReverseWordsinStringTest {

    @Test
    public void testReverseWords() throws Exception {
        assertEquals("blue is sky the", new _151ReverseWordsinString().reverseWords("the sky is blue"));
        assertEquals("1", new _151ReverseWordsinString().reverseWords(" 1"));
        assertEquals("1", new _151ReverseWordsinString().reverseWords("1 "));
        assertEquals("b a", new _151ReverseWordsinString().reverseWords("  a    b   "));
    }
}