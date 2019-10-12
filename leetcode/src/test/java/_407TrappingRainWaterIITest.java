import org.junit.Test;

import static org.junit.Assert.*;

public class _407TrappingRainWaterIITest {

    @Test
    public void trapRainWater() {
        int[][] heightMap = new int[][]{
                {1, 4, 3, 1, 3, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1}
        };
        assertEquals(4, new _407TrappingRainWaterII().trapRainWater(heightMap));
        heightMap = new int[][]{
                {5, 5, 5, 1},
                {5, 1, 1, 5},
                {5, 1, 5, 5},
                {5, 2, 5, 8}
        };
        assertEquals(3, new _407TrappingRainWaterII().trapRainWater(heightMap));
    }

}