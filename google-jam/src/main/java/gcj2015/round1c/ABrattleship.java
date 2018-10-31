package gcj2015.round1c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 23/12/16.
 */
public class ABrattleship {

    public static void main(String ... args) throws IOException {
        try (InputStream in = ABrattleship.class.getResourceAsStream("/2015.round1c.A-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int index = getMoveCount(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, index));
            }
        }
    }

    public static int getMoveCount(int R, int C, int W) {
        int CRem = C % W;
        int Cfull = (C - CRem) / W;
        return Cfull * R + (CRem > 0 ? W : W - 1);
    }
}
