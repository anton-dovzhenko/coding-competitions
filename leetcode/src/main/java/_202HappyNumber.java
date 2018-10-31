import java.util.HashSet;
import java.util.Set;

/**
 * Created by anton on 22/2/17.
 */
public class _202HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n) && n != 1) {
            int next = 0;
            while (n > 0) {
                next += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = next;
        }
        return n == 1;

    }
}
