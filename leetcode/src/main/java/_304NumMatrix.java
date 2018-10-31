/**
 * Created by anton on 21/10/17.
 */
//304. Range Sum Query 2D - Immutable
public class _304NumMatrix {

    private final int[][] matrix;

    public _304NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                matrix[i][j] = rowSum + (i > 0 ? matrix[i - 1][j] : 0);
                //System.out.print(matrix[i][j] + " ");
            }
            //System.out.println();
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrix[row2][col2]
                - (row1 > 0 ? matrix[row1 - 1][col2] : 0)
                - (col1 > 0 ? matrix[row2][col1 - 1] : 0)
                + (row1 > 0 && col1 > 0 ? matrix[row1 - 1][col1 - 1] : 0);
    }

}
