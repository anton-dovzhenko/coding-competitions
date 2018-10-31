/**
 * Created by anton on 20/8/18.
 */
public class _443StringCompression {

    public int compress(char[] chars) {
        int count = 0;
        int cCount = 1;
        int prevChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (c == prevChar) {
                cCount++;
            } else {
                count += getIncrement(cCount);
                cCount = 1;
                prevChar = c;
            }
        }
        count += getIncrement(cCount);
        return count;
    }

    private int getIncrement(int cCount) {
        int increment = 1;
        if (cCount > 1) {
            increment += 1 + Math.log10(cCount);
        }
        return increment;
    }

    public static void main(String ... args) {
        System.out.println(Math.log10(9));
        System.out.println(Math.log10(10));
        System.out.println(Math.log10(11));
        System.out.println(Math.log10(99));
        System.out.println(Math.log10(100));
        System.out.println(new _443StringCompression().compress(new char[] {'a','a','b','b','c','c','c'}));
    }

}
