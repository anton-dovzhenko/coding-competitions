package gcj2017.round1A;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by anton on 15/4/17.
 */
public class A {

    public static void main(String ... args) throws IOException {
        try (InputStream in = A.class.getResourceAsStream("/A-large.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String line = sc.nextLine();
                String[] n = line.split(" ");
                int R = Integer.parseInt(n[0]);
                int C = Integer.parseInt(n[1]);
                char[][] cake = new char[R][];
                for (int k = 0; k < R; k++) {
                    cake[k] = sc.nextLine().toCharArray();
                }
                setInitials(cake, R, C);
                System.out.println(String.format("Case #%1$d:", i + 1));
                for (int k = 0; k < R; k++) {
                    for (int j = 0; j < C; j++) {
                        System.out.print(cake[k][j]);
                    }
                    System.out.println();
                }
            }
        }
    }

    protected static void setInitials(char[][] cake, int R, int C) {
        Map<Integer, List<Character>> columnMultipleOccurrences = new HashMap<>();
        Map<Integer, List<Character>> rowMultipleOccurrences = new HashMap<>();
        for (int i = 0; i < R; i++) {
            rowMultipleOccurrences.put(i, new ArrayList<>());
            int[] occurrences = new int[28];
            for (int j = 0; j < C; j++) {
                if (cake[i][j] != '?') {
                    occurrences[cake[i][j] - 'A']++;
                }
            }
            for (int k = 0; k < 28; k++) {
                if (occurrences[k] > 1) {
                    rowMultipleOccurrences.get(i).add((char) (k + 'A'));
                }
            }
        }
        for (int j = 0; j < C; j++) {
            columnMultipleOccurrences.put(j, new ArrayList<>());
            int[] occurrences = new int[28];
            for (int i = 0; i < R; i++) {
                if (cake[i][j] != '?') {
                    occurrences[cake[i][j] - 'A']++;
                }
            }
            for (int k = 0; k < 28; k++) {
                if (occurrences[k] > 1) {
                    columnMultipleOccurrences.get(j).add((char) (k + 'A'));
                }
            }
        }

        for (int i = 0; i < R; i++) {
            char lastLetter = '?';
            int lastCol = -1;
            for (int j = 0; j < C; j++) {
                if (cake[i][j] != '?') {
                    lastLetter = cake[i][j];
                    lastCol = j;
                } else if (lastCol != -1 && !columnMultipleOccurrences.get(lastCol).contains(lastLetter)) {
                    cake[i][j] = lastLetter;
                }
            }
            for (int j = C - 1; j >= 0; j--) {
                if (cake[i][j] != '?') {
                    lastLetter = cake[i][j];
                    lastCol = j;
                } else if (lastCol != -1 && !columnMultipleOccurrences.get(lastCol).contains(lastLetter)) {
                    cake[i][j] = lastLetter;
                }
            }
        }

        for (int j = 0; j < C; j++) {
            char lastLetter = '?';
            int lastRow = -1;
            for (int i = 0; i < R; i++) {
                if (cake[i][j] != '?') {
                    lastLetter = cake[i][j];
                    lastRow = i;
                } else if (lastRow != -1 && !rowMultipleOccurrences.get(lastRow).contains(lastLetter)) {
                    cake[i][j] = lastLetter;
                }
            }
            for (int i = R - 1; i >= 0; i--) {
                if (cake[i][j] != '?') {
                    lastLetter = cake[i][j];
                    lastRow = i;
                } else if (lastRow != -1 && !rowMultipleOccurrences.get(lastRow).contains(lastLetter)) {
                    cake[i][j] = lastLetter;
                }
            }

        }

    }
}
