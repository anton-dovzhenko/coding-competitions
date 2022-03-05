public class _2181MergeNodesinBetweenZeros {

    public ListNode mergeNodes(ListNode head) {
        int s = 0;
        ListNode result = new ListNode(0);
        ListNode ref = result;
        while (head != null) {
            s += head.val;
            if (head.val == 0) {
                result.next = new ListNode(s);
                result = result.next;
                s = 0;
            }
            head = head.next;
        }
        return ref.next.next;
    }
    
}
