import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 12/6/17.
 */
public class _572SubtreeOfAnotherTreeTest {

    @Test
    public void testIsSubtree() throws Exception {
        TreeNode s = new TreeNode(1);
        s.left = new TreeNode(1);
        TreeNode t = new TreeNode(1);
        assertTrue(new _572SubtreeOfAnotherTree().isSubtree(s, t));
    }
}