import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _84LargestRectangleInHistogramTest {

    @Test
    public void largestRectangleArea() {
        Assert.assertEquals(10, new _84LargestRectangleInHistogram().largestRectangleArea(
                new int[] {2, 1, 5, 6, 2, 3}));
        Assert.assertEquals(3, new _84LargestRectangleInHistogram().largestRectangleArea(
                new int[] {2, 1, 2}));
    }
}