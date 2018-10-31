import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 5/3/17.
 */
public class _531LonelyPixelI {

    public int findLonelyPixel(char[][] picture) {
        int count = 0;
        Map<Integer, Integer> mapRow = new HashMap<>();
        int[] colCount = new int[picture[0].length];

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (picture[i][j] == 'B') {
                    if (mapRow.containsKey(i)) {
                        mapRow.remove(i);
                        break;
                    } else {
                        mapRow.put(i, j);
                    }
                }
            }
        }
        for (int j = 0; j < picture[0].length; j++) {
            for (int i = 0; i < picture.length; i++) {
                if (picture[i][j] == 'B') {
                    colCount[j]++;
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapRow.entrySet()) {
            int col = entry.getValue();
            if (colCount[col] == 1) {
                count++;
            }

        }
        return count;
    }

}
