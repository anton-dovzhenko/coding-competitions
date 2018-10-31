/**
 * Created by anton on 20/8/18.
 */
public class _450DeleteNodeinaBST {

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode levelUp = new TreeNode(Integer.MAX_VALUE);
        levelUp.left = root;
        modifyNode(levelUp, root, true, key);
        return levelUp.left;
    }

    private void modifyNode(TreeNode prev, TreeNode node, boolean left, int key) {
        if (node == null) {
            return;
        }
        if (node.val == key) {
            TreeNode target = null;

            if (node.right != null) {
                target = node;
                TreeNode p = null;
                while (node.right != null) {
                    node.val = node.right.val;
                    p = node;
                    node = node.right;
                }
                if (node.left != null) {
                    p.right = node.left;
                } else {
                    p.right = null;
                }
            } else if (node.left != null) {
                target = node.left;
            }
            if (left) {
                prev.left = target;
            } else {
                prev.right = target;
            }
        } else{
            modifyNode(node, node.left, true, key);
            modifyNode(node, node.right, false, key);
        }
    }

}
