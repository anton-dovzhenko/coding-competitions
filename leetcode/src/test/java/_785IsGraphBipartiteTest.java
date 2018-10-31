import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/9/18.
 */
public class _785IsGraphBipartiteTest {
    @Test
    public void isBipartite() throws Exception {
        assertTrue(new _785IsGraphBipartite().isBipartite(new int[][] {{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
        assertFalse(new _785IsGraphBipartite().isBipartite(new int[][] {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
    }

}