import java.util.*;

/**
 * Created by anton on 5/2/18.
 */
public class _480SlidingWindowMedian {

    private final TreeMap<Integer, Integer> map = new TreeMap<>();
    private int size = 0;

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
        map.put(n, map.getOrDefault(n, 0) + 1);
        size++;
    }

    private void removeNum(int n) {
        int value = map.get(n);
        if (value == 1) {
            map.remove(n);
        } else {
            map.put(n, value - 1);
        }
        size--;
    }

    private double getMedian() {
        int counter = 0;
        int target = size / 2 + (size % 2 == 1 ? 1 : 0);
        double median = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int bucketSize = entry.getValue();
            if (counter + bucketSize >= target) {
                median = entry.getKey();
                if (size % 2 == 0 && counter + bucketSize < target + 1) {
                    median += iterator.next().getKey();
                    median *= 0.5;
                }
                break;
            } else {
                counter += bucketSize;
            }
        }
        return median;
    }

}
