/**
 * Created by anton on 26/2/17.
 */
public class _19RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode movingHead = head;
        ListNode targetNode = movingHead;
        int diff = 0;
        while (movingHead.next != null) {
            movingHead = movingHead.next;
            diff++;
            if (diff > n) {
                targetNode = targetNode.next;
            }
        }
        if (diff < n) {
            head = head.next;
        } else {
            targetNode.next = targetNode.next.next;
        }
        return head;
    }

}
