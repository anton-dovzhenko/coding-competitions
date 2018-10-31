/**
 * Created by anton on 27/8/17.
 */
public class _86PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode part1 = null;
        ListNode part1Pointer = null;
        ListNode part2 = null;
        ListNode part2Pointer = null;
        while (head != null) {
            if (head.val < x) {
                if (part1 == null) {
                    part1 = head;
                } else {
                    part1Pointer.next = head;
                }
                part1Pointer = head;
            } else {
                if (part2 == null) {
                    part2 = head;
                } else {
                    part2Pointer.next = head;
                }
                part2Pointer = head;
            }
            head = head.next;
        }
        if (part1Pointer != null) {
            part1Pointer.next = null;
        }
        if (part2Pointer != null) {
            part2Pointer.next = null;
        }
        if (part1 != null) {
            part1Pointer.next = part2;
        } else {
            part1 = part2;
        }
        return part1;
    }

}
