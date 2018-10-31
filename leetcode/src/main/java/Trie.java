import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 2/2/18.
 */
public class Trie {

    private final Node root;

    private static class Node {
        boolean leaf;
        Node[] siblings = new Node[26];
    }

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            int bucket = word.charAt(i) - 'a';
            if (node.siblings[bucket] == null) {
                node.siblings[bucket] = new Node();
            }
            node = node.siblings[bucket];
        }
        node.leaf = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            int bucket = word.charAt(i) - 'a';
            if (node.siblings[bucket]  == null) {
                return false;
            }
            node = node.siblings[bucket];
        }
        return node.leaf;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int bucket = prefix.charAt(i) - 'a';
            if (node.siblings[bucket] == null) {
                return false;
            }
            node = node.siblings[bucket];
        }
        return true;
    }

}
