/**
 * Created by anton on 31/1/18.
 */
public class _226InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode oldLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(oldLeft);
        return root;
    }
}
