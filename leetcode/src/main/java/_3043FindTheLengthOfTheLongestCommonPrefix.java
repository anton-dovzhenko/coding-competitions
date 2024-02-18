public class _3043FindTheLengthOfTheLongestCommonPrefix {

    public static final class Trie {
        Trie[] nodes = new Trie[10];
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int longest = 0;
        Trie trie = new Trie();
        for (int n1 : arr1) {
            String sn1 = n1 + "";
            Trie current = trie;
            for (int i = 0; i < sn1.length(); i++) {
                int n = sn1.charAt(i) - '0';
                if (current.nodes[n] == null) {
                    current.nodes[n] = new Trie();
                }
                current = current.nodes[n];
            }
        }
        for (int n : arr2) {
            String sn = n + "";
            int common = 0;
            Trie current = trie;
            while (common < sn.length() && current.nodes[sn.charAt(common) - '0'] != null) {
                current = current.nodes[sn.charAt(common) - '0'];
                common++;
            }
            longest = Math.max(longest, common);
        }
        return longest;
    }

}
