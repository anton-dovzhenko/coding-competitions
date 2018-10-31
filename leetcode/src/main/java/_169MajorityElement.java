import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 3/9/17.
 */
public class _169MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int thr = nums.length / 2;
        for (int num : nums) {
            int nextCount = countMap.getOrDefault(num, 0) + 1;
            if (nextCount > thr) {
                return num;
            }
            countMap.put(num, nextCount);
        }
        throw new IllegalStateException("Majority Element does not exist");
    }

    public int majorityElement2(int[] nums) {
        int c = 0;
        int v = nums[0];
        for (int num : nums) {
            if (num == v) {
                c++;
            } else if (c > 0) {
                c--;
            } else {
                v = num;
                c = 1;
            }
        }
        return v;
    }
}
