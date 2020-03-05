import org.junit.Test;

import static org.junit.Assert.*;

public class _62UniquePathsTest {

    @Test
    public void uniquePaths() {
        assertEquals(3, new _62UniquePaths().uniquePaths(3, 2));
        assertEquals(3, new _62UniquePaths().uniquePaths(2, 3));
        assertEquals(28, new _62UniquePaths().uniquePaths(7, 3));
        assertEquals(28, new _62UniquePaths().uniquePaths(3, 7));
    }
}