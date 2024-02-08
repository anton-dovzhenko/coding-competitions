import org.junit.Test;

import static org.junit.Assert.*;

public class _3028AntOnTheBoundaryTest {

    @Test
    public void returnToBoundaryCount() {
        assertEquals(1, new _3028AntOnTheBoundary().returnToBoundaryCount(new int[]{2, 3, -5}));
        assertEquals(0, new _3028AntOnTheBoundary().returnToBoundaryCount(new int[]{3, 2, -3, -4}));
    }

}