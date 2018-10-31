/**
 * Created by anton on 21/10/17.
 */
public class _313SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglies = new int[n];
        int[] indices = new int[primes.length];
        uglies[0] = 1;

        for (int i = 1; i < n; i++) {
            int min = uglies[indices[0]] * primes[0];
            int minIndex = 0;
            for (int j = 1; j < indices.length; j++) {
                int next = uglies[indices[j]] * primes[j];
                if (next < min) {
                    min = next;
                    minIndex = j;
                }
            }
            int next = uglies[indices[minIndex]] * primes[minIndex];
            if (next == uglies[i - 1]) {
                i--;
            }
            uglies[i] = next;
            indices[minIndex]++;
        }
        return uglies[n - 1];
    }

}
