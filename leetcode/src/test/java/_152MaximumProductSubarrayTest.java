import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 25/9/17.
 */
public class _152MaximumProductSubarrayTest {

    @Test
    public void testMaxProduct() throws Exception {
        assertEquals(12, new _152MaximumProductSubarray().maxProduct(new int[] {-4, -3, -2}));
    }
}