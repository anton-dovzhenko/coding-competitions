/**
 * Created by anton on 19/5/17.
 */
public class _581ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int start = -1;
        int end = -1;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {

            if (start == -1) {
                if (nums[i] < nums[i - 1]) {
                    start = i - 1;
                    minVal = nums[i];
                    maxVal = nums[i - 1];
                    end = i;
                }
            } else {
                if (nums[i] < nums[i - 1] || nums[i] < maxVal) {
                    end = i;
                }
                if (nums[i] < minVal) {
                    minVal = nums[i];
                }
                if (nums[i] > maxVal) {
                    maxVal = nums[i];
                }
            }
        }
        for (int i = start - 1; i >= 0; i--) {
            if (nums[i] > minVal) {
                start--;
            } else {
                break;
            }
        }
        return end == start ? 0 : end - start + 1;
    }

}
