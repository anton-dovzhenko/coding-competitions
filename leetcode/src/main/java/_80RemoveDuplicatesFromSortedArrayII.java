import java.util.Arrays;

/**
 * Created by anton on 4/6/17.
 */
public class _80RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int length = 0;
        int currentLength = 1;
        int currentVal = nums[0];
        int offset = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentVal) {
                currentLength++;
                if (currentLength > 2) {
                    offset++;
                } else {
                    nums[i - offset] = nums[i];
                }
            } else {
                currentVal = nums[i];
                nums[i - offset] = nums[i];
                length += Math.min(2, currentLength);
                currentLength = 1;
            }
        }
        length += Math.min(2, currentLength);
        return length;
    }

}
