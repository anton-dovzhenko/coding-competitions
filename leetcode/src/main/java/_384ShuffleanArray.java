import java.util.Arrays;
import java.util.Random;

public class _384ShuffleanArray {

    private final int[] nums;
    private final Random r = new Random();

    public _384ShuffleanArray(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] copy = Arrays.copyOf(nums, nums.length);
        for (int i = nums.length; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = copy[i - 1];
            copy[i - 1] = copy[j];
            copy[j] = temp;
        }
        return copy;
    }
}
