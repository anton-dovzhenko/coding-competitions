import java.util.Arrays;

public class _240Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (Arrays.binarySearch(matrix[i], target) > -1) {
                return true;
            }
        }
        return false;
    }

}
