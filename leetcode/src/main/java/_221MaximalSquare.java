import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by anton on 22/2/17.
 */
public class _221MaximalSquare {

    public int maximalSquare4(char[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value;
                if (matrix[i][j] == '0' || i == 0 || j == 0) {
                    value = matrix[i][j] - '0';
                } else {
                    value = Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) + 1;
                }
                matrix[i][j] = (char) value;
                max = Math.max(max, value);
            }
        }
        return max * max;
    }

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (max > matrix.length - i) {
                break;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (max > matrix.length - j) {
                    break;
                }
                int square = square(matrix, i, j, 1);
                if (square > max) {
                    max = square;
                }
            }
        }
        return max * max;
    }

    private int square(char[][] matrix, int i, int j, int length) {
        if (i + length > matrix.length || j + length > matrix[0].length) {
            return length - 1;
        }
        boolean square = true;
        for (int i1 = i; i1 < i + length; i1++) {
            if (matrix[i1][j + length - 1] == '0') {
                square = false;
                break;
            }
        }
        if (!square) {
            return length - 1;
        }
        for (int j1 = j; j1 < j + length; j1++) {
            if (matrix[i + length - 1][j1] == '0') {
                square = false;
                break;
            }
        }
        if (!square) {
            return length - 1;
        }
        return square(matrix, i, j, length + 1);
    }

    public int maximalSquare2(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int n = matrix.length;
        int k = matrix[0].length;
        int result = 0;
        int[][] squares = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    squares[i][j] = min(min(squares[i][j - 1], squares[i - 1][j - 1]), squares[i - 1][j]) + 1;
                    result = max(squares[i][j], result); // update result
                }
            }
        }
        return result * result;
    }

    public int maximalSquare3(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int n = matrix.length;
        int k = matrix[0].length;
        int max = 0;
        for (int j = 0; j < k; j++) {
            matrix[0][j] -= '0';
            max = Math.max(max, matrix[0][j]);
        }
        for (int i = 1; i < n; i++) {
            matrix[i][0] -= '0';
            max = Math.max(max, matrix[i][0]);
            for (int j = 1; j < k; j++) {
                if (matrix[i][j] == '0') {
                    matrix[i][j] -= '0';
                } else {
                    int value = Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) + 1;
                    matrix[i][j] = (char) value;
                    max = Math.max(max, value);
                }
            }
        }
        return max * max;
    }

}
