/**
 * Created by anton on 4/2/17.
 */
public class _2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode current = null;
        int cut = 0;
        while (l1 != null || l2 != null) {
            int digit1 = 0;
            int digit2 = 0;
            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            }
            int sum = digit1 + digit2 + cut;
            int val = sum % 10;
            cut = sum / 10;
            if (result == null) {
                result = new ListNode(val);
                current = result;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }
        if (cut > 0) {
            current.next = new ListNode(cut);
        }

        return result;
    }

}
