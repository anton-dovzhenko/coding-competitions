import java.util.ArrayList;

/**
 * Created by anton on 25/8/17.
 */
public class _60PermutationSequence {

    public String getPermutation(int n, int k) {
        ArrayList<Character> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add((char) ('1' + i));
        }
        int[] factorial = factorial(n);
        String result = "";
        k = k - 1;
        for (int i = factorial.length - 2; i >=0; i--) {
            int index = k / factorial[i];
            k = k % factorial[i];
            result += numbers.get(index);
            numbers.remove(index);
        }
        result += numbers.get(0);
        return result;
    }

    private int[] factorial(int n) {
        int[] f = new int[n];
        f[0] = 1;
        for (int i = 1; i < n; i++) {
            f[i] = f[i - 1] * (i + 1);
        }
        return f;
    }

}
