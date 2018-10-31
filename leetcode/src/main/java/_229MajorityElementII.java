import java.util.*;

/**
 * Created by anton on 25/2/18.
 */
public class _229MajorityElementII {

    public List<Integer>  majorityElement(int[] nums) {
        List<Integer> majorities = new ArrayList<>();
        if (nums.length != 0) {
            int c1 = 0, c2 = 0;
            int el1 = nums[0];
            int el2 = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (el1 == nums[i]) {
                    c1++;
                } else if (el2 == nums[i]) {
                    c2++;
                } else if (c1 == 0) {
                    el1 = nums[i];
                    c1 = 1;
                } else if (c2 == 0) {
                    el2 = nums[i];
                    c2 = 1;
                } else {
                    c1--;
                    c2--;
                }
            }
            c1 = 0;
            c2 = 0;
            for (int num : nums) {
                if (num == el1) c1++;
                if (num == el2) c2++;
            }
            if (c1 > nums.length / 3) majorities.add(el1);
            if (c2 > nums.length / 3 && el1 != el2) majorities.add(el2);
        }
        return majorities;
    }

    public static void main(String ... args) {
        System.out.println(
                new _229MajorityElementII().majorityElement(new int[]{5, 5, 0, 0, 0, 5, 0, 0, 5}));
        System.out.println(
                new _229MajorityElementII().majorityElement(new int[]{5, 5, 0, 0, 0, 0, 0, 5, 0, 0, 5, 1, 1, 1, 1}));
        System.out.println(
                new _229MajorityElementII().majorityElement(new int[]{1, 2}));
    }

    public List<Integer> majorityElement2(int[] nums) {
        int threshold = nums.length / 3;
        List<Integer> majorities = new ArrayList<>();
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : nums) {
            occurrences.put(num, 1 + occurrences.getOrDefault(num, 0));
        }
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > threshold) {
                majorities.add(entry.getKey());
            }
        }
        return majorities;
    }

}
