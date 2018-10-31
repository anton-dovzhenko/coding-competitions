/**
 * Created by anton on 20/8/18.
 */
public class _671SecondMinimumNodeInaBinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        int[] min = new int[2];
        min[0] = min[1] = Integer.MAX_VALUE;
        search(root, min);
        if (min[1] == Integer.MAX_VALUE || min[0] == min[1]) {
            return -1;
        } else {
            return min[1];
        }
    }

    private void search(TreeNode node, int[] min) {
        if (node == null) {
            return;
        }
        int val = node.val;
        if (min[0] > val) {
            min[1] = min[0];
            min[0] = val;
        } else if (min[0] != val && min[1] > val) {
            min[1] = val;
        }
        search(node.left, min);
        search(node.right, min);
    }

}
