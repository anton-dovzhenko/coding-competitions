import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/11/17.
 */
public class _696CountBinarySubstringsTest {

    @Test
    public void testCountBinarySubstrings() throws Exception {
        assertEquals(6, new _696CountBinarySubstrings().countBinarySubstrings("00110011"));
        assertEquals(4, new _696CountBinarySubstrings().countBinarySubstrings("10101"));
        assertEquals(2, new _696CountBinarySubstrings().countBinarySubstrings("00100"));
    }
}