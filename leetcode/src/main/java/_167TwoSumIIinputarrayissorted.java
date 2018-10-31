import java.util.Arrays;

/**
 * Created by anton on 11/4/18.
 */
public class _167TwoSumIIinputarrayissorted {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int index = Arrays.binarySearch(numbers, i+1, numbers.length, target - numbers[i]);
            if (index >= 0) {
                return new int[] {i + 1, index + 1};
            }
        }
        return null;
    }
}
