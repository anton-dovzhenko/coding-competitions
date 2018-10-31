import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 3/2/17.
 */
public class _349IntersectionOfTwoArraysTest {
    @Test
    public void intersection() throws Exception {
        assertArrayEquals(new int[] {2}, new _349IntersectionOfTwoArrays().intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}));
    }

}