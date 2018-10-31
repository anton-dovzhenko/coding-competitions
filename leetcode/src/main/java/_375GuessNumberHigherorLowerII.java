/**
 * Created by anton on 31/1/18.
 */
public class _375GuessNumberHigherorLowerII {

    public int getMoneyAmount(int n) {
        System.out.println("getMoneyAmount = " + n);
        int start = 1;
        int end = n;
        int amount = 0;
        while (start + 1 < end) {
            int nextAmount = (end + start) / 2 + (end - start) % 2;
            if (end - nextAmount == 1) {
                end = nextAmount - 1;
            } else {
                start = nextAmount + 1;
            }
            System.out.println("start = " + start);
            System.out.println("end = " + end);
            System.out.println("nextAmount = " + nextAmount);
            amount += nextAmount;
        }
        if (start < end) {
            amount += start;
        }
        return amount;
    }
}
