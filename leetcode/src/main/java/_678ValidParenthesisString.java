/**
 * Created by anton on 16/7/18.
 */
public class _678ValidParenthesisString {

    public boolean checkValidString2(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case '(':
                    reverse += ')';
                    break;
                case ')':
                    reverse += '(';
                    break;
                default:
                    reverse += '*';
            }
        }
//        System.out.println("s = " + s);
//        System.out.println("reverse = " + reverse);
        return checkValidString0(s) && checkValidString0(reverse);
    }

    private boolean checkValidString0(String s) {
        int left = 0;
        int right = 0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    left++;
                    break;
                case ')':
                    right++;
                    break;
                default:
                    star++;
            }
            if (right > left) {
                if (right > left + star) {
                    return false;
                } else {
                    star = star - (right - left);
                    left = right;
                }
            }
        }
        return star >= Math.abs(right - left);
    }


    public boolean checkValidString(String s) {
        return checkValidString(s, 0, 0, 0);
    }

    private boolean checkValidString(String s, int i, int left, int right) {
        if (right > left) {
            return false;
        }
        if (i == s.length()) {
            return left == right;
        }
        if (s.charAt(i) == '(') {
            return checkValidString(s, i + 1, left + 1, right);
        }
        if (s.charAt(i) == ')') {
            return checkValidString(s, i + 1, left, right + 1);
        }
        return checkValidString(s, i + 1, left + 1, right) || checkValidString(s, i + 1, left, right + 1)
                || checkValidString(s, i + 1, left, right);
    }

}
