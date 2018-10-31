import java.util.Arrays;

/**
 * Created by anton on 26/6/17.
 */
public class _611ValidTriangleNumber {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int sum = nums[i] + nums[j] - 1;
                int index = Arrays.binarySearch(nums, j + 1, nums.length, sum);
                int increment = 0;
                if (index > 0) {
                    increment = index - j;
                } else {
                    increment = Math.abs(index) - 2 - j;
                }
                for (int m = j + 1; m <= j + increment; m++) {
                    System.out.println(String.format("[%s,%s,%s] %s", nums[i], nums[j], nums[m], nums[m] - nums[j]));
                }
                count += increment;
            }
        }
        return count;
    }

    public int triangleNumber2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int sum = nums[i] + nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] < sum) {
                        count++;
                        System.out.println(String.format("[%s,%s,%s]", nums[i], nums[j], nums[k]));
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public int triangleNumber3(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int sum = nums[i] + nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] < sum) {
                        count++;
                        System.out.println(String.format("[%s,%s,%s]", nums[i], nums[j], nums[k]));
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

}
