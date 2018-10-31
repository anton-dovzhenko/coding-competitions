import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 2/9/18.
 */
public class _310MinimumHeightTrees {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> vertices = new ArrayList<>();
        List<Integer>[] graph = (List<Integer>[]) new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        int minHeight = n;
        int[] visited = new int[n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited, -1);
            visited[i] = 0;
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(i);
            int height = bfs(queue, graph, visited);
            if (height < minHeight) {
                vertices.clear();
                vertices.add(i);
                minHeight = height;
            } else if (height == minHeight) {
                vertices.add(i);
            }
        }
        return vertices;
    }

    private int bfs(LinkedList<Integer> queue, List<Integer>[] graph, int[] visited) {
        if (queue.isEmpty()) {
            int min = visited[0];
            for (int i = 1; i < visited.length; i++) {
                min = Math.min(min, visited[i]);
            }
            return min;
        }
        int e = queue.pollFirst();
        if (!graph[e].isEmpty()) {
            for (Integer item : graph[e]) {
                if (visited[item] == -1) {
                    queue.add(item);
                    visited[item] = visited[e] + 1;
                }
            }
        }
        return bfs(queue, graph, visited);
    }

}
