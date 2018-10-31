package gcj2017.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 8/4/17.
 */
public class CBathroomStalls {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTidyNumbers.class.getResourceAsStream("/2017.qualification.C-small-attempt0.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int[] result = getLast(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                System.out.println(String.format("Case #%s: %s %s", i + 1, result[0], result[1]));
            }
        }
    }


    protected static int[] getLast(int N, int K) {
        if (N == K) {
            return new int[] {0, 0};
        }
        boolean[] stalls = new boolean[N];
        int[] left = new int[N];
        int[] right = new int[N];
        int[] result = new int[2];
        for (int i = 0; i < K; i++) {
            int lastTaken = -1;
            for (int j = 0; j < N; j++) {
                if (stalls[j]) {
                    lastTaken = j;
                } else {
                    left[j] = j - lastTaken - 1;
                }
            }
            lastTaken = N;
            for (int j = N - 1; j >= 0; j--) {
                if (stalls[j]) {
                    lastTaken = j;
                } else {
                    right[j] = lastTaken - j - 1;
                }
            }
            int cellIndex = -1;
            int lastMaxMin = -1;
            int lastMaxMax = -1;
            for (int j = N - 1; j >= 0; j--) {
                if (!stalls[j]) {
                    int maxMin = Math.min(left[j], right[j]);
                    int maxMax = Math.max(left[j], right[j]);
                    if (maxMin > lastMaxMin || maxMin == lastMaxMin && maxMax >= lastMaxMax) {
                        cellIndex = j;
                        lastMaxMin = maxMin;
                        lastMaxMax = maxMax;
                    }
                }
            }
            stalls[cellIndex] = true;
            result = new int[] {lastMaxMax, lastMaxMin};
        }
        return result;
    }
}
