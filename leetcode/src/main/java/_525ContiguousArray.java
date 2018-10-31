import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.*;

/**
 * Created by anton on 19/2/17.
 */
public class _525ContiguousArray {

    public int findMaxLength(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int max = 0;
        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0, -1);
        sums.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            Integer index = sums.get(nums[i]);
            if (index != null) {
                max = Math.max(max, i - index);
            } else {
                sums.put(nums[i], i);
            }
        }
        return max;
    }

    public int findMaxLength2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int max = 0;
        boolean lenEven = (nums.length - 1) % 2 == 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1 - (lenEven && i % 2 == 1 || !lenEven && i % 2 == 0 ? 0 : 1); j >= i + 1; j -= 2) {
                int temp = (j - i + 1);
                if (max >= temp) {
                    break;
                }
                if (temp / 2 == nums[j] - nums[i] + (i > 0 ? nums[i] - nums[i - 1] : nums[0])) {
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
        }

        return max;
    }


}
