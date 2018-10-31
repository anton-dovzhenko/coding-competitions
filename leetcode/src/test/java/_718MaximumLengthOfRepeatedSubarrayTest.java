import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 23/4/18.
 */
public class _718MaximumLengthOfRepeatedSubarrayTest {

    @Test
    public void testFindLength() throws Exception {
        assertEquals(3, new _718MaximumLengthOfRepeatedSubarray().findLength(
                new int[] {1,2,3,2,1}, new int[] {3,2,1,4,7}));
//        assertEquals(5, new _718MaximumLengthOfRepeatedSubarray().findLength(
//                new int[] {0, 0, 0, 0, 0}, new int[] {0, 0, 0, 0, 0}));
    }
}