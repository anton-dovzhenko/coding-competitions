import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 21/1/18.
 */
public class _110BalancedBinaryTreeTest {

    @Test
    public void testIsBalanced() throws Exception {
        TreeNode root = new TreeNode(1);
        TreeNode node11 = new TreeNode(2);
        TreeNode node12 = new TreeNode(2);
        root.left = node11;
        root.right = node12;
        TreeNode node21 = new TreeNode(3);
        TreeNode node22 = new TreeNode(3);
        TreeNode node23 = new TreeNode(3);
        TreeNode node24 = new TreeNode(3);
        node11.left = node21;
        node11.right = node22;
        node12.left = node23;
        node12.right = node24;
        TreeNode node31 = new TreeNode(4);
        TreeNode node32 = new TreeNode(4);
        TreeNode node33 = new TreeNode(4);
        TreeNode node34 = new TreeNode(4);
        TreeNode node35 = new TreeNode(4);
        TreeNode node36 = new TreeNode(4);
        node21.left = node31;
        node21.right = node32;
        node22.left = node33;
        node22.right = node34;
        node23.left = node35;
        node23.right = node36;
        node31.left = new TreeNode(5);
        System.out.println(new _110BalancedBinaryTree().isBalanced(root));
    }
}