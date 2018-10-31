import java.util.Objects;

/**
 * Created by anton on 15/1/17.
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode fromArray(int[] array) {
        ListNode head = new ListNode(array[0]);
        ListNode cursor = head;
        for (int i = 1; i < array.length; i++) {
            cursor.next = new ListNode(array[i]);
            cursor = cursor.next;
        }
        return head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val).append("->");
        ListNode cursor = next;
        while (cursor != null) {
            sb.append(cursor.val).append("->");
            cursor = cursor.next;
        }
        return sb.toString();
    }




}
