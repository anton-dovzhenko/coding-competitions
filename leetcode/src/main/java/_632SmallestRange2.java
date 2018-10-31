import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by anton on 21/9/18.
 */
public class _632SmallestRange2 {

    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Point> queue = new PriorityQueue<Point>((o1, o2) -> {
            int c = Integer.compare(o1.x, o2.x);
            return c != 0 ? c : Integer.compare(o1.y, o2.y);
        });
        int max = Integer.MIN_VALUE;
        int[] indices = new int[nums.size()];
        int[] r = new int[] {0, Integer.MAX_VALUE};
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i).get(0));
            queue.offer(new Point(nums.get(i).get(0), i));
        }
        while (true) {
            Point min = queue.poll();
            int comp = (max - min.x) - (r[1] - r[0]);
            if (comp < 0 || comp == 0 && min.x < r[0]) {
                r[0] = min.x;
                r[1] = max;
            }
            indices[min.y] += 1;
            if (indices[min.y] < nums.get(min.y).size()) {
                int next = nums.get(min.y).get(indices[min.y]);
                max = Math.max(max, next);
                queue.offer(new Point(next, min.y));
            } else {
                break;
            }
        }

        return r;
    }


}
