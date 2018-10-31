import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 8/10/18.
 */
public class _124BinaryTreeMaximumPathSumTest {

    @Test
    public void maxPathSum0() throws Exception {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        assertEquals(6, new _124BinaryTreeMaximumPathSum().maxPathSum(node));
    }

    @Test
    public void maxPathSum1() throws Exception {
        TreeNode node = new TreeNode(-10);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        assertEquals(42, new _124BinaryTreeMaximumPathSum().maxPathSum(node));
    }

    @Test
    public void maxPathSum2() throws Exception {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right = new TreeNode(8);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(1);
        assertEquals(48, new _124BinaryTreeMaximumPathSum().maxPathSum(node));
    }

}