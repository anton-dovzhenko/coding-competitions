package gcj2015.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class BInfiniteHouseOfPancakes {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BInfiniteHouseOfPancakes.class.getResourceAsStream("/2015.qualification.B-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                sc.nextLine();
                String line = sc.nextLine();
                String[] items = line.split(" ");
                int[] plates = new int[items.length];
                for (int j = 0; j < items.length; j++) {
                    plates[j] = Integer.parseInt(items[j]);
                }
                int additionalFriends = getMinutes(plates);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, additionalFriends));
            }
        }
    }

    public static int getMinutes(int[] plates) {
        int max = 0;
        for (int plate : plates) {
            if (plate > max) {
                max = plate;
            }
        }
        int lastMinutes = Integer.MAX_VALUE;
        for (int i = 1; i <= max; i++) {
            int minutes = 0;
            for (int plate : plates) {
                minutes += Math.ceil(1.0 * plate / i) - 1;
            }
            minutes += i;
            if (minutes < lastMinutes) {
                lastMinutes = minutes;
            }
        }
        return Math.min(lastMinutes, max);
    }
}
