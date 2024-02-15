import java.util.Arrays;

public class _3034NumberOfSubarraysThatMatchPatternI {

    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = (int) Math.signum(nums[i + 1] - nums[i]);
        }
        int cnt = 0;
        for (int i = 0; i < nums.length - pattern.length; i++) {
            boolean match = true;
            for (int j = 0; j < pattern.length; j++) {
                if (nums[i + j] != pattern[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                cnt++;
            }
        }
        return cnt;
    }

}
