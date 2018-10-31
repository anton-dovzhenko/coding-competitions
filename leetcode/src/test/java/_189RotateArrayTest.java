import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/3/17.
 */
public class _189RotateArrayTest {

    @Test
    public void rotate() throws Exception {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        new _189RotateArray().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        new _189RotateArray().rotate(nums, 4);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void rotateNoAdditionalSpace() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        new _189RotateArray().rotateNoAdditionalSpace(nums, 3);
        System.out.println(Arrays.toString(nums));
        nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        new _189RotateArray().rotateNoAdditionalSpace(nums, 4);
        System.out.println(Arrays.toString(nums));
    }

}