import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class _54SpiralMatrixTest {

    @Test
    public void spiralOrder3x3() {
        int[][] m = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> spiral = new _54SpiralMatrix().spiralOrder(m);
        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), spiral);
    }

    @Test
    public void spiralOrder3x4() {
        int[][] m = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> spiral = new _54SpiralMatrix().spiralOrder(m);
        assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), spiral);
    }

}