/**
 * Created by anton on 5/2/17.
 */
public class _14LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int nextIndex = 0;
        String reference = strs[0];
        while (nextIndex < reference.length()) {
            boolean common = true;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < nextIndex + 1 || strs[i].charAt(nextIndex) != reference.charAt(nextIndex)) {
                    common = false;
                    break;
                }
            }
            if (common) {
                nextIndex++;
            } else {
                break;
            }
        }
        return reference.substring(0, nextIndex);
    }

}
