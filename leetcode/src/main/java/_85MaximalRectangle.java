/**
 * Created by anton on 19/9/18.
 */
public class _85MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int[][] rightToLeft = getRightToLeft(matrix);
        int[][] bottomToTop = getBottomToTop(matrix);
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int rl = rightToLeft[i][j];
                int bt = bottomToTop[i][j];
                if (max >= rl * bt) {
                    continue;
                }
                max = Math.max(max, Math.max(rl, bt));
                for (int k = i + 1; k < i + bt; k++) {
                    rl = Math.min(rl, rightToLeft[k][j]);
                    max = Math.max(max, rl * (k - i + 1));
                }
            }
        }
        return max;
    }

    private int[][] getRightToLeft(char[][] matrix) {
        int[][] rightToLeft = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix[i][j] == '0') {
                    rightToLeft[i][j] = 0;
                } else {
                    rightToLeft[i][j] = 1;
                    if (j < matrix[i].length - 1) {
                        rightToLeft[i][j] += rightToLeft[i][j + 1];
                    }
                }
            }
        }
        return rightToLeft;
    }

    private int[][] getBottomToTop(char[][] matrix) {
        int[][] bottomToTop = new int[matrix.length][matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (matrix[i][j] == '0') {
                    bottomToTop[i][j] = 0;
                } else {
                    bottomToTop[i][j] = 1;
                    if (i < matrix.length - 1) {
                        bottomToTop[i][j] += bottomToTop[i + 1][j];
                    }
                }
            }
        }
        return bottomToTop;
    }

}
