import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 2/9/18.
 */
public class _841KeysandRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int N = rooms.size();
        boolean[] visited = new boolean[N];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int room = queue.pollFirst();
            visited[room] = true;
            for (int r : rooms.get(room)) {
                if (!visited[r]) {
                    queue.add(r);
                }
            }
        }
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

}
