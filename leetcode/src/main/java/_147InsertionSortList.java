/**
 * Created by anton on 27/8/17.
 */
public class _147InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode cursor = head;
        while (cursor != null && cursor.next != null) {
            if (cursor.val > cursor.next.val) {
                ListNode insert = removeNextMode(cursor);
                if (insert.val < head.val) {
                    insert.next = head;
                    head = insert;
                } else {
                    ListNode insertCursor = head;
                    while (insertCursor.next != null) {
                        if (insertCursor.next.val >= insert.val) {
                            insert.next = insertCursor.next;
                            insertCursor.next = insert;
                            break;
                        }
                        insertCursor = insertCursor.next;
                    }
                }
            } else {
                cursor = cursor.next;
            }
        }
        return head;
    }

    private ListNode removeNextMode(ListNode cursor) {
        ListNode removed = cursor.next;
        cursor.next = removed.next;
        return removed;
    }

}
