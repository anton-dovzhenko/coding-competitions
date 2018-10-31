package gcj2015.round1c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by anton on 23/12/16.
 */
public class CLessMoneyMoreProblems {

    public static void main(String ... args) {
        test(1, 2, 3, new int[] {1, 2});
        test(1, 3, 6, new int[] {1, 2, 5});
        test(2, 1, 3, new int[] {3});
        test(2, 1, 3, new int[] {3});
    }

    public static int test(int C, int D, int V, int[] preds) {
        List<Integer> covered = new ArrayList<>();
        covered.add(0);
        for (int pred : preds) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(covered);
            for (int i = 1; i <= C; i++) {
                for (Integer cov : covered) {
                    temp.add(cov + i * pred);
                }
            }
            covered = temp;
        }
        Collections.sort(covered);
        System.out.println(covered);
        return 0;
    }
}
