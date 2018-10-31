import java.util.Arrays;

/**
 * Created by anton on 5/3/17.
 */
public class _533LonelyPixelII {

    public int findBlackPixel(char[][] picture, int N) {
        int count = 0;
        int[] rowCounts = new int[picture.length];
        int[] colCounts = new int[picture[0].length];

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (picture[i][j] == 'B') {
                    rowCounts[i]++;
                }
            }
        }

        for (int j = 0; j < picture[0].length; j++) {
            for (int i = 0; i < picture.length; i++) {
                if (picture[i][j] == 'B') {
                    colCounts[j]++;
                }
            }
        }

        for (int j = 0; j < colCounts.length; j++) {
            if (colCounts[j] != N) {
                continue;
            }
            for (int i = 0; i < rowCounts.length; i++) {
                if (picture[i][j] == 'B') {
                    if (rowCounts[i] == colCounts[j]) {
                        boolean lonely = true;
                        for (int k = i + 1; k < rowCounts.length; k++) {
                            if (picture[k][j] == 'B' && !Arrays.equals(picture[i], picture[k])) {
                                lonely = false;
                                break;
                            }
                        }
                        if (lonely) {
                            count += rowCounts[i];
                        }
                        break;
                    } else {
                        break;
                    }
                }
            }
        }

        return count;
    }

}
