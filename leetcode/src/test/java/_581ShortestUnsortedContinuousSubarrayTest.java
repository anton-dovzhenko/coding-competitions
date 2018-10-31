import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 19/5/17.
 */
public class _581ShortestUnsortedContinuousSubarrayTest {
    @Test
    public void findUnsortedSubarray() throws Exception {
        assertEquals(5, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
        assertEquals(8, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15, 1}));
        assertEquals(0, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {1, 2, 3}));
        assertEquals(2, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {2, 1}));
        assertEquals(4, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {1,3,2,2,2}));
        assertEquals(2, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {1,3,2,3,3}));
        assertEquals(5, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {2,1,1,1,1}));
        assertEquals(3, new _581ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] {1,2,5,3,4}));
    }

}