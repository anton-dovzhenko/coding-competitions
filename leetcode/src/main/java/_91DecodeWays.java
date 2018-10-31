import java.util.Arrays;

/**
 * Created by anton on 17/4/18.
 */
public class _91DecodeWays {

    public int numDecodings(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int N = s.length();
        int[] permutations = new int[N + 1];
        permutations[N] = 1;
        for (int i = N - 1; i >= 0 ; i--) {
            boolean oneDigit = s.charAt(i) != '0';
            boolean twoDigit = i > 0 && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) <= '6');
            if (oneDigit) {
                permutations[i] += permutations[i + 1];
            }
            if (twoDigit) {
                permutations[i - 1] += permutations[i + 1];
            }
            //System.out.println(Arrays.toString(permutations));
        }

        return permutations[0];
    }
}
