import java.util.Arrays;

/**
 * Created by anton on 26/3/17.
 */
public class _189RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < nums.length / 2) {
            int[] temp = new int[k];
            System.arraycopy(nums, nums.length - k, temp, 0, k);
            System.arraycopy(nums, 0, nums, k, nums.length - k);
            System.arraycopy(temp, 0, nums, 0, k);
        } else {
            int[] temp = new int[nums.length - k];
            System.arraycopy(nums, 0, temp, 0, nums.length - k);
            System.arraycopy(nums, nums.length - k, nums, 0, k);
            System.arraycopy(temp, 0, nums, k, nums.length - k);
        }
    }

    public void rotateNoAdditionalSpace(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, 0, nums.length);
        rotate(nums, 0, k);
        rotate(nums, k, nums.length - k);
    }

    private void rotate(int[] array, int start, int length) {
        for (int i = 0; i < length / 2; i++) {
            int temp = array[start + i];
            array[start + i] = array[start + length - 1 - i];
            array[start + length - 1 - i] = temp;
        }
    }

}
