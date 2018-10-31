import java.util.*;

/**
 * Created by anton on 4/6/17.
 */
public class _56MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<>();
        if (intervals.isEmpty()) {
            return result;
        }
        intervals.sort(Comparator.comparingInt(o -> o.start));
        result.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            Interval last = result.get(result.size() - 1);
            if (current.start <= last.end) {
                last.end = Math.max(last.end, current.end);
            } else {
                result.add(current);
            }
        }
        return result;
    }

}
