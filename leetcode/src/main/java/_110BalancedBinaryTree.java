/**
 * Created by anton on 21/1/18.
 */
public class _110BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        try {
            getMaxDepth(root);
            return true;
        } catch (UnbalancedTree e) {
            return false;
        }
    }

    private int getMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getMaxDepth(node.left);
        int right = getMaxDepth(node.right);
        if (Math.abs(left - right) > 1) {
            throw new UnbalancedTree();
        }
        return 1 + Math.max(left, right);
    }

    private static class UnbalancedTree extends RuntimeException {

    }


}
