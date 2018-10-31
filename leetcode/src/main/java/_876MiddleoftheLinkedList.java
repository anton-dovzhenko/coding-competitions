/**
 * Created by anton on 29/7/18.
 */
public class _876MiddleoftheLinkedList {

    public ListNode middleNode(ListNode head) {
        int size = getSize(head);
        for (int i = 0; i < Math.floor(0.5 * size); i++) {
            head = head.next;
        }
        return head;
    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
