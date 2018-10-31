/**
 * Created by anton on 1/10/17.
 */
public class _206ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        head = head.next;
        newHead.next = null;
        while (head.next != null) {
            ListNode prevHead = newHead;
            newHead = head;
            head = head.next;
            newHead.next = prevHead;
        }
        head.next = newHead;
        return head;
    }

}
