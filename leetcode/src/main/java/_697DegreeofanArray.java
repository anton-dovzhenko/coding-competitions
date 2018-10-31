import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 23/10/17.
 */
public class _697DegreeofanArray {

    private static class State {
        private int degree;
        private int start;
        private int end;
    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, State> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            State state = map.get(num);
            if (state == null) {
                state = new State();
                state.start = i;
                map.put(num, state);
            }
            state.degree++;
            state.end = i;
        }
        int degree = 0;
        int shortest = nums.length;
        for (Map.Entry<Integer, State> entry : map.entrySet()) {
            int length = entry.getValue().end - entry.getValue().start + 1;
            if (entry.getValue().degree > degree) {
                degree = entry.getValue().degree;
                shortest = length;
            } else if(entry.getValue().degree == degree) {
                shortest = Math.min(shortest, length);
            }
        }
        return shortest;
    }

}
