import org.junit.Test;

import static org.junit.Assert.*;

public class _3034NumberOfSubarraysThatMatchPatternITest {

    @Test
    public void countMatchingSubarrays() {
        assertEquals(4, new _3034NumberOfSubarraysThatMatchPatternI().
                countMatchingSubarrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 1}));
        assertEquals(2, new _3034NumberOfSubarraysThatMatchPatternI().
                countMatchingSubarrays(new int[]{1, 4, 4, 1, 3, 5, 5, 3}, new int[]{1, 0, -1}));
    }

}