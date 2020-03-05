import org.junit.Test;

import static org.junit.Assert.*;

public class _63UniquePathsIITest {

    @Test
    public void uniquePathsWithObstacles() {
        assertEquals(2, new _63UniquePathsII().uniquePathsWithObstacles(
                new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}
                ));
    }
}