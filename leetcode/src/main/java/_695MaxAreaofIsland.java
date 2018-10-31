/**
 * Created by anton on 22/10/17.
 */
public class _695MaxAreaofIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                area = Math.max(area, getIslandArea(grid, i, j));
            }
        }
        return area;
    }

    private int getIslandArea(int[][] grid, int i, int j) {
        int area = grid[i][j];
        if (area > 0) {
            grid[i][j] = 0;
            area += i > 0 ? getIslandArea(grid, i - 1, j) : 0;
            area += i < grid.length - 1 ? getIslandArea(grid, i + 1, j) : 0;
            area += j > 0 ? getIslandArea(grid, i, j - 1) : 0;
            area += j < grid[i].length - 1 ? getIslandArea(grid, i, j + 1) : 0;
        }
        return area;
    }

}
