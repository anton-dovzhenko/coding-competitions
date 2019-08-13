public class _363MaxSumofRectangleNoLargerThanK {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int[][] sums = new int[matrix.length + 1][matrix[0].length + 1];

        //sum rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == k) {
                    return k;
                }
                sums[i + 1][j + 1] += matrix[i][j] + sums[i][j + 1] + sums[i + 1][j] - sums[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < sums.length; i++) {
            for (int j = 1; j < sums[i].length; j++) {

                for (int i0 = 0; i0 < i; i0++) {
                    for (int j0 = 0; j0 < j; j0++) {
                        int s = sums[i][j] + sums[i0][j0] - sums[i0][j] - sums[i][j0];
                        if (s <= k) {
                            max = Math.max(max, s);
                        }
                    }
                }
            }
        }

        return max;
    }

}
