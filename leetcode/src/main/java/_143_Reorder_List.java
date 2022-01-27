public class _143_Reorder_List {

    public void reorderList(ListNode head) {
        ListNode reverse = null;
        ListNode slow = head;
        ListNode fast = head;
        do {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }

            if (fast == null) {
                ListNode temp = slow;
                slow = slow.next;
                temp.next = null;
            } else {
                slow = slow.next;
            }
        } while (fast != null);

        while (slow != null) {
            ListNode temp = slow;
            slow = slow.next;
            temp.next = reverse;
            reverse = temp;
        }
        ListNode cursor = head;
        while (cursor != null && reverse != null) {

            ListNode temp = reverse;
            reverse = reverse.next;
            temp.next = cursor.next;
            cursor.next = temp;
            cursor = temp.next;
        }
    }

    public static void main(String ... args) {
        ListNode h = ListNode.fromArray(new int[] {1, 2, 3, 4});
        new _143_Reorder_List().reorderList(h);

        h = ListNode.fromArray(new int[] {1, 2, 3, 4, 5});
        new _143_Reorder_List().reorderList(h);
    }

}
