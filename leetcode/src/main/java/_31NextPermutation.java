import java.util.Arrays;

/**
 * Created by anton on 25/8/17.
 */
public class _31NextPermutation {

    public void nextPermutation(int[] nums) {

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                int switchIndex = getMinPos(nums, nums[i], i + 1);
                swap(nums, i, switchIndex);
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        for (int i = 0; i < nums.length / 2; i++) {
            swap(nums, i, nums.length - 1 - i);
        }
    }

    private int getMinPos(int[] array, int minThr, int start) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = start; i < array.length; i++) {
            if (array[i] < min && array[i] > minThr) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            throw new IllegalStateException();
        }
        return index;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
