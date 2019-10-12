import java.util.Arrays;
import java.util.TreeSet;

// Converted to multiple island area problems. Not fast enough
public class _407TrappingRainWaterII2 {

    public int trapRainWater(int[][] heightMap) {
        if (heightMap.length <= 1) {
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < heightMap.length; i++) {
            for (int j = 0; j < heightMap[i].length; j++) {
                set.add(heightMap[i][j]);
            }
        }
        int trapped = 0;
        boolean[][] visited = new boolean[heightMap.length][heightMap[0].length];
        while (set.size() > 1) {
            int h1 = set.pollFirst();
            int h2 = set.first();
            trapped += (h2 - h1) * getIslandSize(heightMap, visited, h1);
            for (int i = 0; i < heightMap.length; i++) {
                Arrays.fill(visited[i], false);
            }
        }
        return trapped;
    }

    private int getIslandSize(int[][] heightMap, boolean[][] visited, int height) {
        int size = 0;

        for (int j = 0; j < heightMap[0].length; j++) {
            getIslandSize(heightMap, visited, height, 0, j);
            getIslandSize(heightMap, visited, height, heightMap.length - 1, j);
        }

        for (int i = 0; i < heightMap.length; i++) {
            getIslandSize(heightMap, visited, height, i, 0);
            getIslandSize(heightMap, visited, height, i, heightMap[i].length - 1);
        }

        for (int i = 1; i < heightMap.length - 1; i++) {
            for (int j = 1; j < heightMap[i].length - 1; j++) {
                int is = getIslandSize(heightMap, visited, height, i, j);
                size += is;
            }
        }
        return size;
    }

    private int getIslandSize(int[][] heightMap, boolean[][] visited, int height, int i, int j) {
        if (i < 0 || j < 0 || i >= visited.length || j >= visited[i].length || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        if (heightMap[i][j] > height) {
            return 0;
        }
        return 1
                + getIslandSize(heightMap, visited, height, i + 1, j)
                + getIslandSize(heightMap, visited, height, i - 1, j)
                + getIslandSize(heightMap, visited, height, i, j - 1)
                + getIslandSize(heightMap, visited, height, i, j + 1)
                ;
    }

}
