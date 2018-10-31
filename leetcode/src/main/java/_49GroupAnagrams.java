import java.util.*;

/**
 * Created by anton on 13/1/18.
 */
public class _49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> group = anagrams.get(key);
            if (group == null) {
                group = new LinkedList<>();
                anagrams.put(key, group);
            }
            group.add(str);
        }
        return new ArrayList<>(anagrams.values());
    }

}
