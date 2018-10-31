/**
 * Created by anton on 18/5/18.
 */
public class _233NumberofDigitOne {

    public int countDigitOne(int n) {
        int count = 0;
        while (n >= 0) {
            int digit = n % 10;
            n = n / 10;
            count += n;
//            if (digit == 0) {
//
//            } else (digit == 1) {
//
//            } else {
//
//            }
        }
        return count;
    }

    public static void main(String ... args) {
        System.out.println(new _233NumberofDigitOne().countDigitOne(1));
        System.out.println(new _233NumberofDigitOne().countDigitOne(9));
        System.out.println(new _233NumberofDigitOne().countDigitOne(10));
        System.out.println(new _233NumberofDigitOne().countDigitOne(11));
        System.out.println(new _233NumberofDigitOne().countDigitOne(12));
        System.out.println(new _233NumberofDigitOne().countDigitOne(19));
        System.out.println(new _233NumberofDigitOne().countDigitOne(21));
    }

}
