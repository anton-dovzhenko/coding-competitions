import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 7/2/18.
 */
public class _257BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        return binaryTreePaths(root, "");
    }

    private List<String> binaryTreePaths(TreeNode node, String path) {
        List<String> paths = new LinkedList<>();
        path = ("".equals(path) ? "" : path + "->") + node.val;
        if (node.left == null && node.right == null) {
            paths.add(path);
        }
        if (node.left != null) {
            paths.addAll(binaryTreePaths(node.left, path));
        }
        if (node.right != null) {
            paths.addAll(binaryTreePaths(node.right, path));
        }
        return paths;
    }

}
