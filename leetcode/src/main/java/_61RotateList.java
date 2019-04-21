public class _61RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int size = getSize(head);
        int keep = size - k % size;
        if (keep == size) {
            return head;
        }
        ListNode newHead = head;
        for (int i = 0; i < keep - 1; i++) {
            newHead = newHead.next;
        }
        ListNode toModify = newHead;
        newHead = newHead.next;
        toModify.next = null;
        ListNode current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;


        return newHead;
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
