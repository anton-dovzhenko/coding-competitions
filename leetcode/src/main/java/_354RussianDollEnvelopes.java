
import java.awt.Point;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by anton on 24/11/18.
 */
public class _354RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        PriorityQueue<Point> width = new PriorityQueue<>((o1, o2) -> {
            int c = Integer.compare(o1.x, o2.x);
            return c != 0 ? c : Integer.compare(o1.y, o2.y);
        });
        PriorityQueue<Point> height = new PriorityQueue<>((o1, o2) -> {
            int c = Integer.compare(o1.y, o2.y);
            return c != 0 ? c : Integer.compare(o1.x, o2.x);
        });
        for (int i = 0; i < envelopes.length; i++) {
            width.add(new Point(envelopes[i][0], envelopes[i][1]));
            height.add(new Point(envelopes[i][0], envelopes[i][1]));
        }
        return maxEnvelopes(null, width, height);
    }

    private int maxEnvelopes(Point p, PriorityQueue<Point> width, PriorityQueue<Point> height) {
        if (width.isEmpty()) {
            return getDolls(p, height);
        }
        if (height.isEmpty()) {
            return getDolls(p, width);
        }
        Point w = width.poll();
        Point h = height.poll();
        boolean isWBigger = p == null || w.x > p.x && w.y > p.y;
        boolean isHBigger = p == null || h.x > p.x && h.y > p.y;
        int max = 0;
        if (w.equals(h)) {
            if (isWBigger) {
                max = 1;
            }
            max += maxEnvelopes(isWBigger ? w : p, width, height);
            width.add(w);
            height.add(h);
        } else {
            LinkedList<Point> cache = new LinkedList<>();
            Point c = height.poll();
            while (c != null && c.x <= w.x) {
                cache.add(c);
                h = height.poll();
            }
            max = (isWBigger ? 1 : 0) + maxEnvelopes(isWBigger ? w : p, width, height);

            height.addAll(cache);
            cache.clear();

            while (w != null && w.y <= h.y) {
                cache.add(w);
                w = width.poll();
            }
            max = Math.max(max, (isHBigger ? 1 : 0) + maxEnvelopes(isHBigger ? h : p, width, height));

        }
        return max;

    }

    private int getDolls(Point p, PriorityQueue<Point> queue) {
        int count = 0;
        while (!queue.isEmpty()) {
            Point next = queue.poll();
            if (p == null || next.x > p.x && next.y > p.y) {
                count++;
                p = next;
            }
        }
        return count;
    }

}
