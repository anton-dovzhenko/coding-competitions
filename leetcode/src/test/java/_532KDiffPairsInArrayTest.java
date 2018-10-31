import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/3/17.
 */
public class _532KDiffPairsInArrayTest {
    @Test
    public void findPairs() throws Exception {
        assertEquals(2, new _532KDiffPairsInArray().findPairs(new int[] {3, 1, 4, 1, 5}, 2));
        assertEquals(4, new _532KDiffPairsInArray().findPairs(new int[] {1, 2, 3, 4, 5}, 1));
        assertEquals(1, new _532KDiffPairsInArray().findPairs(new int[] {1, 3, 1, 5, 4}, 0));
    }

}