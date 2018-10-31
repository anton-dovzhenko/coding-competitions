/**
 * Created by anton on 31/1/18.
 */
public class _116PopulatingNextRightPointersinEachNode {

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else if (root.next != null) {
                if (root.next.left != null) {
                    root.left.next = root.next.left;
                } else {
                    root.left.next = root.next.right;
                }
            }
        }
        if (root.right != null && root.next != null) {
            if (root.next.left != null) {
                root.right.next = root.next.left;
            } else {
                root.right.next = root.next.right;
            }
        }
        connect(root.left);
        connect(root.right);
    }

}
