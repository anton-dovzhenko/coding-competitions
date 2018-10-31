import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 18/1/18.
 */
public class _129SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSum(root, new LinkedList<>());
    }

    private int getSum(TreeNode node, LinkedList<Integer> digits) {
        int sum = 0;
        digits.add(node.val);
        if (node.left == null && node.right == null) {
            sum = getNumber(digits);
        }
        if (node.left != null) {
            sum += getSum(node.left, digits);
        }
        if (node.right != null) {
            sum += getSum(node.right, digits);
        }
        if (!digits.isEmpty()) {
            digits.removeLast();
        }
        return sum;
    }

    private int getNumber(LinkedList<Integer> digits) {
        Iterator<Integer> iterator = digits.descendingIterator();
        int number = 0;
        int pow = 1;
        while (iterator.hasNext()) {
            number += iterator.next() * pow;
            pow *= 10;
        }
        return number;
    }

}
