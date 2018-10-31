/**
 * Created by anton on 2/2/17.
 */
public class _283MoveZeroes {

    public void moveZeroes(int[] nums) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        for (int i = 0; i < offset; i++) {
            nums[nums.length - 1 - i] = 0;
        }
    }

}
