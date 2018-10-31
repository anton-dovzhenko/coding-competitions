import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 18/1/18.
 */
public class _129SumRootToLeafNumbersTest {

    @Test
    public void testSumNumbers() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(new _129SumRootToLeafNumbers2().sumNumbers(root));
    }
}