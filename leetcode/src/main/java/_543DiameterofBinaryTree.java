/**
 * Created by anton on 14/2/18.
 */
public class _543DiameterofBinaryTree {

    private final int[] empty = {0, 0};

    public int diameterOfBinaryTree(TreeNode root) {
        return getLengthAndDiameterOfNode(root)[1];
    }

    private int[] getLengthAndDiameterOfNode(TreeNode node) {
        if (node == null) {
            return empty;
        }
        int[] left = empty;
        int[] right = empty;
        if (node.left != null) {
            left = getLengthAndDiameterOfNode(node.left);
            left[0]++;
        }
        if (node.right != null) {
            right = getLengthAndDiameterOfNode(node.right);
            right[0]++;
        }
        int diameter = Math.max(Math.max(left[1], right[1]), left[0] + right[0]);
        return new int[] {Math.max(left[0], right[0]), diameter};
    }
}
