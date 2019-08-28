import org.junit.Test;

import static org.junit.Assert.*;

public class _239SlidingWindowMaximumTest {

    @Test
    public void maxSlidingWindow() {
        assertArrayEquals(new int[] {3,3,5,5,6,7}
        , new _239SlidingWindowMaximum().maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3));
    }
}