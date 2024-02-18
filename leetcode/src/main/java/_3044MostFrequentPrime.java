import java.util.*;

public class _3044MostFrequentPrime {

    public int mostFrequentPrime(int[][] mat) {
        Map<Integer, Integer> cache = new HashMap<>();
        int[][] paths = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                for (int[] p : paths) {
                    int n = mat[i][j];
                    int i0 = i + p[0];
                    int j0 = j + p[1];
                    while (i0 >= 0 && i0 < mat.length && j0 >= 0 && j0 < mat[0].length) {
                        n = n * 10 + mat[i0][j0];
                        if (cache.containsKey(n)) {
                            int v = cache.get(n);
                            cache.put(n, v + (int) Math.signum(v));
                        } else {
                            cache.put(n, isPrime(n) ? 1 : -1);
                        }
                        i0 += p[0];
                        j0 += p[1];
                    }
                }
            }
        }

        int result = -1;
        int max = 0;
        for (int key : cache.keySet()) {
            int v = cache.get(key);
            if (v > max || v == max && key > result) {
                result = key;
                max = v;
            }
        }
        return result;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.min(n - 1, (int) (Math.sqrt(n) + 1)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String... args) {
        System.out.println(new _3044MostFrequentPrime().mostFrequentPrime(new int[][]{{1, 1}, {9, 9}, {1, 1}}));
        System.out.println(new _3044MostFrequentPrime().mostFrequentPrime(new int[][]{{9, 7, 8}, {4, 6, 5}, {2, 8, 6}}));
        System.out.println(new _3044MostFrequentPrime().mostFrequentPrime(new int[][]{{9,3,8}, {4,2,5}, {3,8,6}}));

    }

}
