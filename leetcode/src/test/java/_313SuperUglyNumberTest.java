import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 22/10/17.
 */
public class _313SuperUglyNumberTest {

    @Test
    public void testNthSuperUglyNumber() throws Exception {
        _313SuperUglyNumber number = new _313SuperUglyNumber();
        assertEquals(12, number.nthSuperUglyNumber(32, new int[] {2, 7, 13, 19}));
        assertEquals(2, number.nthSuperUglyNumber(3, new int[] {2}));


    }
}