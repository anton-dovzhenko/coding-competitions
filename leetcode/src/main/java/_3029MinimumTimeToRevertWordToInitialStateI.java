public class _3029MinimumTimeToRevertWordToInitialStateI {

    public int minimumTimeToInitialState(String word, int k) {
        int s = 0;
        for (; s < word.length() / k; s++) {
            if (word.startsWith(word.substring((s + 1) * k))) {
                break;
            }
        }
        return s + 1;
    }

}
