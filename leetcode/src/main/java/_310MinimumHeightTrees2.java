import java.util.*;

/**
 * Created by anton on 2/9/18.
 * See https://leetcode.com/problems/minimum-height-trees/discuss/76055/Share-some-thoughts
 * Assume that graph is acyclic
 */
public class _310MinimumHeightTrees2 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        LinkedList<Integer> leaves = new LinkedList<>();
        for (Map.Entry<Integer, Set<Integer>> e : graph.entrySet()) {
            if (e.getValue().size() <= 1) {
                leaves.add(e.getKey());
            }
        }

        while (n > 2) {
            LinkedList<Integer> newLeaves = new LinkedList<>();
            graph.keySet().removeAll(leaves);
            for (Map.Entry<Integer, Set<Integer>> e : graph.entrySet()) {
                e.getValue().removeAll(leaves);
                if (e.getValue().size() <= 1) {
                    newLeaves.add(e.getKey());
                }
            }
            n -= leaves.size();
            leaves = newLeaves;
        }

       return leaves;
    }

}
