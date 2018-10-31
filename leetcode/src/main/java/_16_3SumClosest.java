import java.util.Arrays;

/**
 * Created by anton on 20/8/17.
 */
public class _16_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int lowIndex = i + 1;
            int highIndex = nums.length - 1;
            while (lowIndex < highIndex) {
                int nextTarget = nums[i] + nums[lowIndex] + nums[highIndex];
                int nextDistance = Math.abs(target-nextTarget);
                if (distance > nextDistance) {
                    distance = nextDistance;
                    sum = nextTarget;
                }
                if (nextTarget == target) {
                  return target;
                } if (nextTarget > target) {
                    highIndex--;
                } else if (nextTarget < target) {
                    lowIndex++;
                }
            }
        }
        return sum;
    }


}
