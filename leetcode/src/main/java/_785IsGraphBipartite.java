import java.util.*;

/**
 * Created by anton on 2/9/18.
 */
public class _785IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        int[] set = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (set[i] == 0) {
                LinkedList<Integer> queue = new LinkedList<>(Arrays.asList(i));
                boolean bip = isBipartite(graph, queue, set);
                if (!bip) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isBipartite(int[][] graph, LinkedList<Integer> queue, int[] set) {
        int colour = 1;
        while (!queue.isEmpty()) {
            colour = switchColour(colour);
            LinkedList<Integer> nextQueue = new LinkedList<>();
            for (int q : queue) {
                for (int v : graph[q]) {
                    if (set[v] != 0 && set[v] != colour) {
                        return false;
                    }
                    if (set[v] == 0) {
                        nextQueue.add(v);
                    }
                    set[v] = colour;
                }
            }
            queue = nextQueue;
        }
        return true;
    }

    private int switchColour(int colour) {
        return colour == 1 ? 2 : 1;
    }
}
