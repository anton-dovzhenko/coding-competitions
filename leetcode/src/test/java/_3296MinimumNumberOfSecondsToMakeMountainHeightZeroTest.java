import org.junit.Test;

import static org.junit.Assert.*;

public class _3296MinimumNumberOfSecondsToMakeMountainHeightZeroTest {

    @Test
    public void minNumberOfSeconds() {
        assertEquals(3, new _3296MinimumNumberOfSecondsToMakeMountainHeightZero().minNumberOfSeconds(4, new int[] {2, 1, 1}));
        assertEquals(12, new _3296MinimumNumberOfSecondsToMakeMountainHeightZero().minNumberOfSeconds(10, new int[] {3, 2, 2, 4}));
        assertEquals(15, new _3296MinimumNumberOfSecondsToMakeMountainHeightZero().minNumberOfSeconds(5, new int[] {1}));
    }
}