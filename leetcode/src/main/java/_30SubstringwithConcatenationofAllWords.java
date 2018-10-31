import java.util.*;

/**
 * Created by anton on 17/9/18.
 */
public class _30SubstringwithConcatenationofAllWords {

    private static class Trie {
        Trie[] children = new Trie[26];
        int index = -1;
        int count = 0;
    }

    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0) {
            return new LinkedList<>();
        }
        Trie root = new Trie();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            Trie current = root;
            for (int i = 0; i < word.length(); i++) {
                int c = word.charAt(i) - 'a';
                if (current.children[c] == null) {
                    current.children[c] = new Trie();
                }
                current = current.children[c];
            }
            if (current.index == -1) {
                current.index = j;
            }
            current.count++;
            countMap.put(current.index, current.count);
        }
        List<Integer> substrings = new LinkedList<>();
        for (int i = 0; i < s.length() - words[0].length() * words.length + 1; i++) {
            if (xz(root, root, s, i, words.length , new HashMap<>(countMap))) {
                substrings.add(i);
            }
        }
        return substrings;
    }

    private boolean xz(Trie root, Trie current, String s, int pos, int length, Map<Integer, Integer> sequence) {
        if (length == 0) {
            return true;
        }
        if (pos == s.length()) {
            return false;
        }
        int c = s.charAt(pos) - 'a';
        Trie child = current.children[c];
        if (child != null) {
            int index = child.index;
            if (index > -1) {
                int count = sequence.get(index);
                boolean available = count > 0;
                if (available) {
                    sequence.put(index, count - 1);
                    length--;
                    return xz(root, root, s, pos + 1, length, sequence);
                } else {
                    return false;
                }
            } else {
                return xz(root, child, s, pos + 1, length, sequence);
            }
        } else {
            return false;
        }
    }

}
