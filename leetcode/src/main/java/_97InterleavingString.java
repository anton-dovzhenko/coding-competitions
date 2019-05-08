import java.util.Arrays;

public class _97InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }
        if (s3.length() == 0) {
            return true;
        }
        boolean[][] visited = new boolean[s1.length() + 1][s2.length() + 1];
        return isInterleave(s1, s2, s3, 0, 0, 0, visited);
    }

    private boolean isInterleave(String s1, String s2, String s3, int i1, int i2, int i3, boolean[][] visited) {
        if (visited[i1][i2]) {
            return false;
        }
        visited[i1][i2] = true;
        if (i1 < s1.length() && i2 < s2.length()) {
            char c1 = s1.charAt(i1);
            char c2 = s2.charAt(i2);
            char c3 = s3.charAt(i3);
            return  c1 == c3 && isInterleave(s1, s2, s3, i1 + 1, i2, i3 + 1, visited)
                    || c2 == c3 && isInterleave(s1, s2, s3, i1, i2 + 1, i3 + 1, visited);
        } else if (i1 < s1.length()) {
            return s3.substring(i3).equals(s1.substring(i1));
        } else if (i2 < s2.length()) {
            return s3.substring(i3).equals(s2.substring(i2));
        }
        return false;
    }

}
