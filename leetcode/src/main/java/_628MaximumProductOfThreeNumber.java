import java.util.Arrays;

/**
 * Created by anton on 25/9/17.
 */
public class _628MaximumProductOfThreeNumber {

    public int maximumProduct(int[] nums) {
        int[] max = new int[3];
        int[] min = new int[2];
        Arrays.fill(max, Integer.MIN_VALUE);
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int num : nums) {
            if (num > max[0]) {
                max[0] = num;
                sort3(max);
            }
            if (num < min[1]) {
                min[1] = num;
                sort2(min, 0, 1);
            }
        }
        return Math.max(max[0] * max[1] * max[2], max[2] * min[0] * min[1]);
    }

    private void sort2(int[] array, int i0, int i1) {
        if(array[i0] > array[i1]) {
            int temp = array[i0];
            array[i0] = array[i1];
            array[i1] = temp;
        }
    }

    private void sort3(int[] array) {
        sort2(array, 0, 1);
        sort2(array, 1, 2);
        sort2(array, 0, 1);
    }

}
