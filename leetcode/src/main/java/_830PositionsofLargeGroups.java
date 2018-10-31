import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 6/5/18.
 */
public class _830PositionsofLargeGroups {

    public List<List<Integer>> largeGroupPositions(String S) {
        int start = 0;
        int length = 1;
        List<List<Integer>> positions = new LinkedList<>();
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                length++;
            } else {
                if (length >= 3) {
                    positions.add(Arrays.asList(start, i - 1));
                }
                start = i;
                length = 1;
            }
        }
        if (length >= 3) {
            positions.add(Arrays.asList(start, S.length() - 1));
        }
        return positions;
    }

}
