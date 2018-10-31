import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anton on 2/4/18.
 */
public class _133CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return cloneGraph(node, new HashMap<>());
    }

    private UndirectedGraphNode cloneGraph(UndirectedGraphNode node
            , Map<Integer, UndirectedGraphNode> nodeCache) {
        if (node == null) {
            return null;
        }
        UndirectedGraphNode copy = nodeCache.get(node.label);
        if (copy != null) {
            return copy;
        }
        copy = new UndirectedGraphNode(node.label);
        nodeCache.put(node.label, copy);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbor, nodeCache));
        }
        return copy;
    }

}


class UndirectedGraphNode {

    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
         label = x;
         neighbors = new ArrayList<UndirectedGraphNode>();
    }

};
