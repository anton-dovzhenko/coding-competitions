import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 27/1/18.
 */
public class _467UniqueSubstringsInWraparoundString {

    public int findSubstringInWraproundString(String p) {
        if (p.equals("")) {
            return 0;
        }
        int[] counts = new int[26];
        int start = 0;
        char startSym = p.charAt(0);
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) != p.charAt(i - 1) + 1 && !(p.charAt(i) == 'a' && p.charAt(i - 1) == 'z')) {
                updateCounts(counts, startSym - 'a', i - start);
                start = i;
                startSym = p.charAt(i);
            }
        }
        updateCounts(counts, startSym - 'a', p.length() - start);

        int count = 0;
        for (int c : counts) {
            count += c;
        }
        return count;
    }

    private void updateCounts(int[] counts, int start, int length) {
        for (int i = 0; i < Math.min(26, length); i++) {
            int pos = (start + i) % 26;
            counts[pos] = Math.max(counts[pos], length - i);
        }
    }

}
