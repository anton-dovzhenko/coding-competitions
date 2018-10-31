package gcj2015.round1c;

import gcj2015.round2.BKiddiePool;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by anton on 23/12/16.
 */
public class BTypewriterMonkey {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTypewriterMonkey.class.getResourceAsStream("/2015.round1c.B-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int K = Integer.parseInt(line[0]);
                int L = Integer.parseInt(line[1]);
                int S = Integer.parseInt(line[2]);
                String KString = sc.nextLine();
                String LString = sc.nextLine();
                double left = getLeftBananas(KString, LString, S);
                System.out.println(String.format("Case #%1$d: %2$.8f", i + 1, left));
            }
        }
    }

    public static double getLeftBananas(String K, String L, int S) {
        return maxBananas(K, L, S) - getAvgBananas(K, L, S);
    }

    public static int maxBananas(String K, String L, int S) {
        if (L.length() > S) {
            return 0;
        }

        for (int i = 0; i < L.length(); i++) {
            if (!K.contains(L.substring(i, i + 1))) {
                return 0;
            }
        }

        String printed = L;
        do {
            printed += L;
        } while (printed.length() <= S);
        printed = printed.substring(0, S);
        int index = 0;
        int max = 0;
        while (true) {
            index = printed.indexOf(L, index);
            if (index < 0) {
                break;
            }
            max++;
            index++;
        }

        return max;
    }

    public static double getAvgBananas(String K, String L, int S) {

        double probability = 1;
        for (char letter : L.toCharArray()) {
            double occurrences = 0;
            for (char letter2 : K.toCharArray()) {
                if (letter == letter2) {
                    occurrences++;
                }
            }
            probability *= occurrences / K.length();
        }
        return probability * (S - L.length() + 1);
    }

    public static double getAvgBananas2(String K, String L, int S) {
        List<String> strings = new ArrayList<>();
        strings.add("");
        for (int i = 0; i < S; i++) {
            final List<String> strings2 = new ArrayList<>();
            for (int j = 0; j < K.length(); j++) {
                for (String string : strings) {
                    String s = string + K.substring(j, j + 1);
                    strings2.add(s);
                }
            }
            strings = strings2;
        }

        double totalCount = pow(K.length(), S);
        double occurrences = 0;
        for (String string : strings) {
            int index = 0;
            while (index > -1) {
                index = string.indexOf(L, index);
                if (index >= 0) {
                    index++;
                    occurrences++;
                }
            }
        }
        return occurrences / totalCount;

    }

}
