import java.util.HashMap;

/**
 * Created by anton on 16/11/17.
 */
public class _437PathSumIII2 {

    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> sumsCache = new HashMap<>();
        sumsCache.put(0, 1);
        return helper(root, 0, sum, sumsCache);
    }

    public int helper(TreeNode root, int currSum, int sum, HashMap<Integer, Integer> sumsCache) {
        if (root == null) {
            return 0;
        }
        currSum += root.val;
        int res = sumsCache.getOrDefault(currSum - sum, 0);
        sumsCache.put(currSum, sumsCache.getOrDefault(currSum, 0) + 1);
        res += helper(root.left, currSum, sum, sumsCache) + helper(root.right, currSum, sum, sumsCache);
        sumsCache.put(currSum, sumsCache.get(currSum) - 1);
        return res;
    }

}
