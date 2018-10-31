/**
 * Created by anton on 25/2/18.
 */
public class _55JumpGame {

    public boolean canJump(int[] nums) {
        int maxElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxElement) {
                return false;
            }
            maxElement = Math.max(maxElement, i + nums[i]);
        }
        return true;
    }

    public boolean canJump2(int[] nums) {
        return canJump(nums, 0);
    }

    private boolean canJump(int[] nums, int start) {
        if (start == nums.length - 1) {
            return true;
        } else if (start >= nums.length) {
            return false;
        }
        boolean can = false;
        for (int i = 1; i <= nums[start]; i++) {
            if (canJump(nums, start + i)) {
                can = true;
                break;
            }
        }
        return can;
    }

}
