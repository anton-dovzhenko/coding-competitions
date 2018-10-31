package gcj2016.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anton on 9/1/17.
 */
public class CCoinJam {

    private final static int[] bases = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String ... args) throws IOException {
        try (InputStream in = CCoinJam.class.getResourceAsStream("/2016.qualification.C-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int N = Integer.parseInt(line[0]);
                int J = Integer.parseInt(line[1]);
                List<CoinJam> result = getCoinJams(N, J);
                System.out.println(String.format("Case #%1$d:", i + 1));
                for (CoinJam coin : result) {
                    System.out.print(coin.coin);
                    for (int j = 0; j < coin.divisors.length; j++) {
                        System.out.print(" ");
                        System.out.print(coin.divisors[j]);
                    }
                    System.out.println();
                }
            }
        }
    }

    public static List<CoinJam> getCoinJams(int N, int J) {
        List<CoinJam> result = new ArrayList<>();

        long[] first2Base = new long[N];
        first2Base[0] = 1;
        first2Base[N - 1] = 1;

        long[] last2Base = new long[N];
        Arrays.fill(last2Base, 1);
        long first = convertTo10(2, first2Base);
        long last = convertTo10(2, last2Base);

        for (long i = first; i <= last; i++) {
            if (result.size() == J) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            CoinJam coin = validate(i, N);
            if (coin.valid) {
                result.add(coin);
            }

        }

        return result;
    }

    public static CoinJam validate(long i, int N) {
        CoinJam coin = new CoinJam();
        coin.coin = Long.toBinaryString(i);
        coin.divisors = new long[bases.length];
        coin.numbers = new long[bases.length];
        char[] binaryString = coin.coin.toCharArray();
        long[] number = new long[N];
        for (int k = 0; k < N; k++) {
            number[k] = binaryString[k] - '0';
        }
        boolean valid = true;
        for (int j = 0; j < bases.length; j++) {
            long convertedNumber = convertTo10(bases[j], number);
            long divisor = getDivisor(convertedNumber);
            coin.divisors[j] = divisor;
            coin.numbers[j] = convertedNumber;
            if (divisor == -1) {
                valid = false;
                break;
            }
        }
        coin.valid = valid;
        return coin;
    }

    private static long getDivisor(long number) {
        for (long i = 2; i < 1 + Math.sqrt(number); i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return -1;
    }

    private static long convertTo10(long base, long[] number) {
        long value = 0;
        for (int i = 0; i < number.length; i++) {
            value += number[i] * (long) Math.pow(base, number.length - 1 - i);
        }
        return value;
    }



    static class CoinJam {

        String coin;
        long[] numbers;
        long[] divisors;
        boolean valid;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CoinJam coinJam = (CoinJam) o;

            if (!coin.equals(coinJam.coin)) return false;
            if (!Arrays.equals(numbers, coinJam.numbers)) return false;
            return Arrays.equals(divisors, coinJam.divisors);
        }

        @Override
        public int hashCode() {
            int result = coin.hashCode();
            result = 31 * result + Arrays.hashCode(numbers);
            result = 31 * result + Arrays.hashCode(divisors);
            return result;
        }

        @Override
        public String toString() {
            return "CoinJam{" +
                    "coin='" + coin + '\'' +
                    ", numbers=" + Arrays.toString(numbers) +
                    ", divisors=" + Arrays.toString(divisors) +
                    ", valid=" + valid +
                    '}';
        }
    }

}
