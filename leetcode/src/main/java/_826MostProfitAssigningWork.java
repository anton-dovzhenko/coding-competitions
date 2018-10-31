import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 29/4/18.
 */
public class _826MostProfitAssigningWork {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        TreeMap<Integer, Integer> maxProfByDif = new TreeMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            Integer maxProfit = maxProfByDif.get(difficulty[i]);
            if (maxProfit == null || maxProfit < profit[i]) {
                maxProfByDif.put(difficulty[i], profit[i]);
            }
        }
        TreeMap<Integer, Integer> maxProfByDif2 = new TreeMap<>();
        int lastProfit = 0;
        for (Map.Entry<Integer, Integer> entry : maxProfByDif.entrySet()) {
            int value = Math.max(lastProfit, entry.getValue());
            lastProfit = value;
            maxProfByDif2.put(entry.getKey(), value);
        }
        int p = 0;
        for (int w : worker) {
            Map.Entry<Integer, Integer> entry = maxProfByDif2.floorEntry(w);
            if (entry != null) {
                p += entry.getValue();
            }
        }
        return p;
    }

}
