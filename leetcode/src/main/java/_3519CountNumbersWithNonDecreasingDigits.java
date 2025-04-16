import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class _3519CountNumbersWithNonDecreasingDigits {

    public int countNumbers(String l, String r, int b) {
        Map<String, Long> cache = new HashMap<>();
        l = new BigInteger(l).subtract(BigInteger.ONE).toString(b);
        r = new BigInteger(r).toString(b);
        long rc = countNumbers(cache, b, r, 0, 0, true);
        cache.clear();
        long lc = countNumbers(cache, b, l, 0, 0, true);
        return (int) ((rc - lc) % 1000000007);
    }

    private long countNumbers(Map<String, Long> cache, int b, String n, int index, int prev, boolean cap) {
        if (index == n.length()) {
            return 1;
        }
        String key = index + "_" + prev + "_" + cap;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        long count = 0;
        int num = n.charAt(index) - '0';
        int upper = cap ? num : (b - 1);
        for (int i = prev; i <= upper; i++) {
            count += countNumbers(cache, b, n, index + 1, i, cap && i == upper);
        }
        cache.put(key, count);
        return count;
    }

}
