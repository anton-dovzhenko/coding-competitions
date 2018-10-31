/**
 * Created by anton on 8/10/18.
 */
public class _124BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] val = new int[] {root.val};
        maxPathSum0(root, val);
        return val[0];
    }

    private int maxPathSum0(TreeNode root, int[] val) {
        if (root == null) {
            return 0;
        }
        int left = maxPathSum0(root.left, val);
        int right = maxPathSum0(root.right, val);
        int m = root.val;
        m = Math.max(m, root.val + left);
        m = Math.max(m, root.val + right);
        val[0] = Math.max(val[0], Math.max(m, root.val + left + right));
        return m;
    }

}
