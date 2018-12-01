/**
 * Created by anton on 1/12/18.
 */
public class _275HIndexII {

    public int hIndex(int[] citations) {
        int h = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > citations.length - i) {
                h = Math.max(h, citations.length - i);
            } else {
                h = Math.max(h, citations[i]);
            }
        }
        return h;
    }

}
