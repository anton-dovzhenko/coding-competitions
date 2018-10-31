import java.util.*;

/**
 * Created by anton on 3/2/17.
 */
public class _349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] larger = nums1.length > nums2.length ? nums1 : nums2;
        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        Arrays.sort(larger);
        boolean[] helper = new boolean[larger.length];
        int size = 0;
        for (int i = 0; i < smaller.length; i++) {
            int index = Arrays.binarySearch(larger, smaller[i]);
            if (index > -1 && !helper[index]) {
                helper[index] = true;
                size++;
            }
        }
        int[] intersection = new int[size];
        int index = 0;
        for (int i = 0; i < helper.length; i++) {
            if (helper[i]) {
                intersection[index++] = larger[i];
            }
        }
        return intersection;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num1 : nums1) {
            uniqueElements.add(num1);
        }
        Set<Integer> intersection = new HashSet<>();
        for (int num2 : nums2) {
            if (uniqueElements.contains(num2)) {
                intersection.add(num2);
            }
        }
        return intersection.stream().mapToInt(i->i).toArray();
    }

}
