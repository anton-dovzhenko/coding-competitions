public class _3216LexicographicallySmallestStringAfterASwap {

    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length() - 1; i++) {
            int d1 = sb.charAt(i) - '0';
            int d2 = sb.charAt(i + 1) - '0';
            if ((d1 + d2) % 2 == 0 && d1 > d2) {
                sb.setCharAt(i, s.charAt(i + 1));
                sb.setCharAt(i + 1, s.charAt(i));
                return sb.toString();
            }
        }
        return s;
    }

}
