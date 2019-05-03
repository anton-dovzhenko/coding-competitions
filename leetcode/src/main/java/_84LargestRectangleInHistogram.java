import java.awt.*;
import java.util.*;

public class _84LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        PriorityQueue<Point> queue = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return -Integer.compare(o1.x, o2.x);
            }
        });
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int h = heights[i];
            int start = i;
            while (!queue.isEmpty() && queue.peek().x > h) {
                Point p = queue.poll();
                max = Math.max(max, p.x * (i - p.y));
                start = Math.min(start, p.y);
            }
            if (queue.isEmpty() || queue.peek().x < h) {
                queue.offer(new Point(h, start));
            }

        }
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            max = Math.max(max, p.x * (heights.length - p.y));
        }
        return max;
    }

    //Brute-force approach
    public int largestRectangleArea1(int[] heights) {
        TreeSet<Integer> unique = new TreeSet<Integer>();
        for (int h : heights) {
            unique.add(h);
        }
        int max = 0;
        for (Integer u : unique) {
            int count = 0;
            for (int h : heights) {
                if (h >= u) {
                    count++;
                } else {
                    max = Math.max(max, count * u);
                    count = 0;
                }
            }
            max = Math.max(max, count * u);
        }
        return max;
    }

}
