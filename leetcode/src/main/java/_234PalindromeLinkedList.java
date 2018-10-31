/**
 * Created by anton on 16/12/17.
 */
public class _234PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode tempHead = head;
        ListNode reversed = new ListNode(head.val);
        while (tempHead.next != null) {
            ListNode temp = new ListNode(tempHead.next.val);
            temp.next = reversed;
            reversed = temp;
            tempHead = tempHead.next;
        }
        while (head.next != null) {
            if (head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

}
