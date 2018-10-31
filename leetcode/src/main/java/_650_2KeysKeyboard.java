import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 25/1/18.
 */
public class _650_2KeysKeyboard {

    public int minSteps2(int n) {
        Map<Integer, Integer> divisors = new HashMap<>();
        int i = 2;
        do {
            if (n % i == 0) {
                divisors.put(i, 1 + divisors.getOrDefault(i, 0));
                n = n / i;
            } else {
                i++;
            }
        } while (i <= n && n >= 1);
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : divisors.entrySet()) {
            result += entry.getKey() * entry.getValue();
        }
        return result;
    }

    public int minSteps(int n) {
        int result = 0;
        int i = 2;
        do {
            if (n % i == 0) {
                result += i;
                n = n / i;
            } else {
                i++;
            }
        } while (i <= n && n >= 1);
        return result;
    }
}
