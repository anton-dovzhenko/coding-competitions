/**
 * Created by anton on 16/2/18.
 */
public class _160IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode headBTemp = headB;
            while (headBTemp != null) {
                if (headA == headBTemp) {
                    return headA;
                }
                headBTemp = headBTemp.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }


}
