public class _799ChampagneTower {

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[query_row + 1][query_row + 1];
        tower[0][0] = poured;
        for (int i = 1; i < query_row + 1; i++) {
            for (int j = 0; j <= i; j++) {
                tower[i][j] = Math.max(0, 0.5 * (tower[i - 1][j] - 1));
                if (j > 0) {
                    tower[i][j] += Math.max(0, 0.5 * (tower[i - 1][j - 1] - 1));
                }
            }
        }
        return Math.min(1, tower[query_row][query_glass]);
    }

}
