import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by anton on 18/1/18.
 */
public class _129SumRootToLeafNumbers2 {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSum(root, 0);
    }

    private int getSum(TreeNode node, int number) {
        int sum = 0;
        number = number * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum = number;
        }
        if (node.left != null) {
            sum += getSum(node.left, number);
        }
        if (node.right != null) {
            sum += getSum(node.right, number);
        }
        return sum;
    }

}
