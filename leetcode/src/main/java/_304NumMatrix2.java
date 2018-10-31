/**
 * Created by anton on 21/10/17.
 */
//304. Range Sum Query 2D - Immutable
public class _304NumMatrix2 {

    private final int[][] matrix;

    public _304NumMatrix2(int[][] matrix) {
        this.matrix = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int row = row1; row <= row2; row++) {
            sum += matrix[row][col2] - (col1 > 0 ? matrix[row][col1 - 1] : 0);
        }
        return sum;
    }

}
