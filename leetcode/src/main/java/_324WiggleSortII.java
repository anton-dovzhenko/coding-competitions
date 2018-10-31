import java.util.Arrays;

/**
 * Created by anton on 28/2/18.
 */
public class _324WiggleSortII {

    public void wiggleSort(int[] nums) {
        System.out.println("----------");
        Arrays.sort(nums);
        int L = nums.length;
        int shift = L % 2 == 1 ? 1 : 0;
        int[] result = new int[L];
        for (int i = 0; i < L / 2; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[L / 2 + i + shift];
        }
        if (L % 2 == 1) {
            result[L - 1] = nums[L / 2];
        }
        System.out.println(Arrays.toString(result));
        for (int i = 2; i < L - 1; i++) {
            if (result[i] == result[i - 1]) {
                int dup = result[i];
                result[i] = result[i - 2];
                result[i - 1] = result[i + 1];
                result[i - 2] = dup;
                result[i + 1] = dup;
            }
        }
        System.arraycopy(result, 0, nums, 0, result.length);
    }

    //1 1 1 1 2 2 2
    //1 2 1 2 1 2
}
