/**
 * Created by anton on 3/2/17.
 */
public class _268MissingNumber {

    public int missingNumber(int[] nums) {
        int referenceSum = (int) (nums.length * 0.5 * (nums.length + 1));
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return referenceSum - sum;
    }

}
