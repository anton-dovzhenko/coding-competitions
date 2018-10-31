import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anton on 29/4/18.
 */
public class _827MakingALargeIsland {

    private static class Island {
        private int size;
    }
    private final Island NullIsland = new Island();

    public int largestIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Map<Integer, Island> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] != 0) {
                    Island island = new Island();
                    island.size = getIslandSize(map, island, grid, visited, i, j);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    max = Math.max(max, map.get(i * grid[0].length + j).size);
                } else {
                    int size = 1;
                    List<Island> neighbours = new ArrayList<>();
                    if (i > 0) {
                        Island island = map.getOrDefault((i - 1) * grid[0].length + j, NullIsland);
                        if (!neighbours.contains(island)) {
                            size += island.size;
                            neighbours.add(island);
                        }
                    }
                    if (i < grid.length - 1) {
                        Island island = map.getOrDefault((i + 1) * grid[0].length + j, NullIsland);
                        if (!neighbours.contains(island)) {
                            size += island.size;
                            neighbours.add(island);
                        }
                    }
                    if (j > 0) {
                        Island island = map.getOrDefault(i * grid[0].length + j - 1, NullIsland);
                        if (!neighbours.contains(island)) {
                            size += island.size;
                            neighbours.add(island);
                        }
                    }
                    if (j < grid[i].length - 1) {
                        Island island = map.getOrDefault(i * grid[0].length + j + 1, NullIsland);
                        if (!neighbours.contains(island)) {
                            size += island.size;
                            neighbours.add(island);
                        }
                    }
                    max = Math.max(max, size);
                }
            }
        }
        return max;
    }

    private int getIslandSize(Map<Integer, Island> map, final Island island, int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (visited[i][j] || grid[i][j] == 0) {
            visited[i][j] = true;
            return 0;
        }
        visited[i][j] = true;
        map.put(i * grid[0].length + j, island);
        return 1 + getIslandSize(map, island, grid, visited, i - 1, j)
                + getIslandSize(map, island, grid, visited, i + 1, j)
                + getIslandSize(map, island, grid, visited, i, j - 1)
                + getIslandSize(map, island, grid, visited, i, j + 1);
    }



}
