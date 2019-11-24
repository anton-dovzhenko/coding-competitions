import java.util.HashMap;
import java.util.Map;

public class _260SingleNumberIII {


    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[i] = entry.getKey();
                i++;
            }
            if (i == 2) {
                break;
            }
        }
        return result;
    }

}
