/**
 * Created by anton on 9/7/18.
 */
public class _725SplitLinkedListinParts {

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] list = new ListNode[k];
        int size = getLength(root);
        int nodeSize = size / k;
        int remainders = size % k;

        int currentNodeFill = 0;
        int currentNode = -1;
        ListNode prevRoot = null;
        while (root != null) {
            if (currentNode == -1 ||
                    (currentNode < remainders && currentNodeFill == nodeSize + 1) ||
                    (currentNode >= remainders && currentNodeFill == nodeSize)) {
                currentNode++;
                list[currentNode] = root;
                if (prevRoot != null) {
                    prevRoot.next = null;
                }
                currentNodeFill = 0;
            }
            currentNodeFill++;
            prevRoot = root;
            root = root.next;
        }

        return list;
    }



    private int getLength(ListNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getLength(root.next);
    }

}
