package gcj2015.round2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 23/12/16.
 */
public class APegman {

    private final static int UP = 0;
    private final static int RIGHT = 1;
    private final static int DOWN = 2;
    private final static int LEFT = 3;
    private final static int EMPTY = -1;

    public static void main(String ... args) throws IOException {
        try (InputStream in = APegman.class.getResourceAsStream("/2015.round2.A-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cases; i++) {
                String[] lineItems = sc.nextLine().split(" ");
                int R = Integer.parseInt(lineItems[0]);
                int C = Integer.parseInt(lineItems[1]);
                int[][] field = new int[R][C];
                for (int k = 0; k < R; k++) {
                    String line = sc.nextLine();
                    for (int j = 0; j < C; j++) {
                        field[k][j] = map(line.charAt(j));
                    }
                }


                int changes = getChangesCount(R, C, field);
                String result = changes > -1 ? Integer.toString(changes) : "IMPOSSIBLE";
                System.out.println(String.format("Case #%1$d: %2$s", i + 1, result));
            }

        }
    }

    private static int map(char value) {
        switch (value) {
            case '.':
                return -1;
            case '^':
                return 0;
            case '>':
                return 1;
            case 'v':
                return 2;
            case '<':
                return 3;
            default:
                throw new IllegalArgumentException(Character.toString(value));
        }
    }

    public static int getChangesCount(int R, int C, int[][] field) {
        int changeCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (field[i][j] != EMPTY) {
                    final boolean boundary = boundaryExists(R, C, field[i][j], i, j, field);
                    if (!boundary) {
                        boolean otherBoundary = false;
                        for (int k = 1; k <=3; k++) {
                            if (boundaryExists(R, C, (k + field[i][j]) % 4, i, j, field)) {
                                otherBoundary = true;
                                break;
                            }
                        }
                        if (otherBoundary) {
                            changeCount++;
                        } else {
                            return -1;
                        }
                    }
                }
            }
        }

        return changeCount;
    }

    private static boolean boundaryExists(int R, int C, int action, int row, int col, int[][] field) {
        if (action == UP) {
            for (int i = 0; i < row; i++) {
                if (field[i][col] != EMPTY) {
                    return true;
                }
            }
        } else if (action == RIGHT) {
            for (int i = col + 1; i < C; i++) {
                if (field[row][i] != EMPTY) {
                    return true;
                }
            }
        } else if (action == DOWN) {
            for (int i = row + 1; i < R; i++) {
                if (field[i][col] != EMPTY) {
                    return true;
                }
            }
        } else if (action == LEFT) {
            for (int i = 0; i < col; i++) {
                if (field[row][i] != EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }
}
