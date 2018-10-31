import java.util.Arrays;

/**
 * Created by anton on 27/3/17.
 */
public class _274HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; h > 0; h--) {
            int index = Arrays.binarySearch(citations, h);
            if (index >= 0) {
                while (index > 0 && h == citations[index - 1]) {
                    index--;
                }
                if (citations.length - index >= h) {
                    return h;
                }
            } else {
                index = -index - 1;
                if (citations.length - index >= h) {
                    return h;
                }
            }
        }
        return 0;
    }

    public int hIndex2(int[] citations) {
        int len = citations.length;
        int[] count = new int[len + 1];
        for (int citation: citations) {
            if (citation > len) {
                count[len]++;
            } else {
                count[citation]++;
            }
        }
        int citedCount = 0;
        for (int h = len; h >= 0; h--) {
            citedCount += count[h];
            if (citedCount >= h)
                return h;
        }
        return 0;
    }

}
