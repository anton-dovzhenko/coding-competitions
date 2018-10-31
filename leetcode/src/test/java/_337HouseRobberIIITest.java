import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 2/5/18.
 */
public class _337HouseRobberIIITest {

    @Test
    public void testRob() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        assertEquals(7, new _337HouseRobberIII().rob(root));
    }
}