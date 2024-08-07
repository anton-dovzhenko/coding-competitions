import java.util.Objects;

/**
 * Created by anton on 15/1/17.
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
