import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/9/18.
 */
public class _310MinimumHeightTreesTest {
    @Test
    public void findMinHeightTrees() throws Exception {
        assertEquals(Arrays.asList(1), new _310MinimumHeightTrees().findMinHeightTrees(4, new int[][] {{1, 0}, {1, 2}, {1, 3}}));
    }

}