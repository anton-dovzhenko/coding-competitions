public class _3042CountPrefixAndSuffixPairsI {

    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String w1 = words[i];
                String w2 = words[j];
                if (w1.length() > w2.length()) {
                    continue;
                }
                boolean match = true;
                for (int k = 0; k < w1.length(); k++) {
                    if (w1.charAt(k) != w2.charAt((k)) || w1.charAt(k) != w2.charAt(w2.length() - w1.length() + k)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }

}
