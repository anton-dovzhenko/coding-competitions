import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/1/17.
 */
public class _7ReverseIntegerTest {

    @Test
    public void reverse() throws Exception {
        assertEquals(321, new _7ReverseInteger().reverse(123));
        assertEquals(-123, new _7ReverseInteger().reverse(-321));
        assertEquals(0, new _7ReverseInteger().reverse(1534236469));
        assertEquals(0, new _7ReverseInteger().reverse(-2147483647));
        assertEquals(0, new _7ReverseInteger().reverse(-2147483648));
    }

}