/**
 * Created by anton on 9/8/17.
 */
public class _383RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[28];
        for (int i = 0; i < magazine.length(); i++) {
            charCount[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            charCount[index]--;
            if (charCount[index] < 0) {
                return false;
            }
        }
        return true;
    }

}
