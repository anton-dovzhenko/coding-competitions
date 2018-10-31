/**
 * Created by anton on 16/2/18.
 */
public class _237DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

}
