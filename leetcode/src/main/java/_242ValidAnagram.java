/**
 * Created by anton on 2/2/17.
 */
public class _242ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] charCount = new int[28];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
