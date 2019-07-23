import org.junit.Test;

import static org.junit.Assert.*;

public class _149MaxPointsonaLineTest {

    @Test
    public void maxPoints() {
        assertEquals(3, new _149MaxPointsonaLine().maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        assertEquals(4, new _149MaxPointsonaLine().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
        assertEquals(4, new _149MaxPointsonaLine().maxPoints(new int[][]{{1, 1}, {1, 1}, {2, 2}, {2, 2}}));
        assertEquals(2, new _149MaxPointsonaLine().maxPoints(new int[][]{{1, 1}, {1, 1}}));
        assertEquals(2, new _149MaxPointsonaLine().maxPoints(new int[][]{{0, 0}, {94911151, 94911150}, {94911152, 94911151}}));
        assertEquals(3, new _149MaxPointsonaLine().maxPoints(new int[][]{{-1, -1}, {0, 0}, {1, 1}}));
    }

}