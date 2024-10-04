import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _3305CountOfSubstringsContainingEveryVowelandKConsonantsI {

    public int countOfSubstrings(String word, int k) {
        int wordCnt = 0;
        Map<Character, Boolean> vowels = new HashMap<>();
        vowels.put('a', false);
        vowels.put('e', false);
        vowels.put('i', false);
        vowels.put('o', false);
        vowels.put('u', false);
        for (int i = 0; i < word.length(); i++) {
            int consCnt = 0;
            boolean allVowels = false;
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (!vowels.containsKey(c)) {
                    consCnt++;
                } else if (!allVowels) {
                    if (!vowels.put(c, true)) {
                        allVowels = isAllVowels(vowels);
                    }
                }
                if (consCnt > k) {
                    break;
                }
                if (allVowels && consCnt == k) {
                    wordCnt++;
                }
            }
            resetVowels(vowels);
        }

        return wordCnt;
    }

    private boolean isAllVowels(Map<Character, Boolean> vowels) {
        for (boolean count : vowels.values()) {
           if (!count) {
               return false;
           }
        }
        return true;
    }

    private void resetVowels(Map<Character, Boolean> vowels) {
        for (char c : vowels.keySet()) {
            vowels.put(c, false);
        }
    }

}
