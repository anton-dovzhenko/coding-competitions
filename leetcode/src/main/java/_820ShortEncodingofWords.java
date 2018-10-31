import java.util.Arrays;

/**
 * Created by anton on 22/4/18.
 */
public class _820ShortEncodingofWords {

    private static class SuffixTree {
        char c;
        SuffixTree[] nodes = new SuffixTree[26];
        int wordLength = -1;
    }

    public int minimumLengthEncoding(String[] words) {
        int charCount = 0;
        int wordCount = 0;
        SuffixTree tree = new SuffixTree();
        for (String word : words) {
            SuffixTree tempTree = tree;
            boolean added = false;

            for (int i = word.length() - 1; i >= 0; i--) {
                char c = word.charAt(i);
                if (tempTree.wordLength > -1) {
                    charCount -= tempTree.wordLength;
                    tempTree.wordLength = -1;
                    wordCount--;
                }
                int nodeIndex = c - 'a';
                if (tempTree.nodes[nodeIndex] == null) {
                    added = true;
                    tempTree.nodes[nodeIndex] = new SuffixTree();
                }
                tempTree = tempTree.nodes[nodeIndex];
            }
            if (added) {
                charCount += word.length();
                tempTree.wordLength = word.length();
                wordCount++;
            }
        }
        return charCount + wordCount;
    }

}
