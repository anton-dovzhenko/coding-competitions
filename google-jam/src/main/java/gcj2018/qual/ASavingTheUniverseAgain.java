package gcj2018.qual;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * ASavingTheUniverseAgain
 * Created by anton on 7/4/18.
 */
public class ASavingTheUniverseAgain {

    public static void main(String ... args) throws IOException {
        try (InputStream in = ASavingTheUniverseAgain.class.getResourceAsStream("/2018.quali.test.my.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int result = output1(Integer.parseInt(line[0]), line[1]);
                System.out.println(String.format("Case #%s: %s", i + 1, result == -1 ? "IMPOSSIBLE" : result));
            }
        }
    }

    private static int output1(int D, String P) {
//        System.out.println("D = " + D + " P = " + P);
        int cIndex = -1;
        for (int i = 0; i < P.length(); i++) {
            if (P.charAt(i) == 'C') {
                cIndex = i;
                break;
            }
        }
        if (cIndex == -1) {
            return P.length() > D ? -1 : 0;
        }
        int oneShots = cIndex;
        int twoShots = P.length() - (cIndex + 1);
        int damage = oneShots + 2 * twoShots;
        if (damage <= D) {
            return 0;
        }
        return twoShots * 2 - (D - oneShots);
    }

    private static int output2(int D, String P) {
        int sCount = 0;
        int cCount = 0;
        for (int i = 0; i < P.length(); i++) {
            if (P.charAt(i) == 'C') {
                cCount++;
            } else {
                sCount++;
            }
        }
        if (sCount > D) {
            return -1;
        }
        int maxCBeforeShoot = (int) (Math.log(D) / Math.log(2));
        return -1;
    }
}
