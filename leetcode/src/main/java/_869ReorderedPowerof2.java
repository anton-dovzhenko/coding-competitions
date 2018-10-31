import java.util.Arrays;

/**
 * Created by anton on 15/7/18.
 */
public class _869ReorderedPowerof2 {

    private static final int[][] power2Digits = new int[32][10];
    static {
        for (int i = 0; i < 32; i++) {
            int k = (int) Math.pow(2, i);
            String ks = Integer.toString(k);
            power2Digits[i] = new int[10];
            for (int j = 0; j < ks.length(); j++) {
                power2Digits[i][ks.charAt(j) - '0']++;
            }
        }
    }

    public boolean reorderedPowerOf2(int N) {
        int[] digits = new int[10];
        String Ns = Integer.toString(N);
        for (int j = 0; j < Ns.length(); j++) {
            digits[Ns.charAt(j) - '0']++;
        }
        for (int i = 0; i < power2Digits.length; i++) {
            if (Arrays.equals(power2Digits[i], digits)) {
                return true;
            }
        }
        return false;
    }

}
