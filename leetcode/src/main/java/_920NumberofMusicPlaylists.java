import java.math.BigInteger;

public class _920NumberofMusicPlaylists {

    private final int mod = 1_000_000_007;

    public int numMusicPlaylists(int N, int L, int K) {
        long S = modulo(power(N - K, L - K) * product(N - K + 1, N));
        int m = 1;
        int sign = -1;
        while (N - m - K > 0) {
            long Sm = modulo(modulo(choose(N, m) * product(N - m - K + 1, N - m)) * power(N - m - K, L - K));
            S = S + sign * Sm;
            S = modulo(S);
            sign *= -1;
            m++;
        }
        return (int) modulo(S);
    }

    private long modulo(long n) {
        n %= mod;
        if (n >= 0) {
            return n;
        } else {
            return (n + mod) % mod;
        }
    }

    private long choose(int n, int k) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            a = a.multiply(BigInteger.valueOf(n - k + i));
            b = b.multiply(BigInteger.valueOf(i));
        }
        return a.divide(b).mod(BigInteger.valueOf(mod)).intValue();
    }

    private long product(int from, int to) {
        BigInteger prd = BigInteger.ONE;
        for (int i = from; i <= to; i++) {
            prd = prd.multiply(BigInteger.valueOf(i));
        }
        return prd.mod(BigInteger.valueOf(mod)).intValue();
    }

    private long power(int base, int pow) {
        BigInteger prd = BigInteger.ONE;
        while (pow > 0) {
            prd = prd.multiply(BigInteger.valueOf(base));
            pow--;
        }
        return prd.mod(BigInteger.valueOf(mod)).intValue();
    }

}