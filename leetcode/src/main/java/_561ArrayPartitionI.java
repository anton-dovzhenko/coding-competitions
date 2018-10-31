import java.util.Arrays;

/**
 * Created by anton on 17/7/17.
 */
public class _561ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            sum += nums[i * 2];
        }
        return sum;
    }

}
