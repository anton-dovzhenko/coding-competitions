import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by anton on 22/4/18.
 */
public class _822CardFlippingGame {

    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> sameNumber = new HashSet<>();
        TreeSet<Integer> allNumbers = new TreeSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                sameNumber.add(fronts[i]);
                allNumbers.add(fronts[i]);
            } else {
                allNumbers.add(fronts[i]);
                allNumbers.add(backs[i]);
            }
        }
        for (Integer i : allNumbers) {
            if (!sameNumber.contains(i)) {
                return i;
            }
        }
        return 0;
    }

}
