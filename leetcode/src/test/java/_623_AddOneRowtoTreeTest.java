import org.junit.Test;

import static org.junit.Assert.*;

public class _623_AddOneRowtoTreeTest {

    @Test
    public void addOneRow() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(5);

        root = new _623_AddOneRowtoTree().addOneRow(root, 1, 2);
        System.out.println(root);
    }
}