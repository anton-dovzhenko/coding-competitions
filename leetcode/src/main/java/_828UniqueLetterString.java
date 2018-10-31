import java.util.*;

/**
 * Created by anton on 6/5/18.
 */
public class _828UniqueLetterString {

    public int uniqueLetterString4(String S) {
        HashMap<Character, Integer> cIndFirst = new HashMap<>();
        HashMap<Character, Integer> cIndLast = new HashMap<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            Integer ind = cIndLast.get(c);
            if (ind == null) {
                cIndFirst.put(c, -1);
            } else {
                Integer indPrev = cIndFirst.get(c);
                count += (ind - indPrev) * (i - ind);
                cIndFirst.put(c, ind);
            }
            cIndLast.put(c, i);
        }
        for (Map.Entry<Character, Integer> entry : cIndLast.entrySet()) {
            int ind = entry.getValue();
            int indPrev = cIndFirst.get(entry.getKey());
            count += (ind - indPrev) * (S.length() - ind);
        }
        return count;
    }

    public int uniqueLetterString(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            HashSet<Character> unique = new HashSet<>();
            HashSet<Character> duplicated = new HashSet<>();
            for (int j = i; j < S.length(); j++) {
                char c = S.charAt(j);
                if (duplicated.contains(c)) {
                    count += unique.size();
                } else {
                    if (unique.contains(c)) {
                        count += unique.size() - 1;
                        unique.remove(c);
                        duplicated.add(c);
                    } else {
                        unique.add(c);
                        count += unique.size();
                    }
                }
            }
        }
        return count;
    }

    public int uniqueLetterString2(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            HashMap<Character, Integer> cMap = new HashMap<>();
            int uniqueCount = 0;
            for (int j = i; j < S.length(); j++) {
                char c = S.charAt(j);
                int cCount = cMap.getOrDefault(c, 0);
                if (cCount == 0) {
                    uniqueCount++;
                } else if (cCount == 1) {
                    uniqueCount--;
                }
                count += uniqueCount;
                cMap.put(c, cCount + 1);
            }
        }
        return count;
    }

    public int uniqueLetterString3(String S) {
        HashMap<Character, LinkedList<Integer>> cIndexes = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            LinkedList<Integer> positions = cIndexes.get(c);
            if (positions == null) {
                positions = new LinkedList<>();
                cIndexes.put(c, positions);
            }
            positions.add(i);
        }
        int count = 0;
        for (Map.Entry<Character, LinkedList<Integer>> entry : cIndexes.entrySet()) {
            List<Integer> positions = entry.getValue();
            positions.add(0, -1);
            positions.add(S.length());
            for (int i = 1; i < positions.size() - 1; i++) {
                int left = positions.get(i) - positions.get(i - 1);
                int right= positions.get(i + 1) - positions.get(i);
                count += left * right;
            }
        }
        return count;
    }

}
