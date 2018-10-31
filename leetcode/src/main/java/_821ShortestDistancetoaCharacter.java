import java.util.TreeSet;

/**
 * Created by anton on 22/4/18.
 */
public class _821ShortestDistancetoaCharacter {

    public int[] shortestToChar(String S, char C) {
        TreeSet<Integer> cPos = new TreeSet<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                cPos.add(i);
            }
        }
        int[] distances = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            Integer floor = cPos.floor(i);
            Integer ceil = cPos.ceiling(i);
            int dist = Integer.MAX_VALUE;
            if (floor != null) {
                dist = i - floor;
            }
            if (ceil != null && dist > ceil - i) {
                dist = ceil - i;
            }
            distances[i] = dist;
        }
        return distances;
    }

}
