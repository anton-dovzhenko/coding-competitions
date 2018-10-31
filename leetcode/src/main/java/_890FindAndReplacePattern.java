import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 5/9/18.
 */
public class _890FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matched = new LinkedList<>();
        for (String word : words) {
            if (word.length() == pattern.length()) {
                int[] map = new int[28];
                int[] pCount = new int[28];
                int[] wCount = new int[28];
                boolean matches = true;
                for (int i = 0; i < pattern.length(); i++) {
                    char p = pattern.charAt(i);
                    char w = word.charAt(i);
                    pCount[p - 'a']++;
                    wCount[w - 'a']++;
                    if (map[p - 'a'] == 0) {
                        map[p - 'a'] = w;
                    }
                    if (map[p - 'a'] != w || pCount[p - 'a'] != wCount[w - 'a']){
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    matched.add(word);
                }
            }
        }
        return matched;
    }

}
