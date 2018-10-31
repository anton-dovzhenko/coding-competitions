import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 23/4/18.
 */
public class _209MinimumSizeSubarraySumTest {

    @Test
    public void testMinSubArrayLen() throws Exception {
        assertEquals(2, new _209MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        assertEquals(2, new _209MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}