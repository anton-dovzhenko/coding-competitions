package gcj2017.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 8/4/17.
 */
public class AOversizedPancakeFlipper {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BTidyNumbers.class.getResourceAsStream("/2017.qualification.A-large-attempt0.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int result = getMinFlips(line[0], Integer.parseInt(line[1]));
                String value = result == -1 ? "IMPOSSIBLE" : Integer.toString(result);
                System.out.println("Case #" + (i + 1) + ": " + value);
            }
        }
    }

    protected static int getMinFlips(String S, int K) {
        int flips = 0;
        char[] array = S.toCharArray();
        for (int i = 0; i <= array.length - K; i++) {
            if (array[i] == '-') {
                for (int j = i; j < i + K; j++) {
                    array[j] = (array[j] == '-') ? '+' : '-';
                }
                flips++;
            }
        }
        for (int i = array.length - K + 1; i < array.length; i++) {
            if (array[i] == '-') {
                return -1;
            }
        }
        return flips;
    }

}
