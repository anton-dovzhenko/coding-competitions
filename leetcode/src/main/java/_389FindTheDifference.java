/**
 * Created by anton on 1/2/17.
 */
public class _389FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] charCount = new int[28];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            if (--charCount[index] < 0) {
                return (char) (index + 'a');
            };
        }
        throw new IllegalStateException();
    }

    public char findTheDifference2(String s, String t) {
        char result = t.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i + 1);
        }
        return result;
    }
}
