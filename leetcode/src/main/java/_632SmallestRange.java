import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by anton on 21/9/18.
 */
public class _632SmallestRange {

    public int[] smallestRange(List<List<Integer>> nums) {
        if (nums.isEmpty()) {
            return new int[]{0, 0};
        }
        int[] r = new int[] {0, Integer.MAX_VALUE};
        List<Integer> list = nums.get(0);
        for (int i = 0; i < list.size(); i++) {
            int[] next = getMin(nums, 1, list.get(i), list.get(i), r);
            if (next[1] - next[0] < r[1] - r[0]) {
                r = next;
            }
        }
        return r;
    }

    private int[] getMin(List<List<Integer>> nums, int i, int min, int max, int[] rangeMin) {
        if (rangeMin[1] - rangeMin[0] < max - min) {

        }
        if (i == nums.size()) {
            return new int[]{min, max};
        }
        List<Integer> list = nums.get(i);
        int minIndex = Collections.binarySearch(list, min);
        int maxIndex = Collections.binarySearch(list, max);
        if (minIndex >= 0 || maxIndex >= 0 || minIndex != maxIndex) {
            return getMin(nums, i + 1, min, max, rangeMin);
        }
        int insertIndex = -1 - minIndex;
        if (insertIndex == 0) {
            return getMin(nums, i + 1, min, list.get(0), rangeMin);
        } else if (insertIndex == list.size()) {
            return getMin(nums, i + 1, list.get(list.size() - 1), max, rangeMin);
        } else {
            int[] r1 = getMin(nums, i + 1, list.get(insertIndex - 1), max, rangeMin);
            int[] r2 = getMin(nums, i + 1, min, list.get(insertIndex), rangeMin);
            int[] r = min(r1, r2);
            return getMin(nums, i + 1, r[0], r[1], rangeMin);
        }
    }

    private int[] min(int[] r1, int[] r2) {
        int d = (r2[1] - r2[0]) - (r1[1] - r1[0]);
        if (d > 0) {
            return r1;
        }
        if (d < 0) {
            return r2;
        }
        return r1[0] < r2[0] ? r1 : r2;
    }

}
