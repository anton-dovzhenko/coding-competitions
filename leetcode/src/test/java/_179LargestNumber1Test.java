import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/3/17.
 */
public class _179LargestNumber1Test {
    @Test
    public void largestNumber() throws Exception {
        assertEquals("9534330", new _179LargestNumber().largestNumber(new int[] {3, 30, 34, 5, 9}));
        assertEquals("12121", new _179LargestNumber().largestNumber(new int[] {121, 12}));
    }

}