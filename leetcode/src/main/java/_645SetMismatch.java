/**
 * Created by anton on 1/1/18.
 */
public class _645SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int actual = 0;
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            actual += nums[i];
            target += i + 1;
        }
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] < 0) {
                duplicate = num;
                break;
            }
            nums[num - 1] *= -1;
        }
        if (duplicate == -1) {
            throw new IllegalArgumentException();
        }
        return new int[] {duplicate, duplicate + target - actual};
    }

}
