import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 24/11/18.
 */
public class _430FlattenaMultilevelDoublyLinkedListTest {
    @Test
    public void flatten() throws Exception {
        _430FlattenaMultilevelDoublyLinkedList.Node n1 = new _430FlattenaMultilevelDoublyLinkedList.Node(1);
        _430FlattenaMultilevelDoublyLinkedList.Node n2 = new _430FlattenaMultilevelDoublyLinkedList.Node(2);
        _430FlattenaMultilevelDoublyLinkedList.Node n3 = new _430FlattenaMultilevelDoublyLinkedList.Node(3);
        _430FlattenaMultilevelDoublyLinkedList.Node n4 = new _430FlattenaMultilevelDoublyLinkedList.Node(4);
        _430FlattenaMultilevelDoublyLinkedList.Node n5 = new _430FlattenaMultilevelDoublyLinkedList.Node(5);
        _430FlattenaMultilevelDoublyLinkedList.Node n6 = new _430FlattenaMultilevelDoublyLinkedList.Node(6);
        _430FlattenaMultilevelDoublyLinkedList.Node n7 = new _430FlattenaMultilevelDoublyLinkedList.Node(7);
        _430FlattenaMultilevelDoublyLinkedList.Node n8 = new _430FlattenaMultilevelDoublyLinkedList.Node(8);
        _430FlattenaMultilevelDoublyLinkedList.Node n9 = new _430FlattenaMultilevelDoublyLinkedList.Node(9);
        _430FlattenaMultilevelDoublyLinkedList.Node n10 = new _430FlattenaMultilevelDoublyLinkedList.Node(10);
        _430FlattenaMultilevelDoublyLinkedList.Node n11 = new _430FlattenaMultilevelDoublyLinkedList.Node(11);
        _430FlattenaMultilevelDoublyLinkedList.Node n12 = new _430FlattenaMultilevelDoublyLinkedList.Node(12);
        next(n1, n2);
        next(n2, n3);
        n3.child = n7;
        next(n7, n8);
        next(n8, n9);
        next(n9, n10);
        n8.child = n11;
        next(n11, n12);
        next(n3, n4);
        next(n5, n6);
        new _430FlattenaMultilevelDoublyLinkedList().flatten(n1);


    }

    private void next(_430FlattenaMultilevelDoublyLinkedList.Node a, _430FlattenaMultilevelDoublyLinkedList.Node b) {
        a.next = b;
        b.prev = a;
    }

}