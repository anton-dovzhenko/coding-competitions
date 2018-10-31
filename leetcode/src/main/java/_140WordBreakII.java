import java.util.*;

/**
 * Created by anton on 22/1/18.
 */
public class _140WordBreakII {

    public List<String> wordBreak2(String s, List<String> wordDict) {
        Map<String, List<String>> map = new HashMap<>();
        return null;
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        if (!isWordBreak(s, wordDict)) {
            return new LinkedList<>();
        }
        Map<Integer, List<String>> sentences = new HashMap<>();
        sentences.put(0, new LinkedList<>(Collections.singletonList("")));
        for (int i = 0; i < s.length(); i++) {
            List<String> ss = sentences.get(i);
            if(ss != null) {
                for (String word : wordDict) {
                    if (s.startsWith(word, i)) {
                        for (String s0 : ss) {
                            List<String> ss2 = sentences.get(i + word.length());
                            if (ss2 == null) {
                                ss2 = new LinkedList<>();
                                sentences.put(i + word.length(), ss2);
                            }
                            ss2.add((s0 + " " + word).trim());
                        }
                    }
                }
                sentences.remove(i);
            }
        }
        return sentences.get(s.length()) == null ? new LinkedList<>() : sentences.get(s.length());
    }

    private boolean isWordBreak(String s, List<String> wordDict) {
        boolean[] covered = new boolean[s.length() + 1];
        covered[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if(covered[i]) {
                for (String word : wordDict) {
                    if (s.startsWith(word, i)) {
                        covered[i + word.length()] = true;
                    }
                }
            }
        }
        return covered[covered.length - 1];
    }



}
