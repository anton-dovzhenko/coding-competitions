import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 25/8/17.
 */
public class _31NextPermutationTest {

    @Test
    public void testNextPermutation() throws Exception {
        int[] nums = {1, 2, 3};
        new _31NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);

        nums = new int[] {3, 2, 1};
        new _31NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);

        nums = new int[] {1, 1, 5};
        new _31NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{1, 5, 1}, nums);

        nums = new int[] {1, 3, 2};
        new _31NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{2, 1, 3}, nums);

        nums = new int[] {1, 6, 5, 4, 3, 2};
        new _31NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{2, 1, 3, 4, 5, 6}, nums);

        nums = new int[] {2, 3, 1};
        new _31NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{3, 1, 2}, nums);

    }
}