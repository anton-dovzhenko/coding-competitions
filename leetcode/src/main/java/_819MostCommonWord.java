import java.util.*;

/**
 * Created by anton on 15/4/18.
 */
public class _819MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = paragraph.split(" |!|\\?|'|,|;|\\.");

        for (String word : words) {
            String lower = word.toLowerCase();
            if (!bannedSet.contains(lower)) {
                wordFrequency.put(lower, wordFrequency.getOrDefault(lower, 0) + 1);
            }
        }
        int maxFreq = 0;
        String result = null;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getKey().length() > 0 && entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
