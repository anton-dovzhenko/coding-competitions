import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by anton on 7/2/18.
 */
public class _264UglyNumberII {

    public int nthUglyNumber(int n) {
        Set<Integer> uglies = new HashSet<>();
        uglies.add(1);
        int counter = 1;
        int number = 1;
        while (counter < n) {
            int min = Integer.MAX_VALUE;
            Set<Integer> remove = new HashSet<>();
            for (Integer ugly : uglies) {
                if (!uglies.contains(ugly * 2)) {
                    min = Math.min(min, ugly * 2);
                } else if (!uglies.contains(ugly * 3)) {
                    min = Math.min(min, ugly * 3);
                } else if (!uglies.contains(ugly * 5)) {
                    min = Math.min(min, ugly * 5);
                } else {
                    remove.add(ugly);
                }
            }
            uglies.removeAll(remove);
            uglies.add(min);
            number = min;
            counter++;
        }
        return number;
    }

    public int nthUglyNumber2(int n) {
        int[] uglies = new int[n];
        uglies[0] = 1;
        int f2 = 0;
        int f3 = 0;
        int f5 = 0;
        for (int i = 1; i < n; i++) {
            int next2 = uglies[f2] * 2;
            int next3 = uglies[f3] * 3;
            int next5 = uglies[f5] * 5;
            int min = Math.min(next2, Math.min(next3, next5));
            if (min == uglies[i - 1]) {
                i--;
            }
            uglies[i] = min;
            if (min == next2) {
                f2++;
            } else if (min == next3) {
                f3++;
            } else {
                f5++;
            }
        }
        return uglies[n - 1];
    }

}
