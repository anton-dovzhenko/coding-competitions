/**
 * Created by anton on 15/1/17.
 */
public class _27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int last = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i == last) {
                break;
            }
            if (nums[i] == val) {
                for (int j = last - 1; j >= i; j--) {
                    last--;
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }

        }
        return last;
    }
}
