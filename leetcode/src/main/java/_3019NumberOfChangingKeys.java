public class _3019NumberOfChangingKeys {

    public int countKeyChanges(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            int d = s.charAt(i) - s.charAt(i - 1);
            if (d != 0 && d != 32 && d != -32) {
                count++;
            }
        }
        return count;
    }

}
