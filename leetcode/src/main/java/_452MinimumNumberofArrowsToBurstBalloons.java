import java.awt.*;
import java.util.*;

/**
 * Created by anton on 28/1/18.
 */
public class _452MinimumNumberofArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        TreeMap<Integer, Set<Integer>> ordinates = new TreeMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = points[i][0]; j <= points[i][1]; j++) {
                Set<Integer> ys = ordinates.get(j);
                if (ys == null) {
                    ys = new HashSet<>();
                    ordinates.put(j, ys);
                }
                ys.add(i);
            }
        }
        Set<Integer> prevY = null;
        Set<Integer> shot = new HashSet<>();
        int shots = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : ordinates.entrySet()) {
            Set<Integer> y = entry.getValue();
            y.removeAll(shot);
            if (prevY != null && !y.containsAll(prevY)) {
                shots++;
                shot.addAll(prevY);
                y.removeAll(prevY);
            }
            prevY = y;
        }
        if (prevY != null && !prevY.isEmpty()) {
            shots++;
        }
        return shots;
    }

    public int findMinArrowShots2(int[][] points) {
        TreeSet<int[]> lower = new TreeSet<>((o1, o2) -> {
            int comparison = Integer.compare(o1[0], o2[0]);
            if (comparison == 0) {
                comparison = Integer.compare(o1[1], o2[1]);
            }
            return comparison;
        });
        for (int i = 0; i < points.length; i++) {
            lower.add(points[i]);
        }
        int shots = 0;
        while (!lower.isEmpty()) {
            int[] p1 = lower.first();
            Set<int[]> toConsider = lower.subSet(p1, true, new int[] {p1[1], Integer.MAX_VALUE}, true);
            int minY = p1[1];
            for (int[] p : toConsider) {
                minY = Math.min(minY, p[1]);
            }
            Iterator<int[]> iter = toConsider.iterator();
            while (iter.hasNext()) {
                int[] p = iter.next();
                if (p[0] <= minY) {
                    iter.remove();
                }
            }
            shots++;
        }
        return shots;
    }

}
