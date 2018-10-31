import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 9/7/18.
 */
public class _767ReorganizeString {

    public String reorganizeString(String S) {
        int[] counts = new int[28];
        for (char c : S.toCharArray()) {
            counts[c - 'a']++;
        }
        int max = 0;
        for (int c : counts) {
            max = Math.max(max, c);
        }
        int len = S.length();
        boolean possible = max <= len / 2 + len % 2;
        if (!possible) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char current = 0;
        do {
            int tempMax = 0;
            int tempIndex = 0;
            char tempChar = 0;
            for (int i = 0; i < 28; i++) {
                if (i + 'a' != current && counts[i] > tempMax) {
                    tempMax = counts[i];
                    tempChar = (char) (i + 'a');
                    tempIndex = i;
                }
            }
            counts[tempIndex]--;
            sb.append(tempChar);
            current = tempChar;
        } while (sb.length() < len);
        return sb.toString();
    }

}
