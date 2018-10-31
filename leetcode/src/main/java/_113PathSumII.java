import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 1/2/18.
 */
public class _113PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> sums = new LinkedList<>();
        pathSum(root, sum, new LinkedList<>(), sums);
        switch (sum) {
            case 1:

        }
        return sums;
    }

    private void pathSum(TreeNode node, int sum
            , LinkedList<Integer> currentPath, List<List<Integer>> sums) {
        if (node != null) {
            sum -= node.val;
            currentPath.add(node.val);
            if (sum == 0 && node.left == null && node.right == null) {
                sums.add(new ArrayList<>(currentPath));
            }
            pathSum(node.left, sum, currentPath, sums);
            pathSum(node.right, sum, currentPath, sums);
            currentPath.removeLast();
        }
    }



}
