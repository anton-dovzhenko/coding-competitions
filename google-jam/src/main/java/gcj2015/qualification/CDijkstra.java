package gcj2015.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by anton on 13/12/16.
 */
public class CDijkstra {

    private static int[][] matrix = new int[][] {
          {1,  2,  3,  4}
        , {2, -1,  4, -3}
        , {3, -4, -1,  2}
        , {4,  3, -2, -1}
    };


    public static void main(String ... args) throws IOException {
        try (InputStream in = CDijkstra.class.getResourceAsStream("/2015.qualification.C-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String line = sc.nextLine();
                long multiplier = Long.parseLong(line.split(" ")[1]);
                String value = sc.nextLine();
                boolean possible = checkIfPossible(value, multiplier);

                boolean ijk = possible;
                if (possible) {
                    StringBuilder sb = new StringBuilder();
                    for (long j = 0; j < multiplier; j++) {
                        sb.append(value);
                    }
                    ijk = isIjk(sb.toString());
                }
                System.out.println(String.format("Case #%1$d: %2$s", i + 1, ijk ? "YES" : "NO"));
            }
        }
    }

    public static int[] stringToInt(String value) {
        int[] chars = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            chars[i] = value.charAt(i) - 103;
        }
        return chars;
    }

    public static boolean checkIfPossible(String value, long multiplier) {
        int[] chars = stringToInt(value);
        int mult = multiply(chars, 0, chars.length - 1);
        int result = mult;
        for (long i = 1; i < multiplier; i++) {
            result = multiply(result, mult);
        }
        return result == -1;
    }


    public static boolean isIjk(String value, long multiplier) {
        return false;
    }

    public static boolean isIjk(String value) {
        int[] chars = stringToInt(value);

        int lastFirstVal = chars[0];
        for (int i = 0; i < chars.length - 2; i++) {
            if (i > 0) {
                lastFirstVal = multiply(lastFirstVal, chars[i]);
            }
            if (lastFirstVal != 2) {
                continue;
            }

            int lastSecondVal = chars[i + 1];
            for (int j = i + 1; j < chars.length - 1; j++) {
                if (j > i + 1) {
                    lastSecondVal = multiply(lastSecondVal, chars[j]);
                }

                if (lastSecondVal == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int multiply(int[] chars, int start, int end) {
        int result = chars[start];
        for (int i = start + 1; i <= end; i++) {
            result = multiply(result, chars[i]);
        }
        return result;
    }

    private static int multiply(int ch1, int ch2) {
        int sign = ch1 * ch2 > 0 ? 1 : -1;
        int result = matrix[abs(ch1) - 1][abs(ch2) - 1];
        return sign * result;

    }
}
