import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 16/11/17.
 */
public class _437PathSumIIITest {

    @Test
    public void testPathSum() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        assertEquals(1, new _437PathSumIII().pathSum(root, 3));
    }
}