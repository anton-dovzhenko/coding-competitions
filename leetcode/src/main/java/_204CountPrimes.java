import java.util.Arrays;

/**
 * Created by anton on 24/2/17.
 */
public class _204CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }

    public int countPrimes2(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrimes[i]) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    notPrimes[j * i] = true;
                }
            }
        }
        return count;
    }

}
