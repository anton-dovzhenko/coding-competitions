import java.util.*;

/**
 * Created by anton on 20/8/18.
 */
public class _207CourseSchedule {

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

        public boolean isDag() {
            LinkedList<Integer> L = new LinkedList<>();
            LinkedList<Integer> S = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                if (incomingDegree[i] == 0) {
                    S.add(i);
                }
            }
            if (S.isEmpty()) {
                return false;
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
            return L.size() == N;
        }

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses);
        for (int i = 0; i < prerequisites.length; i++) {
            g.addEdge(prerequisites[i][0], prerequisites[i][1]);
        }
        return g.isDag();
    }

    public static void main(String ... args) {
        System.out.println(new _207CourseSchedule().canFinish(4
                , new int[][] {{0, 1}, {1, 2}, {2, 3}}));
        System.out.println(new _207CourseSchedule().canFinish(4
                , new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 1}}));
    }

}
