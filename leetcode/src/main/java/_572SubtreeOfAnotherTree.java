/**
 * Created by anton on 12/6/17.
 */
public class _572SubtreeOfAnotherTree {

    private Boolean subtreeOfAnotherTree;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        checkNode(s, t);
        return subtreeOfAnotherTree != null ? subtreeOfAnotherTree : false;

    }

    private void checkNode(TreeNode s, TreeNode t) {
        if (s == null) {
            return;
        }
        if (s.val == t.val) {
            boolean temp = checkIfSame(s, t);
            if (subtreeOfAnotherTree == null || !subtreeOfAnotherTree) {
                subtreeOfAnotherTree = temp;
            }
        }
        if (subtreeOfAnotherTree == null || !subtreeOfAnotherTree) {
            checkNode(s.left, t);
            checkNode(s.right, t);
        }
    }

    private boolean checkIfSame(TreeNode s, TreeNode t) {
        return (s == null && t == null)
                || (s != null
                    && t != null
                    && s.val == t.val
                    && checkIfSame(s.left, t.left)
                    && checkIfSame(s.right, t.right));
    }

}
