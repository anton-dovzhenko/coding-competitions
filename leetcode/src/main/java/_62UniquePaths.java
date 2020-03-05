import java.util.Arrays;

public class _62UniquePaths {

    public int uniquePaths(int m, int n) {
        int max = Math.max(m, n);
        int[] array = new int[max];
        Arrays.fill(array, 1);
        for (int i = 1; i < Math.min(m, n); i++) {
            for (int j = 1; j < max; j++) {
                array[j] += array[j - 1];
            }
        }
        return array[max - 1];
    }

}
