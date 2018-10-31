import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 1/2/17.
 */
public class _448FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[nums[i] - 1] = -nums[nums[i] - 1];
        }

        return null;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                disappeared.add(i + 1);
            }
        }
        return disappeared;
    }

}


