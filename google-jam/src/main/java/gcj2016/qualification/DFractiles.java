package gcj2016.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by anton on 10/1/17.
 */
public class DFractiles {

    public static void main(String ... args) throws IOException {
        try (InputStream in = DFractiles.class.getResourceAsStream("/2016.qualification.D-small-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String[] line = sc.nextLine().split(" ");
                int K = Integer.parseInt(line[0]);
                int C = Integer.parseInt(line[1]);
                int S = Integer.parseInt(line[2]);
                long[] tiles = getTiles(K, C, S);
                System.out.print(String.format("Case #%1$d: ", i + 1));
                for (int j = 0; j < tiles.length; j++) {
                    System.out.print(" ");
                    System.out.print(tiles[j]);
                }
                System.out.println();
            }
        }
    }

    public static long[] getTiles(int K, int C, int S) {
        //assume that S == K
        long[] tiles = new long[K];
        long multiplier = (long) pow(K, C - 1);
        for (int i = 0; i < K; i++) {
            tiles[i] = i * multiplier + 1;
        }
        return tiles;
    }

}
