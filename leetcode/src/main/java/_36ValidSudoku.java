import java.util.Arrays;

/**
 * Created by anton on 12/2/17.
 */
public class _36ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(nums, 1);
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                if (value != '.' && --nums[value - '0' - 1] < 0) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            Arrays.fill(nums, 1);
            for (int j = 0; j < 9; j++) {
                char value = board[j][i];
                if (value != '.' && --nums[value - '0' - 1] < 0) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 3; j++) {
                Arrays.fill(nums, 1);
                int jSt = j * 3;
                for (int k = 0; k < 3; k++) {
                    for (int m = 0; m < 3; m++) {
                        char value = board[i + k][jSt + m];
                        if (value != '.' && --nums[value - '0' - 1] < 0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
