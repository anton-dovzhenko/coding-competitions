public class _3517SmallestPalindromicRearrangementI {

    public String smallestPalindrome(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder start = new StringBuilder();
        String middle = "";
        for (int i = 0; i < count.length; i++) {
            char symbol = (char) ('a' + i);
            if (count[i] % 2 == 1) {
                middle = Character.toString(symbol);
            }
            for (int j = 0; j < count[i] / 2; j++) {
                start.append(symbol);
            }
        }
        return start + middle + start.reverse();
    }

}
