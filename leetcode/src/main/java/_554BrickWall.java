import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anton on 19/5/17.
 */
public class _554BrickWall {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> edgeCount = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            int length = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                length += wall.get(i).get(j);
                if (!edgeCount.containsKey(length)) {
                    edgeCount.put(length, 0);
                }
                edgeCount.put(length, edgeCount.get(length) + 1);
            }
        }
        int edges = 0;
        for (Map.Entry<Integer, Integer> entry : edgeCount.entrySet()) {
            if (entry.getValue() > edges) {
                edges = entry.getValue();
            }
        }
        return wall.size() - edges;
    }
}
