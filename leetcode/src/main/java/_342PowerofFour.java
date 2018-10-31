/**
 * Created by anton on 31/1/18.
 */
public class _342PowerofFour {

    public boolean isPowerOfFour(int num) {
        if (num == 1) {
            return true;
        }
        while (num % 4 == 0 && num > 0) {
            num = num / 4;
            if (num == 1) {
                return true;
            }
        }
        return false;
    }

}
