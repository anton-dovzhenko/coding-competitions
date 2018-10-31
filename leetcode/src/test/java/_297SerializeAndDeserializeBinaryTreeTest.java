import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 1/4/17.
 */
public class _297SerializeAndDeserializeBinaryTreeTest {
    @Test
    public void serialize() throws Exception {

        final TreeNode root = new TreeNode(1);
        final TreeNode node2 = new TreeNode(2);
        final TreeNode node3 = new TreeNode(3);
        final TreeNode node4 = new TreeNode(4);
        final TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;
        System.out.println(new _297SerializeAndDeserializeBinaryTree().serialize(root));

    }

    @Test
    public void deserializeEmpty() throws Exception {
        TreeNode actualRoot = new _297SerializeAndDeserializeBinaryTree().deserialize("");
        assertEquals(null, actualRoot);
    }

    @Test
    public void deserializeOneElement() throws Exception {
        TreeNode actualRoot = new _297SerializeAndDeserializeBinaryTree().deserialize("1");
        final TreeNode expectedRoot = new TreeNode(1);
        assertEquals(expectedRoot, actualRoot);
    }

    @Test
    public void deserialize() throws Exception {
        TreeNode actualRoot = new _297SerializeAndDeserializeBinaryTree().deserialize("1,2,3,null,null,4,5,null,null,null,null");
        final TreeNode expectedRoot = new TreeNode(1);
        final TreeNode node2 = new TreeNode(2);
        final TreeNode node3 = new TreeNode(3);
        final TreeNode node4 = new TreeNode(4);
        final TreeNode node5 = new TreeNode(5);
        expectedRoot.left = node2;
        expectedRoot.right = node3;
        node3.left = node4;
        node3.right = node5;
        assertEquals(expectedRoot, actualRoot);
    }

}