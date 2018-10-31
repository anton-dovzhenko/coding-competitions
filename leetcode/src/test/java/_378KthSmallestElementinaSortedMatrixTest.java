import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/3/18.
 */
public class _378KthSmallestElementinaSortedMatrixTest {

    @Test
    public void testKthSmallest() throws Exception {
        assertEquals(13, new _378KthSmallestElementinaSortedMatrix().kthSmallest(new int[][]
                {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
    }
}