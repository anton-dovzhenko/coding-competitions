import java.util.TreeMap;

/**
 * Created by anton on 21/10/17.
 */
// 307. Range Sum Query - Mutable
public class NumArray {

    private final int[] nums;
    private final TreeMap<Integer, Integer> updates = new TreeMap<>();

    public NumArray(int[] nums) {
        this.nums = nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
    }

    public void update(int i, int val) {
        int prevVal = nums[i] - (i > 0 ? nums[i - 1] : 0);
        updates.put(i, val - prevVal);
    }

    public int sumRange(int i, int j) {
        int updateSum = updates.subMap(i, true, j, true).values().stream().mapToInt(Integer::intValue).sum();
        if (i == 0) {
            return nums[j] + updateSum;
        }
        return nums[j] - nums[i - 1] + updateSum;
    }

}
