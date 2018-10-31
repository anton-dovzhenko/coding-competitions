import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/5/18.
 */
public class _812LargestTriangleAreaTest {

    @Test
    public void largestTriangleArea() throws Exception {
        assertEquals(2d, new _812LargestTriangleArea().largestTriangleArea(
                new int[][] {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}), 1e-6);
    }

}