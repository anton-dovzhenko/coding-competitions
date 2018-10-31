import java.util.*;

/**
 * Created by anton on 7/2/17.
 */
public class _15_3Sum {

    public static void main(String ... args) {
        int[] array = new int[] {1, 5, 10, 15, 20, 25};
        System.out.println("index 0 = " + Arrays.binarySearch(array, 0));
        System.out.println("index 1 = " + Arrays.binarySearch(array, 1));
        System.out.println("index 2 = " + Arrays.binarySearch(array, 2));
        System.out.println("index 5 = " + Arrays.binarySearch(array, 5));
        System.out.println("index 6 = " + Arrays.binarySearch(array, 6));
        System.out.println("index 25 = " + Arrays.binarySearch(array, 25));
        System.out.println("index 26 = " + Arrays.binarySearch(array, 26));
    }

    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < num.length - 1; j++) {
                if (j > i + 1 && num[j] == num[j - 1]) {
                    continue;
                }
                int _2sum = num[i] + num[j];
                int index = Arrays.binarySearch(num, j + 1, num.length, -_2sum);
                if (index > -1) {
                    result.add(Arrays.asList(num[i], num[j], -_2sum));

                } else if (index < -num.length - 1){
                    break;
                }
            }
        }
        return result;
    }

}
