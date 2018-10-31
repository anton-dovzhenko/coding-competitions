/**
 * Created by anton on 1/2/18.
 */
public class _112PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        return (sum == 0 && root.left == null && root.right == null)
                || hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
