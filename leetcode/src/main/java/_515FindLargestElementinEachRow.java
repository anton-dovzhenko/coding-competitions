import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 12/2/17.
 */
public class _515FindLargestElementinEachRow {

    public int[] findValueMostElement(TreeNode root) {
        TreeMap<Integer, Integer> valueOnLevel = new TreeMap<>();
        findValueMostElement(root, 0, valueOnLevel);
        int[] result = new int[valueOnLevel.size()];
        int index = 0;
        for (int value : valueOnLevel.values()) {
            result[index++] = value;
        }
        return result;
    }

    private void findValueMostElement(TreeNode node, int level, Map<Integer, Integer> valueOnLevel) {
        if (node == null) {
            return;
        }
        Integer value = valueOnLevel.get(level);
        if (value == null || value < node.val) {
            valueOnLevel.put(level, node.val);
        }
        level++;
        findValueMostElement(node.left, level, valueOnLevel);
        findValueMostElement(node.right, level, valueOnLevel);
    }

}
