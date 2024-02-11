public class _3031MinimumTimeToRevertWordToInitialStateII {

    public int minimumTimeToInitialState(String word, final int k) {
        int wl = word.length();
        int s = 0;
        long[] sums = new long[wl];
        sums[wl - 1] = word.charAt(wl - 1);
        for (int i = wl - 2; i >= 0; i--) {
            sums[i] = sums[i + 1] + word.charAt(i);
        }
        for (; s < word.length() / k; s++) {
            if ((s + 1) * k >= wl) {
                break;
            }
            boolean match = sums[(s + 1) * k] == sums[0] - sums[wl - (s + 1) * k];
            if (match) {
                for (int i = word.length() - (s + 1) * k - 1; i >= 0; i--) {
                    if (word.charAt(i) != word.charAt(i + (s + 1) * k)) {
                        match = false;
                        break;
                    }
                }
            }
            if (match) {
                break;
            }
        }
        return s + 1;
    }

}
