import java.util.Arrays;

/**
 * Created by anton on 12/1/17.
 */
public class _1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        Arrays.sort(copy);
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                int sum = copy[i] + copy[j];
                if (sum == target) {
                    int i1 = -1;
                    int j1 = -1;
                    for (int k = 0; k < copy.length; k++) {
                        if (nums[k] == copy[i] && i1 == -1) {
                            i1 = k;
                        } else if (nums[k] == copy[j] && j1 == -1) {
                            j1 = k;
                        }
                    }
                    return new int[] {i1, j1};
                }
                if (sum > target) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Solution does not exist");
    }

    public int[] twoSumBinarySearch(int[] nums, int target) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        Arrays.sort(copy);
        for (int i = 0; i < copy.length - 1; i++) {
            int j = Arrays.binarySearch(copy, i + 1, copy.length, target - copy[i]);
            if (j > -1) {
                int i1 = -1;
                int j1 = -1;
                for (int k = 0; k < copy.length; k++) {
                    if (nums[k] == copy[i] && i1 == -1) {
                        i1 = k;
                    } else if (nums[k] == copy[j] && j1 == -1) {
                        j1 = k;
                    }
                }
                return new int[] {i1, j1};
            }
        }
        throw new IllegalArgumentException("Solution does not exist");
    }

}
