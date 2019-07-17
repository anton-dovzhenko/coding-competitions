import org.junit.Test;

import static org.junit.Assert.*;

public class _391PerfectRectangleTest {

    @Test
    public void isRectangleCover() {
        assertTrue(new _391PerfectRectangle().isRectangleCover(new int[][] {
                        {1, 1, 3, 3},
                        {3, 1, 4, 2},
                        {3, 2, 4, 4},
                        {1, 3, 2, 4},
                        {2, 3, 3, 4}
                }
        ));

        assertFalse(new _391PerfectRectangle().isRectangleCover(new int[][] {
                        {1, 1, 2, 3},
                        {1, 3, 2, 4},
                        {3, 1, 4, 2},
                        {3, 2, 4, 4}
                }
        ));

        assertFalse(new _391PerfectRectangle().isRectangleCover(new int[][] {
                        {1, 1, 3, 3},
                        {3, 1, 4, 2},
                        {1, 3, 2, 4},
                        {3, 2, 4, 4}
                }
        ));

        assertFalse(new _391PerfectRectangle().isRectangleCover(new int[][] {
                        {1, 1, 3, 3},
                        {3, 1, 4, 2},
                        {1, 3, 2, 4},
                        {2, 2, 4, 4}
                }
        ));
    }
}