/**
 * Created by anton on 22/2/17.
 */
public class _200NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char value = grid[i][j];
                if (value == '1') {
                    count++;
                    nextCell(grid, i, j);
                } else {
                    grid[i][j] = 'v';
                }

            }
        }
        return count;
    }

    private void nextCell(char[][] grid, int i, int j) {
        if (i > -1 && j > -1 && i < grid.length && j < grid[0].length && grid[i][j] != 'v') {
            boolean land = grid[i][j] == '1';
            grid[i][j] = 'v';
            if (land) {
                nextCell(grid, i - 1, j);
                nextCell(grid, i + 1, j);
                nextCell(grid, i, j - 1);
                nextCell(grid, i, j + 1);
            }

        }
    }





}
