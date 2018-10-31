/**
 * Created by anton on 9/3/18.
 */
public class _507PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        int target = 0;
        for (int i = (int) Math.sqrt(num); i > 0; i--) {
            if (num % i == 0) {
                target += i + num / i;

            }
        }
        return num == target;
    }

}
