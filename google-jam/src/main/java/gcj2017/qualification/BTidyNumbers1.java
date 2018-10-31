package gcj2017.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 8/4/17.
 */
public class BTidyNumbers1 {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTidyNumbers1.class.getResourceAsStream("/2017.qualification.B-large-attempt0.in")
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
        while (N > 1) {
            long next = nextNumber(N);
            if (N == next) {
                return N;
            } else {
                N = next;
            }
        }
        return 1;
    }

    private static long nextNumber(long n) {
        long cache = n;
        long lastDigit = Long.MAX_VALUE;
        int rounds = 0;
        while (n > 0) {
            long temp = n % 10;
            if (temp <= lastDigit) {
                lastDigit = temp;
            } else {
                return cache - (cache % (long) Math.pow(10, rounds)) - 1;
            }
            n = n / 10;
            rounds++;
        }
        return cache;
    }
}
//99999999999999999
//111111111111111110