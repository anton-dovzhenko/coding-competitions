import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/6/18.
 */
public class _852PeakIndexinaMountainArrayTest {
    @Test
    public void peakIndexInMountainArray() throws Exception {
        assertEquals(1, new _852PeakIndexinaMountainArray().peakIndexInMountainArray(new int[] {0, 1, 0}));
        assertEquals(1, new _852PeakIndexinaMountainArray().peakIndexInMountainArray(new int[] {0, 2, 1, 0}));
    }

}