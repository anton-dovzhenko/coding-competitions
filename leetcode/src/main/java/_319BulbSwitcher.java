import java.util.Arrays;

/**
 * Created by anton on 16/7/18.
 */
public class _319BulbSwitcher {

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
//        int onCount = 0;
//        boolean[] b = new boolean[n];
//        for (int i = 1; i <= n; i++) {
//            int j = i - 1;
//            do {
//                b[j] = !b[j];
//                j += i;
//            } while (j < n);
//            //System.out.println(Arrays.toString(b));
//        }
//        for (int j = 0; j < n; j++) {
//            if (b[j]) {
//                onCount++;
//            }
//        }
//        return onCount;
    }
}
