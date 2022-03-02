import java.util.ArrayList;
import java.util.List;

public class _442FindAllDuplicatesinanArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = Math.abs(nums[i]) - 1;
            if (nums[j] < 0) {
                duplicates.add(Math.abs(nums[i]));
            }
            nums[j] *= -1;
        }
        return duplicates;
    }

}
