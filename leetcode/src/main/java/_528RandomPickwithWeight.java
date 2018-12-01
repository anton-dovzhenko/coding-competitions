import java.util.Arrays;
import java.util.Random;

/**
 * Created by anton on 1/12/18.
 */
public class _528RandomPickwithWeight {

    private final Random r = new Random();
    private final int sum;
    private final int[] sums;

    public _528RandomPickwithWeight(int[] w) {
        sum = sum(w);
        sums = sums(w);
    }

    private int sum(int[] w) {
        int s = 0;
        for (int i : w) {
            s += i;
        }
        return s;
    }

    private int[] sums(int[] w) {
        int[] s = new int[w.length + 1];
        for (int i = 0; i < w.length; i++) {
            s[i + 1] = s[i] + w[i];
        }
        return s;
    }

    public int pickIndex() {
        int i = r.nextInt(sum);
        int index = Arrays.binarySearch(sums, i);
        if (index < 0) {
            index = -index - 2;
        }
        return index;
    }

}
