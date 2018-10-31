/**
 * Created by anton on 1/2/17.
 */
public class _258AddDigits {

    public int addDigits(int num) {

        while (num > 9) {
            int nextNum = 0;
            while (num > 0) {
                nextNum += num % 10;
                num /= 10;
            }
            num = nextNum;
        }
        return num;
    }

    public int addDigits2(int num) {
        return 1 + (num - 1) % 9;
    }

}
