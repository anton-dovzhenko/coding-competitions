import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/7/17.
 */
public class _541ReverseStringIITest {

    @Test
    public void testReverseStr() throws Exception {
        assertEquals("bacdfeg", new _541ReverseStringII().reverseStr("abcdefg", 2));
        assertEquals("gfedcba", new _541ReverseStringII().reverseStr("abcdefg", 8));
    }

    @Test
    public void testReverse() throws Exception {

    }
}