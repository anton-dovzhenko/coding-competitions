import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 20/7/17.
 */
public class _69SqrtTest {

    @Test
    public void testMySqrt() throws Exception {
        assertEquals(4, new _69Sqrt().mySqrt(16));
        assertEquals(46340, new _69Sqrt().mySqrt(2147395599));
        assertEquals(1, new _69Sqrt().mySqrt(2));
    }
}