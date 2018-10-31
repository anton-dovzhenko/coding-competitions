/**
 * Created by anton on 12/6/17.
 */
public class _563BinaryTreeTilt {

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftVal = root.left != null ? root.left.val : 0;
        int rightVal = root.right != null ? root.right.val : 0;
        int result = Math.abs(leftVal - rightVal)
                + findTilt(root.left) + findTilt(root.right);
        return result;
    }

}
