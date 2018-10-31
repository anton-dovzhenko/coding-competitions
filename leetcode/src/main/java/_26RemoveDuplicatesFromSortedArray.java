/**
 * Created by anton on 12/2/17.
 */
public class _26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates2(int[] nums) {
        int shift = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1 - shift]) {
                shift++;
            } else {
                nums[i - shift] = nums[i];
            }
        }
        return nums.length - shift;
    }

    public int removeDuplicates(int[] nums) {
        int id = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[id - 1]) {
                nums[id++] = nums[i];
            }
        }
        return id;
    }

}
