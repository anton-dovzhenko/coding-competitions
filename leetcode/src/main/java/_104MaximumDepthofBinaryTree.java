/**
 * Created by anton on 21/1/18.
 */
public class _104MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
        return 0;
    }

}
