import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 17/2/18.
 */
public class _781RabbitsInForest {

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int answer : answers) {
            counts.put(answer, 1 + counts.getOrDefault(answer, 0));
        }
        int rabbitCount = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int groupSize = entry.getKey() + 1;
            int value = entry.getValue();
            rabbitCount += groupSize * (value / groupSize + (value % groupSize == 0 ? 0 : 1));

        }
        return rabbitCount;
    }

}
