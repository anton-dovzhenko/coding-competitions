import java.util.*;

public class _399EvaluateDivision {

    private static class Edge {

        private final String to;
        private final double weight;

        private Edge(String to, double weight) {
            this.to = to;
            this.weight = weight;
        }

    }

    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        double[] results = new double[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Map<String, List<Edge>> graph = createGraph(equations, values);
            Set<String> visited = new HashSet<>();
            String from = queries[i][0];
            String to = queries[i][1];
            results[i] = find(graph, visited, from, to);
        }

        return results;
    }

    private static Map<String, List<Edge>> createGraph(String[][] equations, double[] values) {
        Map<String, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            addEdge(graph, equations[i][0], equations[i][1], values[i]);
            addEdge(graph, equations[i][1], equations[i][0], 1 / values[i]);
        }
        return graph;
    }

    private static void addEdge(Map<String, List<Edge>> graph, String from, String to, double weight) {
        List<Edge> edges = graph.get(from);
        if (edges == null) {
            edges = new ArrayList<>();
            edges.add(new Edge(from, 1d));
            graph.put(from, edges);
        }
        edges.add(new Edge(to, weight));
    }

    private static double find(Map<String, List<Edge>> graph, Set<String> visited, String from, String to) {
        List<Edge> edges = graph.get(from);
        if (edges == null) {
            return -1;
        }
        visited.add(from);
        for (Edge edge : edges) {
            if (edge.to.equals(to)) {
                return edge.weight;
            }
            if (!visited.contains(edge.to)) {
                double path = find(graph, visited, edge.to, to);
                if (path != -1) {
                    return edge.weight * path;
                }
            }
        }
        visited.remove(from);
        return -1;
    }

}
