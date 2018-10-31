/**
 * Created by anton on 13/1/17.
 */
public class _21MergeTwoSortedLists {

    /**
     * Method leaves l1 and l2 lists unchanged
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode nextNode = null;

        while (l1 != null || l2 != null) {
            boolean l1Min = l2 == null || (l1 != null && l1.val < l2.val);
            int minVal = l1Min ? l1.val : l2.val;
            if (result == null) {
                result = new ListNode(minVal);
                nextNode = result;
            } else {
                nextNode.next = new ListNode(minVal);
                nextNode = nextNode.next;
            }
            if (l1Min) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }

        }

        return result;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
