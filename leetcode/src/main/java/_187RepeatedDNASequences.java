import java.util.*;

/**
 * Created by anton on 20/9/17.
 */
public class _187RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new LinkedHashSet<>();
        for (int i = 0; i < s.length() - 10; i++) {
            String target = s.substring(i, i + 10);
            if (!result.contains(target) && s.indexOf(target, i + 1) > -1) {
                result.add(target);
            }
        }
        return new ArrayList<>(result);
    }

    public List<String> findRepeatedDnaSequences2(String s) {
        Set<String> sequences = new HashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String target = s.substring(i, i + 10);
            if (!sequences.add(target)) {
                duplicates.add(target);
            }
        }
        return new ArrayList<>(duplicates);
    }

}
