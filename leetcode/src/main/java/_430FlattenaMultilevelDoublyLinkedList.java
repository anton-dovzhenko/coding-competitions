/**
 * Created by anton on 24/11/18.
 */
public class _430FlattenaMultilevelDoublyLinkedList {

    public Node flatten(Node head) {
        Node flatHead = new Node();
        Node flatCurrent = flatHead;

        while (head != null) {
            flatCurrent.next = head;
            Node next = head.next;
            Node child = head.child;

            flatCurrent = flatCurrent.next;
            flatCurrent.child = null;
            flatCurrent.next = null;

            if (child != null) {
                Node cn = flatten(child);
                flatCurrent.next = cn;
                cn.prev = flatCurrent;
                while (flatCurrent.next != null) {
                    flatCurrent = flatCurrent.next;
                }
            }
            if (next != null) {
                flatCurrent.next = next;
                next.prev = flatCurrent;
            }
            head = next;
        }
        return flatHead.next;
    }

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int _val,Node _prev,Node _next,Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }

    }

}

