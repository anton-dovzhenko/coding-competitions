import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by anton on 10/4/18.
 */
public class _435NonOverlappingIntervals {

    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                int comparison = Integer.compare(o1.start, o2.start);
                if (comparison == 0) {
                    comparison = Integer.compare(o2.end, o1.end);
                }
                return comparison;
            }
        });
        int[] overlaps = new int[intervals.length];
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j].start < intervals[i].end) {
                    overlaps[i]++;
                } else {
                    break;
                }
            }
        }
        int erasedCount = 0;
        for (int i = 0; i < overlaps.length - 1; i++) {
            if (overlaps[i] > 0) {
                if (overlaps[i] <= overlaps[i + 1]) {
                    overlaps[i + 1] = overlaps[i] - 1;
                }
                erasedCount++;
            }
        }
        return erasedCount;
    }

}