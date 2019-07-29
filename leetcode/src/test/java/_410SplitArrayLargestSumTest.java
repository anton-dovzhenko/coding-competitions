import org.junit.Test;

import static org.junit.Assert.*;

public class _410SplitArrayLargestSumTest {

    @Test
    public void splitArray() {
        assertEquals(18, new _410SplitArrayLargestSum().splitArray(new int[] {7,2,5,10,8}, 2));
        assertEquals(2147483647, new _410SplitArrayLargestSum().splitArray(new int[] {1, 2147483646}, 1));
        assertEquals(2147483647, new _410SplitArrayLargestSum().splitArray(new int[] {1, 2147483647}, 2));
    }

}