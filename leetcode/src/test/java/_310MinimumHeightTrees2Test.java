import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/9/18.
 */
public class _310MinimumHeightTrees2Test {
    @Test
    public void findMinHeightTrees() throws Exception {
        assertEquals(Arrays.asList(1), new _310MinimumHeightTrees2().findMinHeightTrees(4, new int[][] {{1, 0}, {1, 2}, {1, 3}}));
        assertEquals(Arrays.asList(3, 4), new _310MinimumHeightTrees2().findMinHeightTrees(6
                , new int[][] {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}}));
    }

}