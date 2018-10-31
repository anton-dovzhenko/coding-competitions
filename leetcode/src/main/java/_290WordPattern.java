import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by anton on 30/3/17.
 */
public class _290WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] charToString = new String[28];
        Map<String, Integer> stringToChar = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        if (tokenizer.countTokens() != pattern.length()) {
            return false;
        }
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int p = pattern.charAt(i) - 'a';
            if (charToString[p] == null) {
                charToString[p] = token;
            } else if (!charToString[p].equals(token)) {
                return false;
            }
            Integer p0 = stringToChar.get(token);
            if (p0 == null) {
                stringToChar.put(token, p);
            } else if (p0 != p){
                return false;
            }
            i++;
        }
        return true;
    }

}
