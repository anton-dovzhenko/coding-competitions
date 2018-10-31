import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 7/10/17.
 */
public class _190ReverseBitsTest {

    @Test
    public void testReverseBits() throws Exception {
        assertEquals(964176192, new _190ReverseBits().reverseBits(43261596));
        assertEquals( (int) 2147483648L, new _190ReverseBits().reverseBits(1));
    }
}