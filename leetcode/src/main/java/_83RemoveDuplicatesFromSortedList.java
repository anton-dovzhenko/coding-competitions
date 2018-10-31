/**
 * Created by anton on 7/8/17.
 */
public class _83RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        int value = head.val;
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == value) {
                current.next = current.next.next;
            } else {
                value = current.next.val;
                current = current.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
