import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/11/17.
 */
public class _713SubarrayProductLessThanKTest {

    @Test
    public void testNumSubarrayProductLessThanK() throws Exception {
        assertEquals(8, new _713SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));
    }
}