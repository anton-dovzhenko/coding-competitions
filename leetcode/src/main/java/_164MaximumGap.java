import java.util.Arrays;

public class _164MaximumGap {

    public int maximumGap1(int[] nums) {
        int gap = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i] - nums[i - 1];
            if (temp > gap) {
                gap = temp;
            }
        }
        return gap;
    }

}
