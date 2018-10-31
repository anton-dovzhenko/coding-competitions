package gcj2017.round1A;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anton on 15/4/17.
 */
public class B {

    public static void main(String ... args) throws IOException {
        try (InputStream in = B.class.getResourceAsStream("/B-small-attempt0.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line1 = sc.nextLine().split(" ");
                int N = Integer.parseInt(line1[0]);
                int P = Integer.parseInt(line1[1]);
                int[] standard = new int[N];
                int[][] Q = new int[N][P];
                String[] line2 = sc.nextLine().split(" ");
                for (int k = 0; k < N; k++) {
                    standard[k] = Integer.parseInt(line2[k]);
                }
                for (int k = 0; k < N; k++) {
                    String[] line = sc.nextLine().split(" ");
                    for (int j = 0; j < P; j++) {
                        Q[k][j] = Integer.parseInt(line[j]);
                    }
                }
                int result = getPackNumber(N, P, standard, Q);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, result));
            }
        }
    }

    protected static int getPackNumber(int N, int P, int[] standard, int[][] Q) {
        int[][] maxQ = new int[N][P];
        for (int i = 0; i < Q.length; i++) {
            for (int j = 0; j < Q[i].length; j++) {
                int S = standard[i];
                int min = -1;
                int max = -1;
                for (int k = 1; ; k++) {
                    if (Q[i][j] >= k * S * 0.9 && Q[i][j] <= k * S * 1.1) {
                        max = k;
                        if (min == -1) {
                            min = k;
                        }
                    } else if (Q[i][j] < k * S * 0.9) {
                        break;
                    }
                }
                Q[i][j] = min;
                maxQ[i][j] = max;
            }
        }
        int count = 0;
        if (N == 1) {
            for (int j = 0; j < P; j++) {
                if (Q[0][j] != -1) {
                    count++;
                }
            }
            return count;
        }
        if (N == 2) {
            List<List<Integer>> list1 = getOptions(Q[0], maxQ[0]);
            List<List<Integer>> list2 = getOptions(Q[1], maxQ[1]);
            for (List<Integer> subList1 : list1) {
                for (List<Integer> subList2 : list2){
                    List<Integer> temp = new ArrayList<>(subList1);
                    temp.retainAll(subList2);
                    count = Math.max(count, temp.size());
                }
            }
        }
        return count;
    }

    private static List<List<Integer>> getOptions(int[] min, int max[]) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < min.length; i++) {
            List<List<Integer>> list2 = new ArrayList<>();
            for (List<Integer> sub : list) {
                if (min[i] != -1) {
                    for (int value = min[i]; value <= max[i]; value++) {
                        List<Integer> temp = new ArrayList<>();
                        temp.addAll(sub);
                        temp.add(value);
                        list2.add(temp);
                    }
                }
            }
            list = list2;
        }
        return list;
    }
}
