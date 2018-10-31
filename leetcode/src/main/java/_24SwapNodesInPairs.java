/**
 * Created by anton on 15/1/17.
 */
public class _24SwapNodesInPairs {


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevHead = head;
        ListNode child = head.next;
        head = child;
        prevHead.next = swapPairs(child.next);
        head.next = prevHead;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
