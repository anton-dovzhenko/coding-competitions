import java.util.Arrays;

/**
 * Created by anton on 14/3/17.
 */
public class _74Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                return -1 < Arrays.binarySearch(matrix[i], target);
            }
        }
        return false;
    }

}
