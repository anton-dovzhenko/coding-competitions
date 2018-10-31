import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 12/2/17.
 */
public class _513FindLeftMostElement {

    public int findLeftMostNode(TreeNode root) {
        TreeMap<Integer, Integer> valueOnLevel = new TreeMap<>();
        findLeftMostNode(root, 0, valueOnLevel);
        return valueOnLevel.lastEntry().getValue();
    }

    private void findLeftMostNode(TreeNode node, int level, Map<Integer, Integer> valueOnLevel) {
        if (node == null) {
            return;
        }
        if (!valueOnLevel.containsKey(level)) {
            valueOnLevel.put(level, node.val);
        }
        level++;
        findLeftMostNode(node.left, level, valueOnLevel);
        findLeftMostNode(node.right, level, valueOnLevel);
    }

}
