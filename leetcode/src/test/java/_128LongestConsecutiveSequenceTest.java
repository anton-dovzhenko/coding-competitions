import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 27/8/17.
 */
public class _128LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutive() throws Exception {
        assertEquals(4, new _128LongestConsecutiveSequence().longestConsecutive2(new int[] {100,4,200,1,3,2}));
//        assertEquals(1, new _128LongestConsecutiveSequence().longestConsecutive(new int[] {0}));
    }
}