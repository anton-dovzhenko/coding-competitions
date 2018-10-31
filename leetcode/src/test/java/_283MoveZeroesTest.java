import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/2/17.
 */
public class _283MoveZeroesTest {
    @Test
    public void moveZeroes() throws Exception {
        int[] nums = new int[] {0, 1, 0, 3, 12};
        new _283MoveZeroes().moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

    }

}