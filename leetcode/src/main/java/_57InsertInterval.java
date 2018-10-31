import java.util.*;

/**
 * Created by anton on 23/3/18.
 */
public class _57InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(0, new Interval(Integer.MIN_VALUE, Integer.MIN_VALUE));
        intervals.add(new Interval(Integer.MAX_VALUE, Integer.MAX_VALUE));
        int i1 = Collections.binarySearch(intervals, newInterval, (o1, o2) -> Integer.compare(o1.start, o2.start));
        int i2 = Collections.binarySearch(intervals, newInterval, (o1, o2) -> Integer.compare(o1.end, o2.end));
        if (i1 < 0) {
            i1 = - (i1 + 1);
        }
        if (i2 < 0) {
            i2 = - (i2 + 1);
        }
        if (intervals.get(i1 - 1).end >= newInterval.start) {
            i1--;
        }
        if (intervals.get(i2).start > newInterval.end) {
            i2--;
        }
        if (i1 > i2) {
            intervals.add(i1, newInterval);
        } else if (i1 == i2) {
            intervals.get(i1).start = Math.min(intervals.get(i1).start, newInterval.start);
            intervals.get(i1).end = Math.max(intervals.get(i1).end, newInterval.end);
        } else {
            Interval merged = new Interval(Math.min(intervals.get(i1).start, newInterval.start)
                    , Math.max(intervals.get(i2).end, newInterval.end));
            List<Interval> tail = new ArrayList<>(intervals.subList(i2 + 1, intervals.size()));
            intervals = new ArrayList<>(intervals.subList(0, i1));
            intervals.add(merged);
            intervals.addAll(tail);
        }
        return intervals.subList(1, intervals.size() - 1);
    }

    public List<Interval> insert2(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>(intervals.size());
        int i = 0;
        Interval next = null;
        for (; i < intervals.size(); i++) {
            next = intervals.get(i);
            if (newInterval.start <= next.end) {
                break;
            } else {
                result.add(next);
            }
        }
        if (next != null  && newInterval.end >= next.start && newInterval.start <= next.end) {
            next.start = Math.min(next.start, newInterval.start);
            next.end = Math.max(next.end, newInterval.end);
            Interval merged = next;
            result.add(merged);
            for (; i < intervals.size(); i++) {
                next = intervals.get(i);
                if (newInterval.end >= next.start) {
                    merged.end = Math.max(merged.end, next.end);
                } else {
                    result.add(next);
                }
            }
        } else {
            result.add(newInterval);
            result.addAll(intervals.subList(i, intervals.size()));
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] a) {
        new _57InsertInterval()
                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(6, 9))), new Interval(2, 5));
        new _57InsertInterval()
                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(6, 9))), new Interval(12, 15));
        new _57InsertInterval()
                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(6, 9))), new Interval(9, 15));
        new _57InsertInterval()
                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 5), new Interval(6, 8))), new Interval(5, 6));
//        System.out.println("0 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 0));
//        System.out.println("1 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 1));
//        System.out.println("5 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 5));
//        System.out.println("10 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 10));
//        System.out.println("50 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 50));
//        System.out.println("100 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 100));
//        System.out.println("200 in 1 10 100 : " + Arrays.binarySearch(new int[]{1, 10, 100}, 200));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(4, 6));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(-5, -3));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(-5, 1));
//
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(-5, 9));
//
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(-5, 10));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(3, 6));
//
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(21, 190));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(120, 190));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(100, 190));
//        new _57InsertInterval()
//                .insert2(new ArrayList<>(Arrays.asList(new Interval(1, 3), new Interval(10, 20), new Interval(50, 100))), new Interval(3, 10));

    }

}
