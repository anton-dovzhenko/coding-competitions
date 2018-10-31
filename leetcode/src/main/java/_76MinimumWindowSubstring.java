import java.util.*;

/**
 * Created by anton on 1/1/18.
 */
public class _76MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        int[] tCountMap = new int[256];
        Map<Character, LinkedList<Integer>> sIndexMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tCountMap[t.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            LinkedList<Integer> indices = sIndexMap.get(c);
            if (indices == null) {
                indices = new LinkedList<>();
                sIndexMap.put(c, indices);
            }
            indices.add(i);
        }
        int min = 0;
        int max = s.length() - 1;
        int length = s.length();
        int matchedCount = 0;
        TreeSet<Integer> indicesSet = new TreeSet<>();
        boolean matched = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sIndexMap.containsKey(c)) {
                if (matched) {
                    int nextLength = 1 + indicesSet.last() - indicesSet.first();
                    if (nextLength < length) {
                        length = nextLength;
                        min = indicesSet.first();
                        max = indicesSet.last();
                    }
                    indicesSet.add(i);
                    LinkedList<Integer> list = sIndexMap.get(c);
                    indicesSet.remove(list.get(0));
                    list.removeFirst();
                } else {
                    if (tCountMap[c] > 0) {
                        matchedCount++;
                        tCountMap[c]--;
                        indicesSet.add(i);
                    } else {
                        indicesSet.add(i);
                        LinkedList<Integer> list = sIndexMap.get(c);
                        indicesSet.remove(list.get(0));
                        list.removeFirst();
                    }
                }
                matched = matchedCount == t.length();
            }

        }
        if (matched) {
            int nextLength = 1 + indicesSet.last() - indicesSet.first();
            if (nextLength < length) {
                min = indicesSet.first();
                max = indicesSet.last();
            }
        }
        return matched ? s.substring(min, max + 1) : "";
    }



}
