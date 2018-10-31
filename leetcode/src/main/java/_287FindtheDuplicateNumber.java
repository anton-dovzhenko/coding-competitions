/**
 * Created by anton on 1/1/18.
 */
public class _287FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] < 0) {
                return num;
            }
            nums[num - 1] *= -1;
        }
        throw new IllegalArgumentException();
    }

}
