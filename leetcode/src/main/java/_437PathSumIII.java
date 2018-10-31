/**
 * Created by anton on 16/11/17.
 */
public class _437PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return getPartPathSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int getPartPathSum(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        sum -= node.val;
        if (sum == 0) {
            count += 1;
        }
        count += getPartPathSum(node.left, sum);
        count += getPartPathSum(node.right, sum);
        return count;
    }

}
