/**
 * Created by anton on 20/7/17.
 */
public class _387FirstUniqueCharacterString {

    public int firstUniqChar(String s) {
        int[][] occurrences = new int[2][28];
        for (int i = s.length() - 1; i >= 0; i--) {
            int index = s.charAt(i) - 'a';
            occurrences[0][index]++;
            occurrences[1][index] = i;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 28; i++) {
            if (occurrences[0][i] == 1) {
                min = Math.min(min, occurrences[1][i]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public int firstUniqChar0(String s) {
        int[] occurrences = new int[28];
        for (int i = 0; i < s.length(); i++) {
            occurrences[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (occurrences[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
