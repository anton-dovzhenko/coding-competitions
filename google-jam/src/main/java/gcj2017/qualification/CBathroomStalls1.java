package gcj2017.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 8/4/17.
 */
public class CBathroomStalls1 {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTidyNumbers.class.getResourceAsStream("/2017.qualification.C-small-2-attempt0.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int[] result = getLast(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                System.out.println(String.format("Case #%s: %s %s", i + 1, result[0], result[1]));
            }
        }
    }



    protected static int[] getLast(int N, int K) {
        if (N == K) {
            return new int[] {0, 0};
        }
        while (K > 1) {
            boolean nEven = N % 2 == 0;
            boolean kEven = K % 2 == 0;
            if (nEven && kEven) {
                N = N/2;
                K = K/2;
            }
            if (nEven && !kEven) {
                N = N/2 - 1;
                K = (K - 2)/2 + 1;
            }
            if (!nEven && kEven) {
                N = N/2;
                K = K/2;
            }
            if (!nEven && !kEven) {
                N = N/2;
                K = K/2;
            }

        }

        return new int[] {N / 2, (N - 1) / 2};
    }
}
