import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 14/5/18.
 */
public class _377CombinationSumIV {

    private final Map<Integer, Integer> cache = new HashMap<>();

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        return combinationSum40(nums, target);
    }

    private int combinationSum40(int[] nums, int target) {
        if (cache.containsKey(target)) {
            return cache.get(target);
        }
        int sum = 0;
        for (int n : nums) {
            int res = target - n;
            if (res < 0) {
                break;
            } else if (res == 0) {
                sum += 1;
            } else {
                sum += combinationSum4(nums, res);
            }
        }
        cache.put(target, sum);
        return sum;
    }

}
