import java.util.*;

import static java.util.Collections.emptyList;

/**
 * Created by anton on 1/10/17.
 */
public class _210CourseScheduleII {

    private static class Graph {

        private final int N;
        private final List<Integer>[] edges;
        private final int[] incomingDegree;

        public Graph(int N) {
            this.N = N;
            edges = (List<Integer>[]) new List[N];
            for (int i = 0; i < N; i++) {
                edges[i] = new LinkedList<>();;
            }
            incomingDegree = new int[N];
        }

        public void addEdge(int from, int to) {
            incomingDegree[to]++;
            edges[from].add(to);
        }

        public List<Integer> sort() {
            LinkedList<Integer> L = new LinkedList<>();
            LinkedList<Integer> S = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                if (incomingDegree[i] == 0) {
                    S.add(i);
                }
            }
            if (S.isEmpty()) {
                return Collections.emptyList();
            }
            while (!S.isEmpty()) {
                int s = S.pollLast();
                L.add(s);
                for (int v : edges[s]) {
                    if (0 == --incomingDegree[v]) {
                        S.add(v);
                    }
                }
            }
            return L;
        }

    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses);
        for (int i = 0; i < prerequisites.length; i++) {
            g.addEdge(prerequisites[i][1], prerequisites[i][0]);
        }
        List<Integer> sorted = g.sort();
        if (sorted.size() != numCourses) {
            return new int[0];
        }
        int[] result = new int[numCourses];
        int i = 0;
        Iterator<Integer> iterator = sorted.iterator();
        while (iterator.hasNext()) {
            result[i++] = iterator.next();
        }
        return result;
    }

}
