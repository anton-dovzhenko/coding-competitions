import java.util.PriorityQueue;

// Converted to multiple island area problems. Not fast enough
public class _407TrappingRainWaterII {

    private static class Square implements Comparable<Square>{
        int height;
        int i;
        int j;

        Square(int height, int i, int j) {
            this.height = height;
            this.i = i;
            this.j = j;
        }

        @Override
        public int compareTo(Square o) {
            return Integer.compare(height, o.height);
        }

    }

    public int trapRainWater(int[][] heightMap) {

        if (heightMap.length <= 1) {
            return 0;
        }

        boolean[][] visited = new boolean[heightMap.length][heightMap[0].length];
        PriorityQueue<Square> queue = new PriorityQueue<>();

        int size = 0;
        
        for (int j = 0; j < heightMap[0].length; j++) {
            visited[0][j] = true;
            visited[heightMap.length - 1][j] = true;
            queue.add(new Square(heightMap[0][j], 0, j));
            queue.add(new Square(heightMap[heightMap.length - 1][j], heightMap.length - 1, j));
        }

        for (int i = 0; i < heightMap.length; i++) {
            visited[i][0] = true;
            visited[i][heightMap[i].length - 1] = true;
            queue.add(new Square(heightMap[i][0], i, 0));
            queue.add(new Square(heightMap[i][heightMap[i].length - 1], i, heightMap[i].length - 1));
        }

        int max = 0;
        while (!queue.isEmpty()) {
            Square s = queue.poll();
            max = Math.max(max, s.height);
            size += updateQueueAndReturnTrapped(queue, visited, heightMap, s.i + 1, s.j, max);
            size += updateQueueAndReturnTrapped(queue, visited, heightMap, s.i - 1, s.j, max);
            size += updateQueueAndReturnTrapped(queue, visited, heightMap, s.i, s.j + 1, max);
            size += updateQueueAndReturnTrapped(queue, visited, heightMap, s.i, s.j - 1, max);

        }

        return size;
    }

    private int updateQueueAndReturnTrapped(PriorityQueue<Square> queue
            , boolean[][] visited, int[][] heightMap, int i, int j, int max) {

        if (i < 0 || i == heightMap.length || j < 0 || j == heightMap[i].length || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int height = heightMap[i][j];
        queue.add(new Square(height, i, j));

        return Math.max(0, max - height);
    }



}
