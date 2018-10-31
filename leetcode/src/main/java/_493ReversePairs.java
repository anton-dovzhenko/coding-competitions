import java.util.*;

/**
 * Created by anton on 12/2/17.
 */
public class _493ReversePairs {

    public int reversePairs(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int distinct = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                distinct++;
            }
        }
        for (int i = 0; i < distinct; i++) {

        }
        int count = 0;

        return count;
    }


}
