import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Created by anton on 10/6/18.
 */
public class MinStack {

    private static class ListNode {
        int value;
        ListNode prev;
        ListNode next;
        int min;
    }

    private ListNode tail;

    public MinStack() {

    }

    public void push(int x) {
        ListNode temp = new ListNode();
        temp.value = x;
        temp.min = x;
        if (tail != null) {
            tail.next = temp;
            temp.prev = tail;
            temp.min = Math.min(x, tail.min);
        }
        tail = temp;
    }

    public void pop() {
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
    }

    public int top() {
        return tail.value;
    }

    public int getMin() {
        return tail.min;
    }

}
