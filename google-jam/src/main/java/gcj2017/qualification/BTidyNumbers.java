package gcj2017.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by anton on 8/4/17.
 */
public class BTidyNumbers {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTidyNumbers.class.getResourceAsStream("/2017.qualification.B-small-attempt0.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                long N = new Long(sc.nextLine());
                long result = getLastTidyNumber(N);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, result));
            }
        }
    }

    protected static long getLastTidyNumber(long N) {
        for (long i = N; i >= 1; i--) {
            if (isTidy(i)) {
                return i;
            }
        }
        return 1;
    }

    private static boolean isTidy(long n) {
        long lastDigit = Long.MAX_VALUE;
        while (n > 0) {
            long temp = n % 10;
            if (temp <= lastDigit) {
                lastDigit = temp;
            } else {
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
//99999999999999999
//111111111111111110