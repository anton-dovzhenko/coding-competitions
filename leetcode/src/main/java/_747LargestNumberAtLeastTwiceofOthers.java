/**
 * Created by anton on 27/2/18.
 */
public class _747LargestNumberAtLeastTwiceofOthers {

    public int dominantIndex(int[] nums) {
        int prevMax = Integer.MIN_VALUE;
        int max = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                prevMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > prevMax) {
                prevMax = nums[i];
            }
        }
        return max >= prevMax * 2 ? index : -1;
    }

}
