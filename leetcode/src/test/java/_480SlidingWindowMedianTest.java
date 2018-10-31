import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/2/18.
 */
public class _480SlidingWindowMedianTest {

    @Test
    public void testMedianSlidingWindow() throws Exception {
//        assertArrayEquals(new double[] {1.0, -1.0, -1.0, 3.0, 5.0, 6.0}
//                , new _480SlidingWindowMedian().medianSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3), 1e-6);
        assertArrayEquals(new double[] {8.0, 3.5, 1.5, 6.0, 8.5, 7.0, 5.5, 6.0, 6.5}
                , new _480SlidingWindowMedian().medianSlidingWindow(new int[] {9,7,0,3,9,8,6,5,7,6}, 2), 1e-6);
    }
}