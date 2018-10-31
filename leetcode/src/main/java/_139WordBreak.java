import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by anton on 22/1/18.
 */
public class _139WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
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
