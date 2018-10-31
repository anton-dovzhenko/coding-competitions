/**
 * Created by anton on 16/2/17.
 */
public class _58LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int lastWorldEnd = -1;
        int lastSpace = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (lastWorldEnd == -1 && s.charAt(i) != ' ') {
                lastWorldEnd = i;
            } else if (lastWorldEnd > -1 && s.charAt(i) == ' ') {
                lastSpace = i;
                break;
            }
        }
        return lastWorldEnd - lastSpace;
    }

}
