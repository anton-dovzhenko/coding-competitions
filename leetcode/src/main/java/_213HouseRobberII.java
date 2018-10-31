/**
 * Created by anton on 2/5/18.
 */
public class _213HouseRobberII {

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int lastAvail = 0;
        int lastTaken = 0;
        for (int i = start; i <= end; i++) {
            int temp = lastTaken;
            lastTaken = lastAvail + nums[i];
            lastAvail = temp;
            lastTaken = Math.max(lastAvail, lastTaken);
        }
        return lastTaken;
    }

}
