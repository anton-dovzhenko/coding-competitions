import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by anton on 4/2/18.
 */
public class _295FindMedianfromDataStream {

    private final TreeMap<Integer, Integer> set = new TreeMap<>();
    private int size = 0;

    public void addNum(int num) {
        set.put(num, set.getOrDefault(num, 0) + 1);
        size++;
    }

    public double findMedian() {
        int counter = 0;
        int target = size / 2 + (size % 2 == 1 ? 1 : 0);
        double median = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = set.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int bucketSize = entry.getValue();
            if (counter + bucketSize >= target) {
                median = entry.getKey();
                if (size % 2 == 0 && counter + bucketSize < target + 1) {
                    median += iterator.next().getKey();
                    median *= 0.5;
                }
                break;
            } else {
                counter += bucketSize;
            }
        }
        return median;
    }

}
