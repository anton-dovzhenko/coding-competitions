import java.util.Arrays;

/**
 * Created by anton on 13/2/17.
 */
public class _34SearchForRange {

    public int[] searchRange(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            return new int[] {-1, -1};
        } else {
            int startIndex = index;
            int endIndex = index;
            for (int i = index - 1; i >= 0; i--) {
               if (nums[i] == target) {
                   startIndex = i;
               } else {
                   break;
               }
            }
            for (int i = index + 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    endIndex = i;
                } else {
                    break;
                }
            }
            return new int[] {startIndex, endIndex};
        }
    }

}
