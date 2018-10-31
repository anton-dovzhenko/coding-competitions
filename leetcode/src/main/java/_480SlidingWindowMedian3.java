import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by anton on 5/2/18.
 */
public class _480SlidingWindowMedian3 {

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] medians = new double[nums.length - k + 1];
        int index = 0;
        int[] temp = Arrays.copyOf(nums, k);
        Arrays.sort(temp);
        medians[index++] = getMedian(temp);
        for (int i = 1; i <= nums.length - k; i++) {
            int next = nums[k + i - 1];
            int removeInd = Arrays.binarySearch(temp, nums[i - 1]);
            int replaceInd = Arrays.binarySearch(temp, next);
            System.out.println("temp = " + Arrays.toString(temp));
            System.out.println("next = " + next);
            System.out.println("removeInd = " + removeInd);
            System.out.println("replaceInd = " + replaceInd);
            if (replaceInd < 0) {
                replaceInd = -replaceInd - 1;
            }
            replaceInd = Math.min(replaceInd, temp.length - 1);
            System.out.println("replaceInd = " + replaceInd);
            if (removeInd <= replaceInd) {
                System.arraycopy(temp, removeInd + 1, temp, removeInd, replaceInd - removeInd);

            } else if (removeInd > replaceInd) {
                System.arraycopy(temp, replaceInd, temp, replaceInd + 1, removeInd - replaceInd);
            }
            temp[replaceInd] = next;

            medians[index++] = getMedian(temp);
            System.out.println("median = " +  medians[index - 1]);
            System.out.println("----------------------------------");

        }
        return medians;
    }

    private double getMedian(int[] nums) {
        int k = nums.length;
        return k % 2 == 1 ? nums[k / 2] : 0.5 * (nums[- 1 + k / 2] + (double) nums[k / 2]);
    }

}
