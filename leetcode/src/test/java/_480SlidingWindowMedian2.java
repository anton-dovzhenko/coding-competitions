import java.util.*;

/**
 * Created by anton on 5/2/18.
 */
public class _480SlidingWindowMedian2 {

    private final PriorityQueue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private final PriorityQueue<Integer> high = new PriorityQueue<>();

    {
        low.add(Integer.MIN_VALUE);
        high.add(Integer.MAX_VALUE);
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] medians = new double[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < k; i++) {
            addNum(nums[i]);
        }
        medians[index++] = getMedian();
        for (int i = 1; i <= nums.length - k; i++) {
            removeNum(nums[i - 1]);
            addNum(nums[k + i - 1]);
            medians[index++] = getMedian();
        }
        return medians;
    }

    private void addNum(int n) {
        if (low.size() <= high.size()) {
            if (n > high.peek()) {
                low.add(high.poll());
                high.add(n);
            } else {
                low.add(n);
            }
        } else {
            if (n < low.peek()) {
                high.add(low.poll());
                low.add(n);
            } else {
                high.add(n);
            }
        }
    }

    private void removeNum(int n) {
        if (n <= low.peek()) {
            low.remove(n);
        } else {
            high.remove(n);
        }
    }

    private double getMedian() {
        double median = low.peek();
        if (low.size() == high.size()) {
            median =  0.5 * (median + high.peek());
        }
        return median;
    }

}
