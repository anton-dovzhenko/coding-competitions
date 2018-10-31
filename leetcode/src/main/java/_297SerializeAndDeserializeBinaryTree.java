import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anton on 1/4/17.
 */
public class _297SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        List<List<Integer>> levels = new ArrayList<>();
        updateLevels(root, 0, levels);
        StringBuilder sb = new StringBuilder();
        for(List<Integer> level : levels) {
            for (Integer value : level) {
                sb.append(value).append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }
        List<Integer> flatTree = Arrays.stream(data.split(",")).map(s -> (s.equals("null") ? null : Integer.parseInt(s))).collect(Collectors.toList());
        TreeNode root = new TreeNode(flatTree.get(0));
        List<TreeNode> levelNodes = new ArrayList<>();
        levelNodes.add(root);
        int index = 1;
        while (index < flatTree.size()) {
            List<TreeNode> nextNodes = new ArrayList<>();
            for (TreeNode levelNode : levelNodes) {
                Integer leftVal = flatTree.get(index++);
                Integer rightVal = flatTree.get(index++);
                if (leftVal != null) {
                    TreeNode node = new TreeNode(leftVal);
                    levelNode.left = node;
                    nextNodes.add(node);
                }
                if (rightVal != null) {
                    TreeNode node = new TreeNode(rightVal);
                    levelNode.right = node;
                    nextNodes.add(node);
                }
            }
            levelNodes = nextNodes;
        }
        return root;
    }

    private void updateLevels(TreeNode node, int level, List<List<Integer>> levels) {
        if (levels.size() < level + 1) {
            levels.add(new ArrayList<>());
        }
        if (node == null) {
            levels.get(level).add(null);
        } else {
            levels.get(level).add(node.val);
            updateLevels(node.left, level + 1, levels);
            updateLevels(node.right, level + 1, levels);
        }
    }

}
