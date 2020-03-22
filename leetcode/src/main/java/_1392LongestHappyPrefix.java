public class _1392LongestHappyPrefix {


    public String longestPrefix(String s) {

        long mod = (long) (1e9 + 7);
        int length = 0;
        long suffix = 0;
        long prefix = 0;
        long pow = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            prefix = (prefix * 128 + s.charAt(i)) % mod;
            suffix = (s.charAt(s.length() - i - 1) * pow + suffix) % mod;
            pow = (pow * 128) % mod;
            if (prefix == suffix) {
                length = i + 1;
            }
        }

        return s.substring(0, length);
    }

}
