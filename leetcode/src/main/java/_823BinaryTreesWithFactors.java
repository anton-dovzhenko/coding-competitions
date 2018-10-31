import java.util.Arrays;
/**
 * Created by anton on 22/4/18.
 */
public class _823BinaryTreesWithFactors {

    public int numFactoredBinaryTrees(int[] A) {
        Arrays.sort(A);
        long[] counts = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            long count = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] % A[j] == 0) {
                    int value = A[i] / A[j];
                    int index = Arrays.binarySearch(A, value);
                    if (index >= 0) {
                        count += counts[j] * counts[index];
                    }
                }
            }
            counts[i] = count;
        }
        long num = 0;
        for (long count : counts) {
            num += count;
        }
        return (int) (num % (7 + Math.pow(10, 9)));
    }

}
