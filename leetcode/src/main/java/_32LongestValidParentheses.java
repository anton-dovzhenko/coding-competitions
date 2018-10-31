/**
 * Created by anton on 5/9/18.
 */
public class _32LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int leftCount = 0;
        int rightCount = 0;
        int start = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftCount++;
            } else {
                rightCount++;
            }
            if (rightCount > leftCount) {
                rightCount = 0;
                leftCount = 0;
                start = i + 1;
            } else if (rightCount == leftCount){

            }
        }
        return 0;
    }

}
