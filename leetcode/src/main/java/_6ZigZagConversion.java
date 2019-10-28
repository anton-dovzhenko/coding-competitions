public class _6ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] converted = new char[s.length()];
        int zzLength = numRows * 2 - 2;
        int zzCount = s.length() / zzLength;
        int remainder = s.length() % zzLength;
        int[] start = new int[numRows];
        start[1] = zzCount + Math.min(1, s.length() % zzLength);
        for (int i = 2; i < numRows; i++) {
            start[i] = start[i - 1] + 2 * zzCount;
            if (remainder >= i) {
                start[i]++;
            }
            if (remainder > numRows - 1 && (remainder - numRows - 2) >= (numRows - 2 - i % numRows)) {
                start[i]++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int mod = i % zzLength;
            int index;
            if (mod <= numRows - 1) {
                index = mod;
            } else {
                index = zzLength - mod;
            }
            converted[start[index]] = s.charAt(i);
            start[index]++;
        }
        return new String(converted);
    }

}
