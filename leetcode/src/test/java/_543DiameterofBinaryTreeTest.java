import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 15/2/18.
 */
public class _543DiameterofBinaryTreeTest {

    @Test
    public void testDiameterOfBinaryTree() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, new _543DiameterofBinaryTree().diameterOfBinaryTree(root));
        root.left.left.left = new TreeNode(6);
        root.left.left.left.left = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.left.right.left.left = new TreeNode(9);
        assertEquals(6, new _543DiameterofBinaryTree().diameterOfBinaryTree(root));
    }
}