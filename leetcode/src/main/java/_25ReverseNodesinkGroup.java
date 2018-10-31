/**
 * Created by anton on 15/9/18.
 */
public class _25ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        int index = 0;
        ListNode reverseHead = null;
        ListNode reverseTail = null;
        ListNode rTail = null;
        ListNode rHead = null;
        while (head != null) {

            ListNode node = head;
            head = head.next;
            node.next = null;

            if (index % k == k - 1) {
                node.next = rHead;
                rHead = node;
                if (reverseHead == null) {
                    reverseHead = rHead;
                    reverseTail = rTail;
                }  else {
                    reverseTail.next = rHead;
                    reverseTail = rTail;
                }
                rHead = null;
                rTail = null;
            } else if (index % k == 0) {
                rHead = node;
                rTail = node;
            } else {
                node.next = rHead;
                rHead = node;
            }

            index++;
        }
        if (rHead != null) {
            rHead = reverse(rHead);
            if (reverseTail != null) {
                reverseTail.next = rHead;
            } else {
                reverseHead = rHead;
            }
        }
        return reverseHead;
    }

    private ListNode reverse(ListNode head) {
        ListNode reversed = head;
        head = head.next;
        reversed.next = null;
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = reversed;
            reversed = node;
        }
        return reversed;
    }

}
