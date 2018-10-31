package gcj2016.round1a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 14/1/17.
 */
public class CBFFsTest {

    @Test
    public void getMaxCircleSize() throws Exception {
        assertEquals(4, CBFFs.getMaxCircleSize(4, new int[] {2, 3, 4, 1}));
        assertEquals(3, CBFFs.getMaxCircleSize(4, new int[] {3, 3, 4, 1}));
        assertEquals(3, CBFFs.getMaxCircleSize(4, new int[] {3, 3, 4, 3}));
        assertEquals(6, CBFFs.getMaxCircleSize(10, new int[] {7, 8, 10, 10, 9, 2, 9, 6, 3, 3}));
    }

}