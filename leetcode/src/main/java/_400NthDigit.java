/**
 * Created by anton on 24/7/17.
 */
public class _400NthDigit {

    public int findNthDigit(int n) {
        int digits = 0;
        long upperBound = 0;
        do {
            digits++;
            long increment = digits * 9 * (long) Math.pow(10, digits - 1);
            upperBound += increment;
            System.out.println("increment = " + increment);
            System.out.println("upperBound = " + upperBound);
        } while (n > upperBound);

        long lowerBound = upperBound - digits * 9 * (long) Math.pow(10, digits - 1);
        long remainder = n - lowerBound;
        long lowerNumber = (long) Math.pow(10, digits - 1);

        long number = lowerNumber + (remainder - 1) / digits;
        int position = (int) (remainder % digits);
        if (position == 0) position = digits;
        return Long.toString(number).charAt(position - 1) - '0';
    }

}
