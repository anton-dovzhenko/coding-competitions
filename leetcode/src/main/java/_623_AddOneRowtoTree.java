public class _623_AddOneRowtoTree {

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        addOneRow0(root, v, d);
        return root;
    }

    private void addOneRow0(TreeNode root, int v, int d) {
        if (root == null) {
            return;
        }

        if (d == 2) {

            TreeNode left = root.left;
            TreeNode right = root.right;

            TreeNode addLeft = new TreeNode(v);
            TreeNode rightLeft = new TreeNode(v);

            root.left = addLeft;
            root.right = rightLeft;

            addLeft.left = left;
            rightLeft.right = right;
        } else {
            addOneRow0(root.left, v, d - 1);
            addOneRow0(root.right, v, d - 1);
        }
    }

}
