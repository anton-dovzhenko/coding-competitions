import java.util.*;

/**
 * Created by anton on 4/2/18.
 */
public class _295FindMedianfromDataStream2 {

    private final PriorityQueue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private final PriorityQueue<Integer> high = new PriorityQueue<>();

    {
        low.add(Integer.MIN_VALUE);
        high.add(Integer.MAX_VALUE);
    }

    public void addNum(int num) {
        Integer lowMax = low.peek();
        Integer highMin = high.peek();
        if (num < lowMax) {
            low.add(num);
        } else if (num > highMin) {
            high.add(num);
        } else {
            if (low.size() > high.size()) {
                high.add(num);
            } else {
                low.add(num);
            }
        }
    }

    private void reBalance() {
        while (low.size() > high.size() + 1 || low.size() < high.size()) {
            if (low.size() < high.size()) {
                low.add(high.poll());
            } else {
                high.add(low.poll());
            }
        }
    }

    public double findMedian() {
        reBalance();
        Integer lowMax = low.peek();
        if (low.size() == high.size() + 1) {
            return lowMax;
        }
        return 0.5 * (lowMax + high.peek());
    }

}
