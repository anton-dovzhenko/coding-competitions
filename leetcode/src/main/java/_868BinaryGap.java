/**
 * Created by anton on 15/7/18.
 */
public class _868BinaryGap {

    public int binaryGap(int N) {
        String b = Integer.toBinaryString(N);
        int max = 0;
        int last = -1;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                if (last > -1) {
                    max = Math.max(max, i - last);
                }
                last = i;
            }
        }
        return max;
    }

}
