package gcj2016.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;


/**
 * Created by anton on 9/1/17.
 */
public class ACountingSheep {

    public static void main(String ... args) throws IOException {
        try (InputStream in = ACountingSheep.class.getResourceAsStream("/2016.qualification.A-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                BigInteger N = new BigInteger(sc.nextLine());
                BigInteger result = getLastNumber(N);
                if (result != null) {

                    System.out.println(String.format("Case #%1$d: %2$d", i + 1, result));
                } else {
                    System.out.println(String.format("Case #%1$d: INSOMNIA", i + 1));
                }
            }
        }
    }

    public static BigInteger getLastNumber(BigInteger N) {
        if (N.equals(BigInteger.ZERO)) {
            return null;
        }
        BigInteger result = N;
        BigInteger count = BigInteger.ONE;
        boolean[] numbers = new boolean[10];
        while(!allNumbers(numbers)) {
            result = N.multiply(count);
            count = count.add(BigInteger.ONE);
            char[] chars = result.toString().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                numbers[chars[i] - '0'] = true;
            }
        }
        return result;
    }

    private static boolean allNumbers(boolean[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i]) {
                return false;
            }
        }
        return true;
    }
}
