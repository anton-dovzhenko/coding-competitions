/**
 * Created by anton on 2/5/18.
 */
public class _337HouseRobberIII {

    public int rob(TreeNode root) {
        int[] result = getMax(root);
        return Math.max(result[0], result[1]);
    }

    //first - root node available
    //last - root node not available
    public int[] getMax(TreeNode root) {
        if (root == null) {
            return new int[] {0, 0};
        }
        if (root.left == null && root.right == null) {
            return new int[] {0, root.val};
        }
        int[] left = getMax(root.left);
        int[] right = getMax(root.right);
        int first = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        int last = root.val + left[0] + right[0];
        return new int[] {first, last};
    }

}
