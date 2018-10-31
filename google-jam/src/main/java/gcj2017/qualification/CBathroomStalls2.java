package gcj2017.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by anton on 8/4/17.
 */
public class CBathroomStalls2 {

    private final static BigInteger TWO = BigInteger.valueOf(2);

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTidyNumbers.class.getResourceAsStream("/2017.qualification.C-large-attempt0.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                BigInteger[] result = getLast(new BigInteger(line[0]), new BigInteger(line[1]));
                System.out.println(String.format("Case #%s: %s %s", i + 1, result[0], result[1]));
            }
        }
    }



    protected static BigInteger[] getLast(BigInteger N, BigInteger K) {
        if (N.equals(K)) {
            return new BigInteger[] {BigInteger.ZERO, BigInteger.ZERO};
        }
        while (K.compareTo(BigInteger.ONE) > 0) {
            boolean nEven = N.mod(TWO).equals(BigInteger.ZERO);
            boolean kEven = K.mod(TWO).equals(BigInteger.ZERO);
            if (nEven && kEven) {
                N = N.divide(TWO);
                K = K.divide(TWO);
            }
            if (nEven && !kEven) {
                N = N.divide(TWO).subtract(BigInteger.ONE);
                K = K.subtract(TWO).divide(TWO).add(BigInteger.ONE);
            }
            if (!nEven && kEven) {
                N = N.divide(TWO);
                K = K.divide(TWO);
            }
            if (!nEven && !kEven) {
                N = N.divide(TWO);
                K = K.divide(TWO);
            }

        }

        return new BigInteger[] {N.divide(TWO), N.subtract(BigInteger.ONE).divide(TWO)};
    }
}
