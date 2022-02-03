import java.util.Arrays;

public class _1887ReductionOperationstoMaketheArrayElementsEqual {

    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        int queue = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                moves += queue;
            }
            queue += 1;
        }
        return moves;
    }

}
