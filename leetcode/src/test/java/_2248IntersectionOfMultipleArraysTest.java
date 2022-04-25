import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class _2248IntersectionOfMultipleArraysTest {

    @Test
    public void intersection() {
        Assert.assertEquals(Arrays.asList(3, 4),
                new _2248IntersectionOfMultipleArrays().intersection(
                        new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));
    }

}