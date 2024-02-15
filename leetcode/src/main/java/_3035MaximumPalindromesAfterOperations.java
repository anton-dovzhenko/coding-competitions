import java.util.Arrays;

public class _3035MaximumPalindromesAfterOperations {

    public int maxPalindromesAfterOperations(String[] words) {
        int[] letters = new int[26];
        int oddWords = 0;
        int oddLetters = 0;
        for (String word : words) {
            if (word.length() % 2 == 1) {
                oddWords++;
            }
            for (int i = 0; i < word.length(); i++) {
                letters[word.charAt(i) - 'a']++;
            }
        }
        for (int letter: letters) {
            if (letter % 2 == 1) {
                oddLetters++;
            }
        }
        oddLetters -= oddWords;
        int noPalindrome = 0;
        if (oddLetters > 0) {
            int[] sorted = Arrays.stream(words).mapToInt(String::length).sorted().toArray();
            for (int i = sorted.length - 1; oddLetters > 0; i--) {
                noPalindrome++;
                oddLetters -= (2 * (sorted[i] / 2));
            }
        }
        return words.length - noPalindrome;
    }

}
