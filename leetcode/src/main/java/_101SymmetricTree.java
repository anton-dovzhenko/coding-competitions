/**
 * Created by anton on 8/1/18.
 */
public class _101SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root == null || compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return compare(left.left, right.right) && compare(left.right, right.left);
    }

}
