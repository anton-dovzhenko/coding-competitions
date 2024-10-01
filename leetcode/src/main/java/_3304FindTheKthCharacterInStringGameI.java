public class _3304FindTheKthCharacterInStringGameI {

    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k + 1) {
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                sb.append((char) ('a' + (sb.charAt(i) - 'a' + 1) % 26));
            }
        }
        return sb.charAt(k - 1);
    }

}
