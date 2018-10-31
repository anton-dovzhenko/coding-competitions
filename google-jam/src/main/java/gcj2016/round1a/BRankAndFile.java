package gcj2016.round1a;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by anton on 14/1/17.
 */
public class BRankAndFile {

    public static int[] getMissing(int N, int[][] lists) {
        int[] all = new int[N * (N - 1)];
        int index = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                all[index++] = lists[i][j];
            }
        }
        Arrays.sort(all);

        for (int i = 0; i < N; i++) {
            int allIndex = (i + 1) * (i + 1) - 1;
            int allValue = all[allIndex];
        }

        return new int[N];
    }

    public static int[] getMissing2(int N, List<int []> lists) {
        Collections.sort(lists, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int i = 0; i < o1.length; i++) {
                    int comparison = Integer.compare(o1[i], o2[i]);
                    if (comparison != 0) {
                        return comparison;
                    }
                }
                return 0;
            }
        });

        int[][] matrix = new int[N][N];

        int missingRow = -1;
        int missingCol = -1;
        if (lists.get(0)[0] == lists.get(0)[1]) {
            matrix[0] = lists.get(0);
            for (int i = 0; i < N; i++) {
                matrix[i][0] = lists.get(1)[i];
            }
            lists.remove(0);
            lists.remove(1);
        } else {
            matrix[0] = lists.get(0);
            missingCol = 0;
            lists.remove(0);
        }

        for (int i = 1; i < N; i++) {
            int[] array1 = lists.get(0);
            int[] array2 = lists.get(1);

            if (missingRow != -1) {
                //if (array1[0] == matrix[])
            }

        }
        return null;

    }
}
