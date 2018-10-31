import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 7/10/17.
 */
public class _191Numberof1BitsTest {

    @Test
    public void testHammingWeight() throws Exception {
        assertEquals(3, new _191Numberof1Bits().hammingWeight(11));
        assertEquals(1, new _191Numberof1Bits().hammingWeight((int) 2147483648L));
    }
}