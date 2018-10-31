import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Created by anton on 10/6/18.
 */
public class _155MinStack {

    private LinkedList<Integer> stack;
    private TreeMap<Integer, Integer> stackOrder;

    public _155MinStack() {
        stack = new LinkedList<>();
        stackOrder = new TreeMap<>();
    }

    public void push(int x) {
        stackOrder.put(x, stackOrder.getOrDefault(x, 0) + 1);
        stack.add(x);
    }

    public void pop() {
        Integer last = top();
        int count = stackOrder.get(last);
        if (count == 1) {
            stackOrder.remove(last);
        } else {
            stackOrder.put(last, count - 1);
        }
        stack.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return stackOrder.firstEntry().getKey();
    }

}
