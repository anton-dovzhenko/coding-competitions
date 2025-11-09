import org.junit.Test;

import static org.junit.Assert.*;

public class _3742_MaximumPathScoreInAGridTest {

    @Test
    public void maxPathScore() {
        assertEquals(2, new _3742_MaximumPathScoreInAGrid().maxPathScore(new int[][] {{0, 1}, {2, 0}}, 1));
        assertEquals(-1, new _3742_MaximumPathScoreInAGrid().maxPathScore(new int[][] {{0, 1}, {1, 2}}, 1));
        assertEquals(0, new _3742_MaximumPathScoreInAGrid().maxPathScore(new int[1000][1000], 0));
    }
}