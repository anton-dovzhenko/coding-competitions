import java.util.Arrays;

/**
 * Created by anton on 2/7/17.
 */
public class _633SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        int root = (int) Math.sqrt(c);
        int[] squares = new int[root + 1];
        for (int i = 0; i <= root; i++) {
            squares[i] = i * i;
        }
        for (int i = 0; i <= root; i++) {
            int index = Arrays.binarySearch(squares, i, root + 1, c - squares[i]);
            if (index >= 0) {
                System.out.println(squares[i] + " " + squares[index]);
                return true;
            }
        }
        return false;
    }

    public boolean judgeSquareSum2(int c) {
        int root = (int) Math.sqrt(c);
        for (int i = root; i >= 0; i--) {
            int remainder = c - i * i;
            double sqrtRem = Math.sqrt(remainder);
            if (sqrtRem == (int) sqrtRem) {
                return true;
            }
        }
        return false;
    }

}
