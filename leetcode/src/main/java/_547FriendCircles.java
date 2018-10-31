/**
 * Created by anton on 2/4/17.
 */
public class _547FriendCircles {

    public int findCircleNum(int[][] M) {
        for (int i = M.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (M[i][j] > 0 && M[i][k] > 0 && M[k][j] == 0) {
                        M[k][j] = 2;
                        M[j][k] = 2;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            boolean add = true;
            for (int j = 0; j < i; j++) {
                if (M[i][j] > 0) {
                    add = false;
                    break;
                }
            }
            if (add) {
                count++;
            }
        }
        return count;
    }

}
