/**
 * Created by anton on 4/6/17.
 */
public class _566_ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int numR = nums.length;
        int numC = nums[0].length;
        int elCount = numR * numC;
        if (r * c > elCount) {
            return nums;
        }
        int[][] reshaped = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshaped[i][j] = nums[index / numC][index % numC];
                index++;
            }
        }
        return reshaped;
    }

}
