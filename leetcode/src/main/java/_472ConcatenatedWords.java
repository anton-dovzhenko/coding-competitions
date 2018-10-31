import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anton on 13/11/17.
 */
public class _472ConcatenatedWords {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> list = new ArrayList<>();
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            if (isConcaternated(0, word, wordSet)) {
                list.add(word);
            }
        }
        return list;
    }

    private boolean isConcaternated(int start, String word, HashSet<String> wordSet) {
        for (int i = start + 1; i <= word.length(); i++) {
            if (wordSet.contains(word.substring(start, i))) {
                if (i == word.length()) {
                    return start > 0;
                } else if (isConcaternated(i, word, wordSet)) {
                    return true;
                }
            }
        }
        return false;
    }

}
