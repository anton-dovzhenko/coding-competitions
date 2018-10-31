package gcj2016.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 9/1/17.
 */
public class BRevengeOfThePancakes {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BRevengeOfThePancakes.class.getResourceAsStream("/2016.qualification.B-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String pancakes = sc.nextLine();
                int result = getNumberOfFlips(pancakes);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, result));
            }
        }
    }

    public static int getNumberOfFlips(String pancakes) {
        int flips = 0;
        for (int i = 1; i < pancakes.length(); i++) {
            if (pancakes.charAt(i) != pancakes.charAt(i - 1)) {
                flips++;
            }
        }
        if ('-' == pancakes.charAt(pancakes.length() - 1)) {
            flips++;
        }
        return flips;

    }
}
