import org.junit.Test;

import static org.junit.Assert.*;

public class _3740_MinimumDistanceBetweenThreeEqualElementsITest {

    @Test
    public void minimumDistance() {
        assertEquals(6, new _3740_MinimumDistanceBetweenThreeEqualElementsI().minimumDistance(new int[]{1, 2, 1, 1, 3}));
        assertEquals(8, new _3740_MinimumDistanceBetweenThreeEqualElementsI().minimumDistance(new int[]{1, 1, 2, 3, 2, 1, 2}));
        assertEquals(-1, new _3740_MinimumDistanceBetweenThreeEqualElementsI().minimumDistance(new int[]{1}));
    }
}